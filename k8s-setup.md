- Cập nhật OS

```bash
sudo apt update && sudo apt upgrade -y
```

- Cài các gói cơ bản

```bash
sudo apt install -y gpg apt-transport-https ca-certificates curl
```

- Tắt Swap trên ubuntu

```bash
sudo swapoff -a
sudo sed -i '/ swap / s/^/#/' /etc/fstab
```

- Đổi hostname ubuntu

```bash
sudo hostnamectl set-hostname master
```

- Update hosts file trên ubuntu

```bash
cat <<EOF | sudo tee -a /etc/hosts
10.20.0.10 master
EOF
```

- Cài đặt container runtime (Containerd)

```bash
sudo apt install -y containerd
sudo mkdir -p /etc/containerd
containerd config default | sudo tee /etc/containerd/config.toml
sudo sed -i 's/SystemdCgroup = false/SystemdCgroup = true/' /etc/containerd/config.toml
sudo systemctl restart containerd
sudo systemctl enable containerd
```

- Cài đăt kubeadm, kubelet, kubectl

```bash
# 1️⃣ Xóa repo và key cũ (nếu có)
sudo rm -f /etc/apt/sources.list.d/kubernetes.list
sudo rm -f /usr/share/keyrings/kubernetes-archive-keyring.gpg

# 2️⃣ Thêm GPG key mới đúng chuẩn (sử dụng ASCII key)
curl -fsSL https://pkgs.k8s.io/core:/stable:/v1.30/deb/Release.key | \
sudo gpg --dearmor -o /usr/share/keyrings/kubernetes-archive-keyring.gpg

# 3️⃣ Thêm repo mới
echo "deb [signed-by=/usr/share/keyrings/kubernetes-archive-keyring.gpg] \
https://pkgs.k8s.io/core:/stable:/v1.30/deb/ /" | \
sudo tee /etc/apt/sources.list.d/kubernetes.list

# 4️⃣ Cập nhật danh sách package
sudo apt update

# 5️⃣ Cài đặt kubeadm, kubelet, kubectl
sudo apt install -y kubelet kubeadm kubectl

# 6️⃣ Giữ phiên bản cố định (không auto-upgrade)
sudo apt-mark hold kubelet kubeadm kubectl


# 7️⃣ Enable kubelet khi khỏi động
sudo systemctl enable kubelet

# 8️⃣ Kiểm tra version
kubeadm version
kubectl version --client
kubelet --version
```

- Bật Floating IP để pod giao tiếp với interface mạng trong k8s

```bash
# Bật IP forwarding ngay lập tức
sudo sysctl -w net.ipv4.ip_forward=1

# Đảm bảo tự bật sau khi reboot
echo "net.ipv4.ip_forward = 1" | sudo tee /etc/sysctl.d/99-kubernetes-cri.conf

# Áp dụng thay đổi
sudo sysctl --system

# Kiểm tra lại
cat /proc/sys/net/ipv4/ip_forward
# Kết quả mong đợi: 1

# reboot để chắc chắn setting được nhận
sudo reboot

# reset cấu hình cũ nếu lệnh trước bị lỗi
sudo kubeadm reset -f
```

- khởi tạo k8s cluster

```bash
sudo kubeadm init \
  --apiserver-advertise-address=<master public or private ip> \
  --apiserver-cert-extra-sans=<master public or private ip>  \
  --pod-network-cidr=10.244.0.0/16 # dải ip để cấp cho các pod, không phải ip thật là network overlay
```

move config file

```bash
mkdir -p $HOME/.kube
sudo cp -i /etc/kubernetes/admin.conf $HOME/.kube/config
sudo chown $(id -u):$(id -g) $HOME/.kube/config
```

export config

```bash
export KUBECONFIG=/etc/kubernetes/admin.conf
```

- cài đặt network plugin calico cho cụm k8s

```bash
kubectl apply -f https://docs.projectcalico.org/manifests/calico.yaml

# kiểm tra lại sau 1-2 phút
kubectl get pods -n kube-system
# Khi thấy các Pod calico-node, calico-kube-controllers, coredns đều Running ⇒ thì node sẽ tự động chuyển STATUS → Ready.

# kiểm tra trạng thái node sau 1-2 phút
kubectl get nodes -o wide
# kết quả như bên dưới là ok
# NAME       STATUS   ROLES           AGE     VERSION
# master     Ready    control-plane   10m     v1.30.14
# worker-1   Ready    worker          5m      v1.30.14
```

- kiểm tra nhanh các thành phần của k8s

```bash
# Kiểm tra trạng thái pod hệ thống
kubectl get pods -n kube-system -o wide

# Kiểm tra các service trong namespace kube-system
kubectl get svc -n kube-system

# Kiểm tra cluster info tổng quan
kubectl cluster-info
```

- Cài đặt ingress NGINX controller làm load balancer

```bash
kubectl apply -f https://raw.githubusercontent.com/kubernetes/ingress-nginx/main/deploy/static/provider/baremetal/deploy.yaml

# cho phép ingress NGINX chạy trên master (chỉ test, 1 node cluster)
kubectl taint nodes master node-role.kubernetes.io/control-plane-

# kiểm tra
kubectl get pods -n ingress-nginx
# kết quả mong đợi:
# NAME                                        READY   STATUS    RESTARTS   AGE
# ingress-nginx-controller-7d6c8f59c5-abcde   1/1     Running   0          1m

# kiểm tra service của ingress nginx controller
kubectl get svc -n ingress-nginx
# kết quả mong đợi
# NAME                                 TYPE           CLUSTER-IP      EXTERNAL-IP     PORT(S)                      AGE
# ingress-nginx-controller             LoadBalancer   10.107.32.213   103.70.13.216   80:31011/TCP,443:31012/TCP   2m
# 🔍 Nếu bạn thấy EXTERNAL-IP đã có giá trị (public IP hoặc node IP), nghĩa là Ingress Controller đã expose ra ngoài thành công.
# Nếu EXTERNAL-IP là <pending> → LoadBalancer chưa sẵn sàng (trường hợp này thường xảy ra nếu bạn không có cloud provider hoặc chưa cấu hình MetalLB).

# kiểm tra log của controller
kubectl logs -n ingress-nginx deploy/ingress-nginx-controller
```

- Cài đặt MetalLB

```bash
kubectl apply -f https://raw.githubusercontent.com/metallb/metallb/v0.14.9/config/manifests/metallb-native.yaml

# kiểm tra
kubectl get pods -n metallb-system
# kết quả mong đợi:
# NAME                          READY   STATUS    RESTARTS   AGE
# controller-xxxxxx             1/1     Running   0          30s
# speaker-yyyyyy                1/1     Running   0          30s
```

- cấu hình cho MetalLB
  Tạo file metallb-config.yaml:

```yaml
apiVersion: metallb.io/v1beta1
kind: IPAddressPool
metadata:
  name: first-pool
  namespace: metallb-system
spec:
  addresses:
    - 103.70.13.210-103.70.13.219 # <-- Dải IP bạn muốn MetalLB cấp (cùng subnet với master)
    # nếu chỉ có 1 ip duy nhất thì dùng như sau   - 103.70.13.217/32
    # 10.134.128.200-10.134.128.210  # Dải IP nội bộ mà MetalLB sẽ cấp (VPC IP)
    # 👉 Lưu ý:
    # Dải 10.134.128.200-210 phải chưa được dùng bởi máy nào trong mạng.
    # Tất cả node K8s (và VPS ngoài có IP 10.134.128.4) phải nằm cùng subnet (10.134.128.0/24) để routing trực tiếp được.
---
apiVersion: metallb.io/v1beta1
kind: L2Advertisement
metadata:
  name: l2advertisement
  namespace: metallb-system
spec:
  ipAddressPools:
    - first-pool
```

Chú ý:

```
- Dải IP này phải cùng subnet với IP máy master (103.70.13.216)
- Không được trùng với IP của node khác, gateway hoặc DHCP server.
- Nếu bạn chỉ có 2 server (master và worker), bạn có thể dùng dải nhỏ như 103.70.13.217-103.70.13.219.
```

Apply config

```bash
kubectl apply -f metallb-config.yaml
```

Chuyển ingress-nginx-controller sang LoadBalancer

```bash
kubectl edit svc ingress-nginx-controller -n ingress-nginx
# sử dòng type: NodePort => type: LoadBalancer
# NAME                                 TYPE           CLUSTER-IP       EXTERNAL-IP      PORT(S)                      AGE
# ingress-nginx-controller             LoadBalancer   10.98.132.213    10.134.128.200   80:31159/TCP,443:31859/TCP   2m
# ingress-nginx-controller-admission   ClusterIP      10.109.37.112    <none>           443/TCP                      2m

# Kiểm tra:
kubectl get svc -n ingress-nginx
# Kết quả mong đợi
# NAME                                 TYPE           CLUSTER-IP      EXTERNAL-IP     PORT(S)                      AGE
# ingress-nginx-controller             LoadBalancer   10.98.132.213   103.70.13.217   80:31159/TCP,443:31859/TCP   6m
```

- cấu hình nginx revert proxy (nginx bên ngoài k8s)
  file config nginx

```conf
server {
    listen 80;
    server_name your-domain.com;  # hoặc _ để match all

    location / {
        proxy_pass http://10.134.128.200;  # IP do MetalLB cấp
        proxy_set_header Host $host;
        proxy_set_header X-Real-IP $remote_addr;
        proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;
        proxy_set_header X-Forwarded-Proto $scheme;
    }
}
```

- cài đặt rancher qua docker compose

```yaml
services:
  rancher:
    image: rancher/rancher:latest
    container_name: rancher
    privileged: true
    restart: unless-stopped
    ports:
      - "80:80"
      - "443:443"
    volumes:
      - ./data:/var/lib/rancher
      - /var/run/docker.sock:/var/run/docker.sock
```
