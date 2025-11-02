Bạn là một **Developer + Solution Architect** có nhiều năm kinh nghiệm với **Java, Spring Boot, cơ sở dữ liệu (SQL/NoSQL), và message queue (RabbitMQ/Kafka)**. Nhiệm vụ của bạn: soạn **một cuốn sách / khóa học hoàn chỉnh bằng tiếng Việt** dưới dạng **file Markdown** (tên file: `Lo_trinh_hoc_Java_Toan_dien.md`) — nhằm dạy một người từ **không biết Java** đến **có thể thiết kế và triển khai các dự án thực tế** như **thương mại điện tử, mạng xã hội, chat realtime, microservice**.

Yêu cầu chi tiết (bắt buộc):

1. **Table of Contents (TOC)** với chương/mục rõ ràng, tiến trình học (level: Beginner → Intermediate → Advanced → Expert). Mỗi chương là một phần học có độ dài tương tự một chương sách.
2. **Với mỗi chương / mục** phải bao gồm:

- Mục tiêu học (learning outcomes).
- Danh sách kiến thức chi tiết (giải thích từng khái niệm, cú pháp, cấu hình) sao cho người học **không cần tìm tài liệu khác**.
- Ít nhất một **ví dụ code thực tế** (Java + Spring Boot). Ví dụ phải đủ để chạy (hay tối thiểu đoạn then chốt: cấu hình, controller/service/repository). Nếu cần, mô tả `pom.xml` / `build.gradle` dependencies quan trọng.
- **Bài tập thực hành** (kèm đề bài và gợi ý lời giải), và một đề án nhỏ ứng dụng phần đó.
- **Lưu ý production**: performance tuning, tối ưu, pitfalls, metrics, monitoring.

3. **Chương dự án mẫu**: dành cho từng dự án lớn — **E-commerce**, **Social Network**, **Chat Realtime**, **Microservices demo**. Mỗi chương gồm:

- Kiến trúc tổng thể (textual diagram / ASCII UML), component responsibilities.
- DB schema mẫu, các bảng/collections chính.
- Các API endpoints quan trọng (REST / GraphQL), contract mẫu (request/response JSON).
- Dòng thời gian (sequence) cho các luồng chính (ví dụ: checkout flow, post creation, real-time messaging flow).
- Cách tích hợp gRPC (service-to-service), GraphQL (query/mutation/subscriptions), MQ (event-driven flows).
- Checklist deploy và considerations (scaling, caching, db sharding/partitioning, MQ partitions, consumer groups).

4. **Security & Auth**:

- Giải thích và minh họa: JWT, OAuth2 (authorization code + PKCE), OpenID Connect, refresh tokens, token revocation.
- Custom auth & authz patterns: role-based, permission-based, attribute-based. Cấu trúc lưu trữ permission, RBAC table mẫu.
- Input validation (Hibernate Validator), request sanitization, SQL injection prevention, XSS, CSRF, CORS.
- Example code: Spring Security configuration cho custom auth + RBAC + method-level security.

5. **Testing**:

- Unit testing (JUnit, Mockito), integration tests (Spring Boot Test), contract tests (Pact), e2e tests (Selenium / Playwright), và testcontainers cho DB/MQ.
- Ví dụ cấu hình và test case mẫu.

6. **Performance & Scalability**:

- JVM tuning (heap sizing, GC options), thread pools, connection pool (HikariCP) tuning.
- Caching strategies (Redis), cache warming/expiration, cache invalidation.
- MQ tuning: batching, prefetch, consumer concurrency, idempotency, exactly-once vs at-least-once.
- Use of reactive (Spring WebFlux) vs blocking (Spring MVC) — tradeoffs and when to use.

7. **DevOps / Deployment**:

- Dockerfile mẫu, multi-stage builds, image size minimization.
- Kubernetes manifests: Deployment, StatefulSet (if needed), Service, Ingress, ConfigMap, Secret, HPA, PodDisruptionBudget, probes.
- CI/CD pipeline example (GitHub Actions / GitLab CI) for build, test, container publish, deploy.
- Observability: structured logs, ELK / EFK or Loki + Grafana, metrics (Micrometer + Prometheus), tracing (OpenTelemetry).

8. **Appendices**:

- Cheat-sheets (git commands, SQL, JPA, common Spring annotations).
- Sample `pom.xml` / `build.gradle`, Dockerfile, k8s manifests, GitHub Actions workflow.
- Checklist security audit, pre-deploy checklist, rollback plan.

**Yêu cầu về phong cách viết và độ chi tiết**:

- Viết bằng **tiếng Việt** đơn giản, rõ ràng, thân thiện với người học.
- Ưu tiên **ví dụ thực tế** và hướng dẫn thao tác từng bước (kể cả lệnh terminal, câu lệnh docker/kubectl, curl requests để test API).
- Với mọi khái niệm không phổ thông, phải kèm phần giải thích ngắn gọn, ví dụ minh họa và cách debug thường gặp.
- Cung cấp **code snippets** đầy đủ cho phần then chốt; nếu file dài, có thể tóm tắt và đưa link ví dụ (nếu cần) — nhưng tối ưu là không bắt người học phải tìm tài liệu khác.

**Yêu cầu file đầu ra**:

- Một file Markdown hoàn chỉnh (`Lo_trinh_hoc_Java_Toan_dien.md`) chứa toàn bộ nội dung.
- Có Table of Contents, chương, mục, code blocks.
- Kèm phần **tóm tắt cuối chương** (key takeaways) và đánh giá năng lực (exercises + checkpoint test) để tự đánh giá.

Bắt đầu soạn ngay nội dung theo cấu trúc nêu trên. Phân chia chương thành các khối học hàng tuần (ví dụ: 12 tuần, 24 tuần, hoặc 52 tuần) và cho biết _thời lượng đề xuất_ cho mỗi chương (giờ/tuần). Kèm timeline học đề xuất cho 3 tốc độ: nhanh (full-time), trung bình (part-time), chậm (hobby).

Khi hoàn thành, **xuất ra toàn bộ nội dung dưới dạng Markdown** và đặt tên file là `Lo_trinh_hoc_Java_Toan_dien.md`.
