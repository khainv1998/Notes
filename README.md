# Lộ trình học Java Toàn diện – Từ Zero đến Hero

**Người đồng hành của bạn trong hành trình trở thành Java Developer/Architect.**

Chào mừng bạn đến với giáo trình Java toàn diện này! Chúng tôi tin rằng mỗi lập trình viên đều có thể xây dựng được những hệ thống backend quy mô lớn và chuyên nghiệp—miễn là có lộ trình rõ ràng, kiến thức chất lượng và thực hành đúng hướng.

**Mục tiêu của giáo trình:** Đưa bạn từ mức độ nhập môn hoàn toàn (không cần kinh nghiệm Java trước đó) cho đến khi có thể tự tin triển khai các hệ thống thực tế như E-commerce, Social Network, Chat realtime, và kiến trúc Microservices—tất cả đều được xây dựng với Java và Spring Boot, tích hợp đầy đủ bảo mật, kiểm thử, tối ưu hiệu năng, và quy trình DevOps hiện đại.

**Thời lượng gợi ý:** 24 tuần (6–8 giờ mỗi tuần). Nếu bạn có nhiều thời gian hơn hoặc ít hơn, đừng lo—chúng tôi cũng cung cấp lộ trình học nhanh, trung bình và chậm phù hợp với từng hoàn cảnh ở cuối tài liệu.

---

## Mục lục

1. [Giới thiệu & Lộ trình học](#ch1)
2. [Cơ bản Java & Công cụ (Beginner)](#ch2)
3. [OOP, Collections, I/O & Generics (Beginner)](#ch3)
4. [Công cụ build (Maven/Gradle), Packaging & Testing cơ bản (Beginner)](#ch4)
5. [Spring Boot Fundamentals (Intermediate)](#ch5)
6. [Truy cập dữ liệu với JPA/Hibernate (Intermediate)](#ch6)
7. [Thiết kế REST API, Validation, Error Handling (Intermediate)](#ch7)
8. [Bảo mật căn bản với Spring Security + JWT (Intermediate)](#ch8)
9. [Hàng đợi tin nhắn: RabbitMQ/Kafka (Intermediate)](#ch9)
10. [Hiệu năng & Caching (Redis), Tuning HikariCP, Actuator (Advanced)](#ch10)
11. [Lập trình Reactive: Spring WebFlux (Advanced)](#ch11)
12. [Kiến trúc & Tổ chức mã: Hexagonal, DDD-lite, Modul hóa (Advanced)](#ch12)
13. [Microservices: gRPC, GraphQL, SAGA, Outbox, Idempotency (Expert)](#ch13)
14. [Quan sát & DevOps: Docker, K8s, CI/CD, OpenTelemetry (Expert)](#ch14)
15. [Dự án mẫu: E-commerce](#ch15)
16. [Dự án mẫu: Social Network](#ch16)
17. [Dự án mẫu: Chat Realtime](#ch17)
18. [Dự án mẫu: Microservices Demo End-to-End](#ch18)
19. [Testing nâng cao: Unit, Integration, Contract (Pact), E2E, Testcontainers](#ch19)
20. [Bảo mật chuyên sâu: OAuth2/OIDC, PKCE, RBAC/ABAC, Anti-XSS/CSRF/CORS](#ch20)
21. [Phụ lục: Cheat-sheets, mẫu pom/gradle, Dockerfile, Manifests K8s, GH Actions](#ch21)
22. [Timeline đề xuất: Nhanh (full-time), Trung bình (part-time), Chậm (hobby)](#ch22)

---

<a id="ch1"></a>

## 1. Giới thiệu & Lộ trình học

### Tại sao học Java và Spring Boot?

Java vẫn là một trong những ngôn ngữ được sử dụng rộng rãi nhất trong các hệ thống backend quy mô doanh nghiệp. Kết hợp với Spring Boot—framework giúp đơn giản hóa việc xây dựng ứng dụng enterprise—bạn sẽ có trong tay bộ công cụ mạnh mẽ để phát triển các dịch vụ đáng tin cậy, bảo mật và dễ mở rộng.

Lộ trình này không chỉ dạy bạn cú pháp Java hay cách dùng Spring Boot. Chúng tôi sẽ đi sâu vào những thách thức thực tế mà các đội ngũ phát triển phần mềm thường gặp: làm thế nào để thiết kế API chuẩn, bảo vệ hệ thống khỏi các lỗ hổng bảo mật, tối ưu hiệu năng khi tải tăng cao, và triển khai liên tục mà không làm gián đoạn dịch vụ.

### Bạn sẽ học được gì?

Trong hành trình này, bạn sẽ:

- **Nắm vững nền tảng Java:** Từ cú pháp cơ bản, lập trình hướng đối tượng (OOP), Collections Framework, đến các khái niệm nâng cao như Generics, I/O, và Exception Handling.
- **Làm chủ Spring Boot:** Hiểu cơ chế Dependency Injection, Auto-configuration, cấu hình ứng dụng theo môi trường, và cách tận dụng Spring Actuator để giám sát hệ thống.
- **Thiết kế và triển khai REST API:** Xây dựng API chuẩn RESTful với validation, xử lý lỗi thống nhất, phân trang và versioning.
- **Quản lý dữ liệu bền vững:** Làm việc với JPA/Hibernate, thiết kế schema database, viết migration với Flyway/Liquibase, và tối ưu truy vấn để tránh các vấn đề như N+1.
- **Bảo mật ứng dụng:** Tích hợp Spring Security, xác thực JWT, phân quyền theo RBAC/ABAC, và bảo vệ ứng dụng khỏi các tấn công phổ biến (XSS, CSRF, SQL Injection).
- **Giao tiếp bất đồng bộ:** Sử dụng message queue (RabbitMQ/Kafka) để xây dựng hệ thống có khả năng chịu tải cao và decoupled.
- **Tối ưu hiệu năng:** Cache với Redis, tinh chỉnh connection pool (HikariCP), và quan sát metrics thông qua Prometheus/Grafana.
- **Lập trình Reactive:** Làm việc với Spring WebFlux, hiểu về backpressure, và xử lý luồng dữ liệu real-time.
- **Kiến trúc phần mềm:** Áp dụng Hexagonal Architecture, DDD-lite, và tổ chức mã nguồn theo module để dễ bảo trì.
- **Microservices:** Giao tiếp giữa các service qua gRPC, GraphQL; xử lý giao dịch phân tán với SAGA pattern; đảm bảo độ tin cậy với Outbox pattern.
- **DevOps & Observability:** Container hóa ứng dụng với Docker, triển khai lên Kubernetes, thiết lập CI/CD pipeline, và giám sát end-to-end với OpenTelemetry.

### Yêu cầu kiến thức nền tảng

Giáo trình này được thiết kế cho người mới bắt đầu với Java, nhưng bạn nên có:

- Hiểu biết cơ bản về lập trình (biến, vòng lặp, điều kiện—bất kỳ ngôn ngữ nào cũng được)
- Biết sử dụng terminal/command line cơ bản
- Quen thuộc với Git để quản lý mã nguồn
- Có khả năng cài đặt phần mềm trên máy tính của bạn (JDK, IDE, Docker)

### Cách học hiệu quả nhất

Học lập trình không chỉ là đọc và ghi nhớ—quan trọng nhất là **thực hành đều đặn**. Chúng tôi khuyến khích bạn:

1. **Đọc kỹ từng phần:** Hiểu rõ khái niệm trước khi viết code.
2. **Code theo ví dụ:** Gõ lại các đoạn code mẫu, chạy thử và quan sát kết quả.
3. **Làm bài tập:** Mỗi chương đều có bài tập thực hành—hãy hoàn thành chúng trước khi chuyển sang chương tiếp theo.
4. **Xây dựng dự án mini:** Áp dụng kiến thức vào các dự án mẫu (E-commerce, Social Network, Chat) để củng cố kỹ năng.
5. **Đo lường và tối ưu:** Không chỉ viết code chạy được—hãy học cách đo hiệu năng, phát hiện lỗi và cải thiện liên tục.
6. **Ghi chú và ôn tập:** Viết lại những điểm chính bằng ngôn ngữ của bạn, giải thích cho người khác nếu có thể.

### Cấu trúc của lộ trình

Lộ trình được chia thành 4 mức độ chính:

#### **Beginner (Chương 1-4):** Nền tảng Java

- Java cơ bản, JDK/JRE/JVM
- Lập trình hướng đối tượng, Collections, I/O
- Build tools (Maven/Gradle) và Testing cơ bản

#### **Intermediate (Chương 5-9):** Spring Boot & Hệ sinh thái

- Spring Boot Fundamentals
- JPA/Hibernate và quản lý transaction
- Thiết kế REST API, Validation và Error Handling
- Bảo mật với Spring Security và JWT
- Message Queue (RabbitMQ/Kafka)

#### **Advanced (Chương 10-12):** Hiệu năng & Kiến trúc

- Hiệu năng, Caching, Connection Pool tuning
- Lập trình Reactive với Spring WebFlux
- Kiến trúc phần mềm: Hexagonal, DDD-lite, Module hóa

#### **Expert (Chương 13-14):** Microservices & DevOps

- Microservices: gRPC, GraphQL, SAGA, Outbox
- DevOps: Docker, Kubernetes, CI/CD, OpenTelemetry

#### **Dự án thực chiến (Chương 15-18)**

- E-commerce platform
- Social Network
- Chat Realtime
- Microservices End-to-End Demo

#### **Chuyên sâu (Chương 19-20)**

- Testing nâng cao (Unit, Integration, Contract, E2E)
- Bảo mật chuyên sâu (OAuth2/OIDC, RBAC/ABAC)

### Checkpoint và đánh giá

Sau mỗi chương, bạn sẽ thấy phần **"Checkpoint tự đánh giá"** với các câu hỏi hoặc thử thách nhỏ. Hãy dành thời gian trả lời chúng—đây là cách tốt nhất để kiểm tra xem bạn đã thực sự hiểu hay chưa.

### Chuẩn bị môi trường

Trước khi bắt đầu, hãy đảm bảo bạn đã cài đặt:

- **JDK 17 trở lên** (khuyên dùng Eclipse Temurin hoặc OpenJDK)
- **IDE:** IntelliJ IDEA, Eclipse hoặc VS Code với extension Java
- **Docker & Docker Compose:** Để chạy các dịch vụ phụ thuộc (database, message queue, cache)
- **Git:** Để quản lý mã nguồn
- **Maven hoặc Gradle:** Build tool (Maven được khuyên dùng cho người mới)

### Lời khuyên cuối

Đừng vội vàng. Học lập trình giống như học một kỹ năng thủ công—cần thời gian, kiên nhẫn và thực hành đều đặn. Nếu bạn gặp khó khăn ở một chương nào đó, hãy quay lại, đọc thêm tài liệu bổ sung, hoặc tìm kiếm sự hỗ trợ từ cộng đồng.

Chúng tôi tin rằng với sự kiên trì và lộ trình rõ ràng này, bạn hoàn toàn có thể trở thành một Java Developer/Architect tự tin và chuyên nghiệp.

**Hãy bắt đầu hành trình của bạn ngay bây giờ!**

---

### Tóm tắt chương 1

Bạn đã hiểu được:

- Tổng quan về lộ trình học và những gì bạn sẽ đạt được
- Cấu trúc 22 chương từ cơ bản đến nâng cao
- Cách học hiệu quả nhất: đọc → code → test → đo đạc → tối ưu
- Yêu cầu môi trường và công cụ cần chuẩn bị

### Bài tập chương 1

1. **Cài đặt môi trường đầy đủ:**

   - Cài JDK 17+ và xác nhận bằng lệnh `java -version`
   - Cài đặt và cấu hình IDE yêu thích
   - Cài Docker và chạy thử `docker run hello-world`
   - Clone một repository mẫu từ GitHub (tùy chọn)

2. **Tạo repository Git:**

   - Khởi tạo một Git repository mới cho các bài thực hành của bạn
   - Tạo cấu trúc thư mục cho từng chương (ví dụ: `ch02-java-basics`, `ch03-oop-collections`...)

3. **Đặt mục tiêu học tập:**
   - Viết ra mục tiêu cụ thể bạn muốn đạt được sau khi hoàn thành lộ trình này
   - Lập lịch học hàng tuần và cam kết với bản thân

**Checkpoint:** Bạn đã sẵn sàng khi môi trường phát triển hoạt động ổn định và bạn có thể chạy được lệnh `java` từ terminal.

---

<a id="ch2"></a>

## 2. Java Cơ bản & Công cụ (Beginner)

### Tại sao phần này quan trọng?

Đây là nền tảng của mọi ứng dụng Java. Nếu bạn không nắm vững cách JDK/JRE/JVM hoạt động, cách dự án Java được cấu trúc, và quy trình build/run cơ bản, bạn sẽ gặp khó khăn khi đi sâu vào Spring Boot hay các framework phức tạp hơn.

Chương này không chỉ dạy cú pháp—chúng ta sẽ đi sâu vào cách Java chạy "under the hood", giúp bạn debug hiệu quả, tối ưu ứng dụng, và hiểu rõ những gì diễn ra khi bạn nhấn nút "Run" trong IDE.

**Mục tiêu học tập:**

- Phân biệt rõ JDK, JRE và JVM—vai trò của từng thành phần
- Nắm vững cú pháp Java cơ bản: kiểu dữ liệu, điều khiển luồng, class và method
- Hiểu cấu trúc dự án Maven/Gradle và quy trình compile → run → package
- Tạo được một REST API đơn giản với Spring Boot

**Thời lượng:** 1 tuần (6–8 giờ)

---

### Phần 1: Java, JDK, JRE và JVM—Hiểu rõ từ gốc rễ

Khi bạn viết dòng code Java đầu tiên, đằng sau hậu trường là cả một cỗ máy hoạt động tinh vi. Hãy cùng khám phá từng mảnh ghép của bức tranh này.

#### JVM (Java Virtual Machine) - Trái tim của Java

JVM là **máy ảo** chịu trách nhiệm thực thi bytecode Java. Khi bạn biên dịch file `.java` bằng `javac`, bạn nhận được file `.class` chứa bytecode—một dạng mã trung gian không phụ thuộc vào hệ điều hành hay kiến trúc CPU. JVM đọc bytecode này và chuyển đổi nó thành mã máy mà máy tính của bạn hiểu được.

**Điểm đặc biệt của JVM:**

- Một bytecode có thể chạy trên bất kỳ hệ điều hành nào có JVM (Windows, Linux, macOS)
- JVM quản lý bộ nhớ tự động thông qua Garbage Collector (GC)
- JVM tối ưu mã của bạn lúc chạy (runtime) nhờ JIT (Just-In-Time) compiler
- Cung cấp các công cụ chẩn đoán mạnh mẽ như `jcmd`, `jfr` (Java Flight Recorder)

Hiểu JVM giúp bạn:

- Debug các vấn đề về memory leak, deadlock
- Tối ưu hiệu năng ứng dụng trong production
- Cấu hình đúng các tham số `-Xmx`, `-Xms`, GC options khi triển khai

#### JRE (Java Runtime Environment) - Môi trường chạy ứng dụng

JRE bao gồm JVM cộng với các thư viện chuẩn của Java (Java SE API). Trước Java 11, JRE thường được phát hành riêng để chạy ứng dụng Java mà không cần công cụ phát triển. Từ Java 11 trở đi, JDK đã tích hợp đầy đủ runtime, nên khái niệm JRE riêng biệt ít phổ biến hơn.

Trong môi trường production hiện đại, bạn có thể:

- Dùng JDK làm runtime (đơn giản, dễ cài đặt)
- Tạo runtime tối thiểu bằng `jlink` để giảm kích thước Docker image và tăng bảo mật

#### JDK (Java Development Kit) - Bộ công cụ phát triển

JDK là bộ công cụ đầy đủ dành cho developer, bao gồm:

- **JRE** (để chạy ứng dụng)
- **javac:** Trình biên dịch từ `.java` → `.class`
- **jar:** Đóng gói ứng dụng thành file JAR
- **jlink:** Tạo runtime tối thiểu
- **jpackage:** Đóng gói native installer (exe, deb, rpm...)
- **javadoc:** Tạo tài liệu API
- **Công cụ chẩn đoán:** jcmd, jfr, jmap, jstack, jstat...

**Lưu ý quan trọng:** Khi phát triển, bạn luôn cần JDK. Khi triển khai lên server, bạn có thể chỉ cần runtime (JRE hoặc runtime `jlink`).

#### Chuỗi build/run trong Java

Hãy hình dung quy trình này như một dây chuyền sản xuất:

```
YourCode.java → [javac] → YourCode.class (bytecode) → [jar] → app.jar → [java] → JVM → Chạy trên OS/CPU
```

1. **Viết mã nguồn:** File `.java` chứa mã Java
2. **Biên dịch:** `javac` chuyển đổi thành bytecode `.class`
3. **Đóng gói:** `jar` gom các file `.class` và resources thành file `.jar`
4. **Thực thi:** `java -jar app.jar` khởi động JVM và chạy ứng dụng

---

### Phần 2: Cú pháp Java cơ bản

#### Kiểu dữ liệu: Nguyên thủy vs Tham chiếu

Java có hai loại kiểu dữ liệu chính:

**Kiểu nguyên thủy (Primitive):**

- `int`, `long`, `double`, `float`, `boolean`, `char`, `byte`, `short`
- Lưu trực tiếp giá trị trong stack memory
- Hiệu năng cao, không cần GC

**Kiểu tham chiếu (Reference):**

- `String`, `List`, `Map`, các Object tự định nghĩa
- Lưu địa chỉ tham chiếu đến object trong heap memory
- Được GC quản lý

```java
int age = 25;                    // Nguyên thủy
String name = "Anh";            // Tham chiếu
List<String> cities = List.of("Hanoi", "Saigon");  // Tham chiếu
```

**Từ khóa `final`:** Biến không thể thay đổi tham chiếu (với reference type, nội dung object vẫn có thể thay đổi).

**Từ khóa `var`:** (Java 10+) Suy luận kiểu tự động cho biến cục bộ.

```java
var count = 10;        // Compiler tự hiểu là int
var names = List.of("An", "Binh");  // Compiler hiểu là List<String>
```

#### Điều khiển luồng: If, Switch, Vòng lặp

```java
// If-else truyền thống
if (score >= 90) {
    System.out.println("Xuất sắc");
} else if (score >= 70) {
    System.out.println("Khá");
} else {
    System.out.println("Cần cố gắng");
}

// Switch expression (Java 14+) - hiện đại hơn
String grade = switch (score / 10) {
    case 10, 9 -> "Xuất sắc";
    case 8, 7 -> "Khá";
    default -> "Cần cố gắng";
};

// Vòng lặp for cơ bản
for (int i = 0; i < 5; i++) {
    System.out.println("Lần thứ " + i);
}

// For-each loop (dễ đọc hơn)
List<String> cities = List.of("Hanoi", "Danang", "Saigon");
for (String city : cities) {
    System.out.println(city);
}

// Stream API (functional style)
cities.stream()
      .filter(c -> c.startsWith("H"))
      .forEach(System.out::println);
```

#### Class, Method và Package

Java là ngôn ngữ hướng đối tượng thuần túy. Mọi thứ đều nằm trong class.

```java
// File: User.java
package com.example.model;  // Package giúp tổ chức code

public class User {
    // Fields (thuộc tính)
    private Long id;
    private String email;

    // Constructor
    public User(Long id, String email) {
        this.id = id;
        this.email = email;
    }

    // Getter/Setter
    public Long getId() { return id; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    // Method (hành vi)
    public boolean isActive() {
        return email != null && !email.isEmpty();
    }
}
```

---

### Phần 3: Maven—Quản lý dự án và dependencies

Maven là công cụ build phổ biến nhất trong hệ sinh thái Java. Nó giúp bạn:

- Quản lý dependencies (thư viện bên ngoài)
- Tự động hóa quy trình build (compile, test, package)
- Chuẩn hóa cấu trúc dự án

#### Cấu trúc dự án Maven chuẩn

```
my-project/
├── pom.xml                    # File cấu hình Maven
├── src/
│   ├── main/
│   │   ├── java/              # Mã nguồn chính
│   │   │   └── com/example/
│   │   └── resources/         # File cấu hình, properties
│   │       └── application.yml
│   └── test/
│       ├── java/              # Mã nguồn test
│       └── resources/
└── target/                    # Thư mục build output (tự động tạo)
    └── my-project-1.0.0.jar
```

#### File `pom.xml` cơ bản

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0">
  <modelVersion>4.0.0</modelVersion>

  <groupId>com.example</groupId>
  <artifactId>my-app</artifactId>
  <version>1.0.0</version>

  <properties>
    <maven.compiler.release>17</maven.compiler.release>
  </properties>

  <dependencies>
    <!-- Spring Boot Web Starter -->
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
  </dependencies>
</project>
```

#### Các lệnh Maven thường dùng

```bash
mvn clean          # Xóa thư mục target
mvn compile        # Biên dịch mã nguồn
mvn test           # Chạy unit tests
mvn package        # Đóng gói thành JAR/WAR
mvn install        # Cài vào local repository
mvn spring-boot:run  # Chạy ứng dụng Spring Boot
```

---

### Phần 4: Ví dụ thực hành—Hello World với Spring Boot

Bây giờ chúng ta sẽ kết hợp tất cả kiến thức trên để tạo một REST API đơn giản.

#### Bước 1: Tạo dự án Spring Boot

Cách nhanh nhất là dùng [Spring Initializr](https://start.spring.io/):

- Project: Maven
- Language: Java
- Spring Boot: 3.2+ (hoặc mới nhất)
- Dependencies: Spring Web

Hoặc dùng command line:

```bash
curl https://start.spring.io/starter.zip \
  -d dependencies=web \
  -d type=maven-project \
  -d language=java \
  -d bootVersion=3.2.0 \
  -d baseDir=hello-api \
  -o hello-api.zip
unzip hello-api.zip
cd hello-api
```

#### Bước 2: Viết code

**File: `src/main/java/com/example/demo/DemoApplication.java`**

```java
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // Annotation kích hoạt auto-configuration
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
```

**File: `src/main/java/com/example/demo/HelloController.java`**

```java
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController  // Annotation đánh dấu đây là REST controller
public class HelloController {

    @GetMapping("/hello")  // Map HTTP GET /hello
    public Map<String, String> hello() {
        return Map.of(
            "message", "Xin chào Spring Boot!",
            "version", "1.0.0"
        );
    }
}
```

#### Bước 3: Chạy ứng dụng

```bash
./mvnw spring-boot:run
```

Hoặc nếu bạn đã có Maven global:

```bash
mvn spring-boot:run
```

Mở trình duyệt và truy cập: http://localhost:8080/hello

Bạn sẽ thấy JSON response:

```json
{
  "message": "Xin chào Spring Boot!",
  "version": "1.0.0"
}
```

**Chúc mừng!** Bạn vừa tạo ra REST API đầu tiên với Spring Boot! 🎉

---

### Tóm tắt chương 2

Bạn đã học được:

- **JDK vs JRE vs JVM:** Hiểu vai trò và cách chúng phối hợp
- **Cú pháp Java cơ bản:** Kiểu dữ liệu, điều khiển luồng, class/method
- **Maven:** Cấu trúc dự án, `pom.xml`, và các lệnh cơ bản
- **Spring Boot:** Tạo và chạy một REST API đơn giản

### Bài tập thực hành

1. **Thêm endpoint `/health`:**

   - Trả về `{"status": "UP", "timestamp": "2024-01-15T10:30:00Z"}`
   - Sử dụng `java.time.Instant` để lấy thời gian hiện tại

2. **Tạo endpoint `/calculate`:**

   - Nhận hai số qua query parameters: `/calculate?a=10&b=5`
   - Trả về tổng, hiệu, tích, thương

3. **Viết README.md:**
   - Hướng dẫn cài đặt dependencies
   - Cách chạy ứng dụng
   - Danh sách endpoints có sẵn

### Lưu ý quan trọng cho production

- **Cố định version JDK:** Dùng cùng version JDK trong dev/CI/production
- **Sử dụng `--release`:** Đảm bảo bytecode tương thích: `<maven.compiler.release>17</maven.compiler.release>`
- **Dùng Maven Wrapper:** File `mvnw`/`mvnw.cmd` giúp đảm bảo mọi người dùng cùng version Maven

### Checkpoint tự đánh giá

Trả lời các câu hỏi sau để kiểm tra hiểu biết của bạn:

1. Sự khác biệt chính giữa JDK và JRE là gì?
2. Bytecode Java được lưu trong file nào sau khi biên dịch?
3. Tại sao nên dùng `final` cho biến không thay đổi?
4. Maven lưu dependencies đã tải về ở đâu? (Gợi ý: `~/.m2/repository`)
5. Làm thế nào để thay đổi port mặc định của Spring Boot? (Gợi ý: `application.properties`)

---

## JDK vs JRE vs JVM

Khi bạn viết một dòng code Java đầu tiên, đằng sau hậu trường là cả một cỗ máy hoạt động tinh vi: bộ công cụ phát triển (JDK) để biên dịch và đóng gói, môi trường chạy (JRE) để cung cấp thư viện chuẩn và đặc biệt là máy ảo Java (JVM) – trái tim thực thi bytecode của bạn trên mọi hệ điều hành, kiến trúc CPU. Hiểu rõ ba khái niệm này giúp bạn làm chủ quy trình build/run, cấu hình đúng môi trường production, debug sự cố hiệu năng, và tối ưu chi phí khi vận hành ở quy mô lớn (microservices chạy trong container, autoscaling, CI/CD…). Phần này được viết như một chương độc lập, đi từ nguyên lý → thực hành → tối ưu, kèm ví dụ chạy được và bài tập thực chiến.

### Giới thiệu tổng quan: JDK, JRE, JVM là gì và vì sao quan trọng

JVM (Java Virtual Machine) là chương trình mô phỏng một máy ảo nơi bytecode Java được thực thi. Bytecode là dạng trung gian sau khi file `.java` được biên dịch bởi `javac` thành file `.class`. JVM cung cấp các dịch vụ runtime như quản lý bộ nhớ (GC), nạp lớp (class loader), JIT compiler, kiểm soát luồng, và một loạt công cụ chẩn đoán (jcmd, jfr…). Điểm đặc biệt: cùng một bytecode, JVM có thể chạy trên Windows/Linux/macOS và nhiều kiến trúc CPU khác nhau (x64, ARM64…), giúp Java đạt khẩu hiệu “write once, run anywhere”.

JRE (Java Runtime Environment) là tập hợp bao gồm JVM + thư viện chuẩn (Java SE). Trước Java 11, JRE thường được phát hành tách riêng cho mục đích chạy ứng dụng. Từ Java 11 trở đi, thực tế JDK đã bao gồm đầy đủ môi trường runtime; các bản JRE riêng ít phổ biến hơn. Trong triển khai production hiện đại, bạn có thể dùng chính JDK làm runtime, hoặc tạo một runtime tối thiểu bằng `jlink` để giảm kích thước và bề mặt tấn công.

JDK (Java Development Kit) là bộ công cụ dành cho nhà phát triển: ngoài thành phần runtime (tức là JRE) còn có các công cụ như `javac` (biên dịch), `jar` (đóng gói), `jlink` (tạo runtime tối thiểu), `jpackage` (đóng gói native installer), `jcmd` (điều khiển/quan sát JVM), `jfr` (Java Flight Recorder – ghi hồ sơ thực thi), `jmap`, `jstat`, `jstack`, `jconsole`, `javadoc`… Nhà phát triển luôn làm việc với JDK; máy production có thể dùng JDK hoặc một runtime tối thiểu tuỳ chiến lược.

Vì sao cần học kỹ? Vì mọi quyết định bạn đưa ra – chọn phiên bản LTS (17/21), cấu hình GC, đặt `-Xmx`, bật JIT hay profile bằng JFR, xây Docker image bằng JDK vendor nào – đều tác động trực tiếp đến độ ổn định, latency, throughput, và chi phí hạ tầng ở quy mô lớn.

### Chuỗi build/run trong Java: từ .java đến tiến trình JVM

Hành trình tiêu chuẩn của một chương trình Java:

1. Viết mã nguồn `.java` với các lớp và phương thức.
2. Biên dịch bằng `javac` để sinh file `.class` chứa bytecode.
3. Đóng gói các `.class` (cùng tài nguyên) thành `.jar` (Java ARchive).
4. Thực thi bằng `java -cp ... MainClass` hoặc `java -jar app.jar`.

Bạn có thể quan sát bytecode bằng `javap -c` để hiểu JVM thực sự chạy gì. Điều này hữu ích khi phân tích tối ưu hoá của JIT, inlining, hoặc đơn giản là xác minh behavior.

Ví dụ tối thiểu minh hoạ chuỗi này và in thông tin runtime:

```java
// File: Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println("Xin chào từ JVM!");
        System.out.println("java.version=" + System.getProperty("java.version"));
        System.out.println("java.vendor=" + System.getProperty("java.vendor"));
        System.out.println("java.vm.name=" + System.getProperty("java.vm.name"));
        System.out.println("os.name=" + System.getProperty("os.name"));

        // Tính toán đơn giản để làm nóng JIT (tiered compilation sẽ tối ưu sau vài nghìn iteration)
        long sum = 0;
        for (int i = 0; i < 5_000_000; i++) sum += i;
        System.out.println("sum=" + sum);
    }
}
```

Chạy bằng CLI:

```bash
javac Main.java            # biên dịch -> Main.class
java Main                  # chạy class trực tiếp

# Đóng gói thành JAR có Main-Class
jar --create --file app.jar --main-class Main Main.class
java -jar app.jar
```

Nếu bạn dùng Maven, hãy cố định version phát hành mục tiêu để tránh lệch môi trường chạy:

```xml
<!-- pom.xml (tối thiểu, phần compiler) -->
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>com.example</groupId>
  <artifactId>jdk-jre-jvm-demo</artifactId>
  <version>1.0.0</version>
  <properties>
    <maven.compiler.release>17</maven.compiler.release>
  </properties>
  <build>
    <plugins>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>3.11.0</version>
        <configuration>
          <release>${maven.compiler.release}</release>
        </configuration>
      </plugin>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-jar-plugin</artifactId>
        <version>3.3.0</version>
        <configuration>
          <archive>
            <manifest>
              <mainClass>Main</mainClass>
            </manifest>
          </archive>
        </configuration>
      </plugin>
    </plugins>
  </build>
  <!-- Có thể thêm maven-surefire-plugin, maven-shade-plugin tuỳ nhu cầu -->
</project>
```

Build và chạy:

```bash
mvn -q -DskipTests package
java -jar target/jdk-jre-jvm-demo-1.0.0.jar
```

Ảnh hưởng hiệu năng: Khi chạy lần đầu, một số phương thức được thông dịch; sau khi “nóng” (được gọi nhiều), JIT biên dịch sang mã máy tối ưu. Nếu bạn benchmark, cần warm‑up để tránh kết quả bị nhiễu.

### Bên trong JVM: bộ nạp lớp, bộ nhớ, JIT, GC

JVM tải lớp thông qua hệ thống class loader phân tầng: bootstrap (cho java.base), platform, và application (classpath). Bạn cũng có thể có custom class loader (thường dùng trong framework hoặc container). Mỗi lớp gắn với một class loader; hai lớp có cùng tên nhưng từ class loader khác nhau được xem là khác nhau – đây là nguyên nhân nhiều lỗi ClassCastException “kỳ quặc” trên các server container cũ.

Bộ nhớ JVM gồm:

- Heap: nơi đối tượng được cấp phát; chia vùng young/old; có TLAB (Thread‑Local Allocation Buffer) giúp cấp phát cực nhanh theo từng thread.
- Stack per thread: lưu khung ngăn xếp cho lời gọi hàm, biến cục bộ kiểu nguyên thuỷ, tham chiếu.
- Metaspace: lưu metadata của lớp (thay thế PermGen từ Java 8); mặc định có thể nở ra theo nhu cầu, nhưng bạn nên giới hạn trong prod để tránh rò rỉ classloader.
- Code cache: lưu mã máy do JIT sinh ra.

JIT (Just‑In‑Time) với tiered compilation (C1/C2, hoặc Graal JIT) quan sát hot methods và tối ưu: inlining, escape analysis (đưa cấp phát lên stack khi có thể), loop unrolling… Điều này giải thích vì sao hiệu năng tăng dần sau warm‑up. Bạn có thể bật JFR để quan sát mức tối ưu và hotspot.

GC (Garbage Collector) tự động thu hồi bộ nhớ. Các tuỳ chọn phổ biến:

- G1GC (mặc định trên 17/21): cân bằng latency/throughput, phù hợp hầu hết dịch vụ backend.
- ZGC (độ trễ cực thấp, thay đổi heap size nhanh): hữu ích cho dịch vụ yêu cầu p99 rất thấp, heap lớn.
- Shenandoah (low‑pause): tương tự ZGC, do Red Hat.
- Parallel/Serial: đã ít dùng trong dịch vụ production hiện đại trừ trường hợp đặc thù.

Trong container, Java 10+ tôn trọng giới hạn cgroup (CPU/mem). Tuy vậy, bạn vẫn nên đặt chiến lược heap rõ ràng:

- Thiết lập trực tiếp: `-Xms512m -Xmx2048m` để kiểm soát chặt.
- Hoặc dùng phần trăm: `-XX:InitialRAMPercentage=20 -XX:MaxRAMPercentage=70` để tự thích ứng nhiều kích cỡ pod.
  Kèm theo đó là GC logging/metrics để theo dõi pause time, allocation rate.

Ví dụ bật log GC hiện đại:

```bash
java -Xms512m -Xmx1024m \
     -XX:+UseG1GC \
     -Xlog:gc*,safepoint:file=gc.log:time,uptime,level,tags \
     -jar app.jar
```

### ClassPath vs ModulePath (Java 9+)

Trước Java 9, JVM dùng classpath – danh sách thư mục/JAR để tìm lớp. Từ Java 9, hệ thống module (Project Jigsaw) cho phép mô‑đun hoá JDK/ứng dụng: bạn khai báo `module-info.java`, dùng module path để kiểm soát export/require rõ ràng. Với ứng dụng Spring Boot, phần lớn vẫn chạy tốt trên classpath (vì Spring Boot sử dụng cơ chế loader riêng cho fat‑jar). Bạn nên hiểu module để làm việc với `jlink`/`jpackage` hoặc ứng dụng desktop/native.

Ví dụ module tối thiểu:

```java
// module-info.java
module com.example.app {
  requires java.base;      // luôn có
  requires java.net.http;  // ví dụ cần HTTP Client
  exports com.example.api; // gói public cho module khác dùng
}
```

### Phân phối JDK: OpenJDK, Temurin, Oracle JDK, GraalVM

Bạn có nhiều lựa chọn vendor JDK: OpenJDK build, Eclipse Temurin (Adoptium), Oracle JDK, Amazon Corretto, Azul Zulu, BellSoft Liberica, GraalVM… Trong đa số hệ thống backend, Temurin/OpenJDK LTS (17/21) là lựa chọn ổn định, cập nhật bảo mật đều. Nếu bạn muốn native image hoặc polyglot (GraalVM languages), cân nhắc GraalVM. Quan trọng nhất là đồng bộ cùng một dòng LTS cho dev/CI/prod để tránh sai khác micro.

### Tạo runtime tối thiểu bằng jlink; đóng gói native bằng jpackage

`jlink` cho phép bạn tạo một runtime (gần như “JRE thửa riêng”) chỉ chứa các mô‑đun JDK bạn cần – giảm kích thước image và cải thiện bảo mật do loại bỏ thành phần thừa. Quy trình điển hình:

```bash
# Phát hiện mô-đun cần thiết từ JAR
jdeps --print-module-deps --multi-release=17 target/app.jar

# Tạo runtime tối thiểu (ví dụ chỉ cần java.base và java.net.http)
jlink --no-header-files --no-man-pages \
      --compress=2 \
      --add-modules java.base,java.net.http \
      --output runtime-min

# Chạy ứng dụng bằng runtime vừa tạo
./runtime-min/bin/java -jar target/app.jar
```

`jpackage` có thể tạo installer native (msi, pkg, deb, rpm) – hữu ích cho desktop, ít dùng trong microservice nhưng hữu ích khi cần ship on‑prem.

### Spring Boot và JVM: những khác biệt cần lưu ý

Spring Boot tạo “fat jar”/“über‑jar” chứa dependencies và một boot loader chuyên biệt. Chạy bằng `java -jar app.jar` thay vì `java -cp ...` thông thường. Ảnh hưởng:

- Class loader đặc thù của Boot: khi debug `ClassNotFoundException`, hãy kiểm tra cấu trúc jar (`jar tf app.jar`) và hiểu cơ chế nested JAR.
- Layered jar: có thể dùng `spring-boot-jarmode` hoặc cấu hình `spring-boot-maven-plugin` để bật chế độ layered cho Docker cache tốt hơn.

Dockerfile mẫu theo multi‑stage build cho Spring Boot:

```dockerfile
# Stage 1: build
FROM eclipse-temurin:17-jdk AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn -q -DskipTests package

# Stage 2: run (runtime tối thiểu)
FROM eclipse-temurin:17-jre
ENV JAVA_OPTS="-XX:InitialRAMPercentage=20 -XX:MaxRAMPercentage=70 -XX:+UseG1GC"
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["sh","-c","java $JAVA_OPTS -jar app.jar"]
```

Bạn có thể thay `17-jre` bằng runtime `jlink` do bạn tạo để giảm kích thước thêm nữa.

### Quan sát và debug JVM trong production

Ở môi trường thật, khi gặp sự cố CPU cao, GC pause, memory leak hoặc deadlock, bạn cần công cụ đúng:

- jcmd: cổng điều khiển đa năng – liệt kê flags, heap, thread dump, kích hoạt JFR.
- jfr (Java Flight Recorder): ghi hồ sơ thực thi (CPU, allocation, GC, I/O, lock contention…) với overhead thấp, có thể bật/ tắt nóng.
- jstack: lấy thread dump, hữu ích khi nghi deadlock hoặc block I/O.
- jmap/jstat: quan sát heap, histo, GC stats (trong các phiên bản mới, dùng `jcmd`/`jfr` thay thế nhiều trường hợp).

Ví dụ: bật JFR 60 giây và ghi ra file, đồng thời lấy thread dump và class histogram:

```bash
PID=$(jcmd | awk '/app.jar/{print $1}')
jcmd $PID JFR.start duration=60s filename=app.jfr settings=profile
jcmd $PID Thread.print > threads.txt
jcmd $PID GC.class_histogram > histo.txt
jcmd $PID JFR.dump filename=app.jfr
```

### Khi nào dùng JDK/JRE/jlink trong production

- Triển khai nhanh, đơn giản: dùng JDK/JRE vendor LTS (Temurin 17/21). Ưu điểm: dễ cài đặt, cập nhật. Nhược: image to hơn runtime tối thiểu.
- Tối ưu kích thước và bảo mật: dùng `jlink` để chỉ giữ mô‑đun cần thiết. Cần hiểu module, kiểm thử kỹ vì runtime quá tối giản có thể thiếu tiện ích chẩn đoán quen thuộc nếu bạn loại bỏ.
- Siêu nhẹ/khởi động cực nhanh: cân nhắc GraalVM Native Image cho dịch vụ nhỏ cần cold start nhanh (lambda, CLI). Đánh đổi: một số tính năng reflection và dynamic proxy cần cấu hình phức tạp; footprint runtime nhỏ nhưng thời gian build lớn.

### Ứng dụng thực tế trong các hệ thống lớn

E‑commerce: hệ thống thường nặng truy vấn DB, nhiều chuỗi String (SKU, mô tả), và peak traffic theo giờ. Dùng G1GC mặc định, cân nhắc `-XX:+UseStringDeduplication` để giảm duplicate String. Tối ưu pool kết nối (HikariCP). Trong container, đặt `-Xms`≈30–50% và `-Xmx`≈60–75% limit. Bật metrics qua Actuator để quan sát GC và thread pool.

Mạng xã hội: tải biến động, nhiều event nền (feed, recommendation). Dùng JFR định kỳ 1–2 phút trong peak để phát hiện điểm nóng (hot methods) – thường là serialization/deserialization, JSON binding. Dùng Jackson afterburner hoặc switch sang JSON‑B/record để giảm overhead.

Chat realtime: nhạy cảm latency, nhiều kết nối. Cân nhắc ZGC nếu heap lớn và p99 cần rất thấp; kiểm soát allocation rate (giảm object chatter), dùng byte buffer/pooled buffers cho I/O. Thử Netty và phản ứng bất đồng bộ (WebFlux) để giảm thread context switching.

Microservices: rất nhiều service nhỏ. Đồng bộ JDK LTS; fixed set flags cho các profile (dev/stage/prod). Với service nhỏ, `jlink` giúp giảm image và cold start; với service phức tạp, cứ JDK/JRE LTS chuẩn để thêm công cụ chẩn đoán thuận tiện.

### Ví dụ minh hoạ đầy đủ: Spring Boot + Actuator + cấu hình JVM container‑friendly

pom.xml (trọng tâm):

```xml
<project>
  <modelVersion>4.0.0</modelVersion>
  <parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>3.3.0</version>
  </parent>
  <groupId>com.example</groupId>
  <artifactId>boot-jvm-demo</artifactId>
  <version>1.0.0</version>
  <properties>
    <java.version>17</java.version>
  </properties>
  <dependencies>
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-actuator</artifactId>
    </dependency>
  </dependencies>
</project>
```

Ứng dụng và controller đơn giản:

```java
// src/main/java/com/example/DemoApplication.java
package com.example;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }
}

// src/main/java/com/example/HelloController.java
package com.example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
class HelloController {
  @GetMapping("/hello")
  public Map<String, Object> hello() {
    return Map.of(
      "message", "Xin chào Spring Boot!",
      "java", System.getProperty("java.version"),
      "vm", System.getProperty("java.vm.name")
    );
  }
}
```

Cấu hình Actuator và management port, đồng thời demo cấu hình GC log:

```properties
# src/main/resources/application.properties
server.port=8080
management.endpoints.web.exposure.include=health,info,metrics
management.endpoint.health.show-details=always
```

Chạy kèm JVM flags thân thiện container:

```bash
JAVA_OPTS="-XX:InitialRAMPercentage=20 -XX:MaxRAMPercentage=70 -XX:+UseG1GC -Xlog:gc*,safepoint:stdout:time"
mvn -q -DskipTests spring-boot:run -Dspring-boot.run.jvmArguments=\"$JAVA_OPTS\"
```

Giải thích hoạt động trong JVM và hiệu năng:

- Lúc khởi động, class loader của Spring Boot nạp các lớp từ nested JAR, một số bean khởi tạo ngay (eager), một số lazy. Hãy bật `spring.main.lazy-initialization=true` nếu cold start quan trọng.
- Sau vài request, JIT tối ưu các hot path như serialization JSON, mapping HTTP → method. GC G1 hoạt động chủ yếu trong young GC nhanh; nếu heap quá nhỏ, bạn sẽ thấy nhiều major GC → tăng `-Xmx`.

### Bài tập thực hành (kèm gợi ý)

1. UnsupportedClassVersionError “54.0/61.0”
   – Cố tình biên dịch bằng JDK 21, chạy trên runtime 17 để nhận lỗi. Sửa bằng `javac --release 17` hoặc `<maven.compiler.release>17</maven.compiler.release>`.

2. Kiểm tra classpath vs modulepath
   – Viết một app nhỏ dùng `java.net.http`. Chạy bằng classpath sẽ ổn; thêm `module-info.java` rồi thử chạy bằng module path (`java --module-path`). Quan sát lỗi khi thiếu require/export và sửa.

3. Quan sát JIT warm‑up
   – Viết một vòng lặp tính toán (ví dụ sum hoặc xử lý chuỗi) và đo thời gian ở lần đầu vs sau 5 lần. Gợi ý: `System.nanoTime()`; chạy ấm trước khi đo.

4. Ghi JFR 60s trong lúc load test
   – Dùng `ab`/`wrk` (hoặc Postman Runner) gửi request đến `/hello` của Spring Boot; bật `-XX:StartFlightRecording=duration=60s,filename=app.jfr` và mở file bằng JDK Mission Control để xem allocation hot spot.

5. Tạo runtime `jlink` và Docker image nhỏ
   – Chạy `jdeps` để phát hiện mô‑đun cần, tạo `runtime-min`, viết Dockerfile dùng `FROM debian:bookworm-slim` và copy runtime + app vào, so sánh kích thước image với image dùng `temurin:17-jre`.

### Lưu ý production, lỗi phổ biến và cách tối ưu

- Đồng bộ JDK: Dev/CI/Prod nên dùng cùng vendor và dòng LTS; cố định minor nếu muốn tái lập 100%.
- Chọn GC phù hợp: G1GC cho hầu hết backend; ZGC/Shenandoah cho latency cực thấp và heap lớn. Đừng tối ưu sớm – đo đạc rồi mới đổi GC.
- Kích thước heap: Tránh đặt `-Xms` = `-Xmx` quá lớn trong container nhỏ vì JVM có thể bị OOM nhóm khác (native, metaspace, direct buffer). Bắt đầu với 60–70% limit.
- GC logging và metrics: bật `-Xlog:gc*` và Actuator/Prometheus để có số liệu thay vì phỏng đoán.
- String dedup và Compact Strings: Mặc định Java dùng Compact Strings (Latin‑1). Với ứng dụng nhiều chuỗi trùng, thêm `-XX:+UseStringDeduplication` (G1) để giảm heap, đo p99 vì có overhead nhẹ.
- Kiểm soát metaspace: Rò rỉ classloader (plugin, redeploy nhiều lần) làm metaspace tăng → giới hạn `-XX:MaxMetaspaceSize` và theo dõi bằng JFR.
- Bảo mật: Chạy tiến trình bằng user không đặc quyền; với `jlink`, bỏ mô‑đun không dùng; cập nhật CPU (Critical Patch Update) định kỳ.
- Fat‑jar Spring Boot: Nếu thấy `ClassNotFoundException` trong fat‑jar, kiểm tra `spring-boot-maven-plugin` version và cấu trúc jar; tránh copy thủ công `lib/` khi không hiểu loader.
- Đo đạc đúng: Luôn warm‑up trước khi benchmark; dùng JMH cho microbenchmark. Đừng đo bằng `currentTimeMillis`.

### Kết nối thực chiến: áp dụng trong e‑commerce, mạng xã hội, chat realtime, microservice

Khi xây một nền tảng e‑commerce, nhóm thường phân chia theo microservices: product, catalog, pricing, order, payment, notification. Tất cả cùng một profile JVM/GC chuẩn hoá giúp vận hành dễ dàng. Ví dụ profile chung:

```text
JAVA_OPTS="-XX:+UseG1GC -XX:InitialRAMPercentage=25 -XX:MaxRAMPercentage=70 -Xlog:gc*,safepoint:stdout:time"
"
```

Các service realtime như notification/websocket nhạy cảm latency có thể chuyển sang ZGC nếu heap > 8–16GB và p99 là KPI chính. Dịch vụ xử lý batch (ETL, recommendation offline) ưu tiên throughput – Parallel GC đôi khi vẫn phù hợp, nhưng hãy đo thực tế.

Với mạng xã hội, lượng đối tượng tạm thời (DTO, JSON) lớn, hãy tối ưu pipeline serialization (Jackson + afterburner, `record`), tái sử dụng buffer, hạn chế tạo object không cần thiết (object churn) để giảm áp lực GC.

### Tổng kết nhanh (dành cho bạn sau khi đã đọc hết chương)

Bạn đã nắm: sự khác nhau JDK/JRE/JVM; chuỗi build/run; cấu trúc bộ nhớ và cơ chế JIT/GC; cách dùng classpath vs modulepath; cách tạo runtime tối thiểu bằng jlink; cách đóng gói và chạy Spring Boot thân thiện container; các công cụ quan sát như jcmd/jfr; tiêu chí chọn GC và tinh chỉnh heap; cũng như checklist production chống lại các lỗi phổ biến. Từ đây, mọi phần tiếp theo (OOP, Collections, Threading, Spring Boot nâng cao…) sẽ dựa trên nền tảng này để bạn tự tin xây, triển khai và tối ưu hệ thống thực tế quy mô lớn.

### Giới thiệu khái niệm

- JVM (Java Virtual Machine): Máy ảo thực thi bytecode `.class`. Cung cấp GC, JIT, bộ nạp lớp (class loader), quản lý bộ nhớ và các dịch vụ runtime.
- JRE (Java Runtime Environment): Tập hợp JVM + thư viện chuẩn để chạy ứng dụng Java. Từ JDK 11, không còn phát hành JRE riêng phổ biến; JDK bao gồm đầy đủ môi trường runtime để chạy.
- JDK (Java Development Kit): Bộ công cụ phát triển gồm JRE + công cụ dev (`javac`, `jar`, `jlink`, `jpackage`, `javadoc`, `jcmd`, `jfr`, ...).

Khi nào dùng cái gì?

- Nhà phát triển: dùng JDK để biên dịch, test, profile, đóng gói.
- Máy chạy production: chỉ cần runtime. Tùy chiến lược, có thể dùng JDK (đơn giản) hoặc runtime tối thiểu tạo bằng `jlink` (nhẹ hơn, bảo mật tốt hơn).

### Giải thích chi tiết

- Chuỗi build/run: `.java` --(javac)--> `.class` (bytecode) --(jar)--> `.jar` --(java)--> chạy trên JVM.
- ClassPath vs ModulePath:
  - ClassPath (truyền thống): JVM tìm lớp theo danh sách thư mục/JAR.
  - ModulePath (Java 9+): Có mô-đun hóa, khai báo phụ thuộc rõ ràng (`module-info.java`).
- JIT (Just-In-Time) và GC:
  - JVM ban đầu thông dịch bytecode, sau đó JIT biên dịch nóng thành mã máy tối ưu (C1/C2/Graal JIT).
  - GC tự động thu hồi bộ nhớ; mặc định G1GC (Java 17/21) cân bằng độ trễ/throughput.
- Phân phối JDK phổ biến: OpenJDK, Eclipse Temurin (Adoptium), Oracle JDK, GraalVM. Chọn bản LTS (17/21) cho production.

Sơ đồ dòng chảy (đơn giản):

```
YourCode.java  --javac-->  YourCode.class  --jar-->  app.jar  --java-->  JVM
                                                           |             |
                                                         JRE           OS/CPU
```

### Code ví dụ

Ví dụ 1: Java console in ra thông tin JVM (có thể chạy độc lập)

```java
// File: Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println("Xin chào từ JVM!");
        System.out.println("java.version=" + System.getProperty("java.version"));
        System.out.println("java.vendor=" + System.getProperty("java.vendor"));
        System.out.println("java.vm.name=" + System.getProperty("java.vm.name"));
        System.out.println("os.name=" + System.getProperty("os.name"));

        // Ví dụ tính toán nhỏ để kích hoạt JIT một chút
        long sum = 0;
        for (int i = 0; i < 5_000_000; i++) sum += i;
        System.out.println("sum=" + sum);
    }
}
```

Chạy bằng CLI:

```bash
javac Main.java            # biên dịch -> Main.class
java Main                  # chạy class trực tiếp

# Đóng gói thành JAR có Main-Class
jar --create --file app.jar --main-class Main Main.class
java -jar app.jar
```

Ví dụ 2: Thiết lập Maven để biên dịch với bản phát hành mục tiêu (tránh lỗi lệch version)

```xml
<!-- pom.xml (tối thiểu, mô tả phần compiler) -->
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>com.example</groupId>
  <artifactId>jdk-jre-jvm-demo</artifactId>
  <version>1.0.0</version>
  <properties>
    <maven.compiler.release>17</maven.compiler.release>
  </properties>
  <build>
    <plugins>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>3.11.0</version>
        <configuration>
          <release>${maven.compiler.release}</release>
        </configuration>
      </plugin>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-jar-plugin</artifactId>
        <version>3.3.0</version>
        <configuration>
          <archive>
            <manifest>
              <mainClass>Main</mainClass>
            </manifest>
          </archive>
        </configuration>
      </plugin>
    </plugins>
  </build>
</project>
```

Build và chạy:

```bash
mvn -q -DskipTests package
java -jar target/jdk-jre-jvm-demo-1.0.0.jar
```

Ví dụ 3 (nâng cao): Tạo runtime tối thiểu bằng `jlink` cho ứng dụng console

```bash
# Phát hiện mô-đun cần thiết (với app console đơn giản thường chỉ cần java.base)
jdeps --print-module-deps --multi-release=17 target/jdk-jre-jvm-demo-1.0.0.jar

# Tạo runtime tối thiểu (thay com.example bằng kết quả từ jdeps nếu có)
jlink --no-header-files --no-man-pages \
      --compress=2 \
      --add-modules java.base \
      --output runtime-min

# Chạy ứng dụng bằng runtime vừa tạo
./runtime-min/bin/java -jar target/jdk-jre-jvm-demo-1.0.0.jar
```

### Ứng dụng thực tế

- E-commerce: Chọn JDK LTS (17/21), build Spring Boot JAR (fat/über‑jar), deploy bằng Docker. Dùng `--release` để đảm bảo tương thích môi trường chạy.
- Mạng xã hội: Dùng các công cụ JDK như `jcmd`, `jfr` để chẩn đoán CPU/memory khi tải tăng cao, phân tích GC pause.
- Chat realtime: Tối ưu JVM flags cho container, đảm bảo heap hợp lý, giám sát GC để giữ latency thấp.
- Microservice: Dùng `jlink` tạo runtime tối thiểu giảm kích thước image, khởi động nhanh hơn; hoặc cân nhắc GraalVM Native Image cho các service siêu nhẹ.

### Thực hành / bài tập

1. Biên dịch & chạy CLI

- Viết `Main.java` như ví dụ, dùng `javac`/`java` để chạy; đóng gói JAR và chạy bằng `java -jar`.

2. Kiểm soát version mục tiêu

- Biên dịch với `javac --release 17` hoặc Maven `maven.compiler.release`. Thử chạy trên JDK 17 và 21 để quan sát tương thích.

3. Bài tập lỗi thường gặp

- Cố tình chạy JAR biên dịch bằng 21 trên JDK 17 để thấy `UnsupportedClassVersionError`, sau đó sửa bằng `--release`.
- Tạo JAR thiếu Main-Class và sửa lỗi `no main manifest attribute` bằng cấu hình `maven-jar-plugin`.

4. `jlink` mini‑project

- Dùng `jdeps` để tìm mô‑đun, tạo runtime tối thiểu, đo kích thước trước/sau (so sánh image Docker).

5. Quan sát runtime (tuỳ chọn)

- Chạy `jcmd <pid> VM.flags`, `jcmd <pid> GC.class_histogram`; thử bật JFR: `-XX:StartFlightRecording=duration=60s,filename=app.jfr` và phân tích.

### Lưu ý khi triển khai thực tế

- Chọn LTS, đồng bộ version JDK giữa dev/CI/prod; cố định minor khi cần tái lập build.
- Thiết lập `JAVA_HOME` và `PATH` nhất quán; trong CI dùng toolchain hoặc container.
- Dùng `--release` (hoặc `maven.compiler.release`) thay vì `source/target` rời rạc để đảm bảo tính tương thích API/bytecode.
- Trên container:
  - Java 10+ tự tôn trọng limit cgroup; vẫn nên điều chỉnh: `-XX:InitialRAMPercentage` và `-XX:MaxRAMPercentage` (ví dụ 20/75) hoặc đặt `-Xms/-Xmx` rõ ràng.
  - Dùng G1GC mặc định; cân nhắc `-XX:+UseStringDeduplication` cho ứng dụng nhiều String.
- Đóng gói Spring Boot:
  - Maven: `spring-boot-maven-plugin` tạo executable jar. Chạy `java -jar app.jar`.
  - Docker multi‑stage: build trong stage Maven, copy artifact sang image run thời gian chạy tối thiểu (Temurin JRE hoặc runtime `jlink`).
- Bảo mật & giảm bề mặt tấn công: Với `jlink`, loại bỏ mô‑đun không cần; chạy user không đặc quyền trong container.
- Debug sự cố phổ biến:
  - `UnsupportedClassVersionError`: lệch version biên dịch/chạy → đồng bộ `--release` và runtime.
  - `ClassNotFoundException`/`NoClassDefFoundError`: sai classpath/jar bị thiếu → kiểm tra `-cp`, `jar tf`.
  - `OutOfMemoryError`: thiếu heap/metaspace → tăng `-Xmx`/`-XX:MaxMetaspaceSize`, xem leak bằng JFR.

---

<a id="ch3"></a>

## 3. OOP, Collections, I/O & Generics (Beginner)

#### Giới thiệu

- Mục tiêu: thành thạo OOP, cấu trúc dữ liệu Java, đọc/ghi file, generic API.
- Kiến thức nền: Java cơ bản (biến, điều kiện, vòng lặp).
- Lý do: mô hình hoá domain và hiệu quả dữ liệu là nền cho mọi dịch vụ.

#### Nội dung chi tiết

- Encapsulation/Inheritance/Polymorphism; List/Set/Map; NIO.2; Generics (variance, erasure).

#### Ví dụ code thực tế

- Lớp domain, repo generic in‑memory, I/O CSV, exceptions (đã có code trong chương).

#### Ứng dụng thực tế

- Mô hình hoá Product/Order/User; xử lý import/export dữ liệu.

#### Tối ưu & best practice

- Chọn cấu trúc phù hợp use‑case; try‑with‑resources; tránh raw types.

#### Tóm tắt & bài tập

- Tóm tắt: biết thiết kế OOP và dùng Collections hiệu quả.
- Bài tập: viết `Repository<T,ID>` in‑memory và báo cáo tồn kho từ CSV.

Mục tiêu học:

- Nắm OOP (encapsulation, inheritance, polymorphism), interface, abstract class.
- Sử dụng Collections (List, Set, Map), Generics, Exception handling.

Thời lượng: 1 tuần (6–8 giờ)

Nội dung chi tiết (bản mở rộng):

1. Lớp, đối tượng, kế thừa, override

- Khái niệm:
  - Lớp (class) định nghĩa thuộc tính và hành vi; đối tượng (object) là thể hiện của lớp.
  - Kế thừa (inheritance): lớp con dùng lại, mở rộng lớp cha. Đa hình (polymorphism): cùng interface, hành vi cụ thể khác nhau tùy đối tượng thực.
  - Đóng gói (encapsulation): che giấu dữ liệu qua private/protected, cung cấp getter/setter hoặc phương thức nghiệp vụ.
- Code mẫu:

```java
class User {
  private final long id;
  private String email;

  public User(long id, String email) { this.id = id; this.email = email; }
  public long getId() { return id; }
  public String getEmail() { return email; }
  public void changeEmail(String newEmail) { this.email = newEmail; }

  @Override public String toString() { return "User#" + id + " <" + email + ">"; }
}

class PremiumUser extends User {
  private int points = 0;
  public PremiumUser(long id, String email){ super(id, email); }
  public void addPoints(int p){ this.points += p; }
  @Override public String toString(){ return super.toString() + " pts=" + points; }
}

User u = new PremiumUser(1L, "a@ex.com");
System.out.println(u.toString());
```

- Khi nào override? Khi lớp con muốn điều chỉnh hành vi lớp cha. Khi nào overloading? Cùng tên phương thức nhưng tham số khác — KHÁC override.
- Pitfalls: Luôn dùng `@Override` để tránh sai chữ ký; ưu tiên composition hơn inheritance khi quan hệ không thật sự “là một/IS‑A”.
- Debug: In `obj.getClass()` để biết kiểu thực thi; viết `toString()` hữu ích.
- Mini‑lab: Viết lớp `Order` có `List<OrderItem>` và `VipOrder` override cách tính giảm giá.

2. Interface vs Abstract class: khi nào dùng

- Interface: định nghĩa hợp đồng, có thể có `default/static` methods; cho phép multiple inheritance of type.
- Abstract class: chia sẻ state/hành vi chung + cho phép một phần cài đặt; chỉ đơn kế thừa.
- Khi nào dùng:
  - Interface khi cần hợp đồng ổn định và nhiều implementation (ví dụ adapter nhiều nhà cung cấp).
  - Abstract class khi có logic dùng chung cần tái sử dụng giữa các lớp con.
- Code mẫu:

```java
interface PaymentGateway { boolean charge(long userId, int amountCents); }

abstract class BasePaymentGateway implements PaymentGateway {
  protected boolean fraudCheck(long userId){ return true; }
}

class StripeGateway extends BasePaymentGateway {
  @Override public boolean charge(long userId, int amountCents) {
    if(!fraudCheck(userId)) return false;
    return amountCents < 1_000_000;
  }
}
```

- Pitfalls: Đừng nhét quá nhiều vào abstract base class; bắt đầu bằng interface, thêm abstract class khi thật sự cần.
- Mini‑lab: Thiết kế `NotificationChannel` (interface) với 2 implementation: Email/SMS. Thêm `AbstractNotification` chia sẻ template “Hello, {name}”.

3. Collections framework và Big‑O cơ bản

- Tổng quan:
  - List: ArrayList (O(1) truy cập, chèn cuối amortized O(1)), LinkedList (chèn/xóa giữa O(1) nếu có node).
  - Set: HashSet (TB O(1)), LinkedHashSet (duy trì thứ tự chèn), TreeSet (O(log n), có sắp xếp).
  - Map: HashMap (TB O(1)), LinkedHashMap (thứ tự/LRU), TreeMap (O(log n)).
- Code mẫu:

```java
List<String> names = List.of("An","Bình","An");
Set<String> unique = new HashSet<>(names);
Map<String, Long> freq = names.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));

Map<String, Integer> lru = new LinkedHashMap<>(16, 0.75f, true);
lru.put("A",1); lru.put("B",2); lru.get("A"); // A thành mới nhất
```

- Concurrency: `ConcurrentHashMap` cho đa luồng; tránh mutate key sau khi put.
- Pitfalls: Dùng `ArrayList` cho xóa đầu liên tục (O(n)) → cân nhắc `Deque`.
- Mini‑lab: Tính tổng giá theo danh mục (Map<String, BigDecimal>) và in Top‑N danh mục theo tổng.

4. Generics: type‑safety, `List<T>`

- Mục tiêu: bắt lỗi tại compile‑time, không ép kiểu runtime.
- Khái niệm: lớp/phương thức tổng quát, bounded type, wildcards theo quy tắc PECS (Producer Extends, Consumer Super).

```java
class Pair<L,R> { final L left; final R right; Pair(L l, R r){ left=l; right=r; } }

static <T> void copy(List<? extends T> src, List<? super T> dst){ for (T x : src) dst.add(x); }

List<Integer> a = List.of(1,2,3);
List<Number> b = new ArrayList<>();
copy(a, b); // OK: Producer extends, Consumer super
```

- Type erasure: không `new T()`, không `List<int>` mà `List<Integer>`.
- Pitfalls: Tránh raw type (`List` thay vì `List<T>`); thiết kế API generic rõ ràng.
- Mini‑lab: Viết `Repository<T, ID>` in‑memory (`save/findById/findAll`).

5. I/O: đọc/ghi file với NIO.2

- Khái niệm: `Path`, `Files`, try‑with‑resources đảm bảo đóng tài nguyên.

```java
Path p = Path.of("products.csv");
try (Stream<String> lines = Files.lines(p, StandardCharsets.UTF_8)) {
  lines.map(l -> l.split(","))
       .map(a -> new Product(a[0], new BigDecimal(a[1])))
       .forEach(System.out::println);
}

List<String> out = List.of("id,name,price", "1,Book,10.5");
Files.write(Path.of("out.csv"), out, StandardCharsets.UTF_8,
            StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);

Files.walk(Path.of("data")).filter(Files::isRegularFile).forEach(System.out::println);
```

- Pitfalls: Set đúng Charset; tránh leak bằng try‑with‑resources.
- Mini‑lab: Tính “giá trị tồn kho” = sum(qty\*price) từ CSV, ghi báo cáo.

6. Exception: checked vs unchecked, try‑with‑resources

- Phân loại: Checked (phục hồi được) vs Unchecked (lỗi lập trình/logic).
- Thực hành tốt: chỉ catch khi xử lý được; propagate với ngữ cảnh.

```java
class NotFoundException extends RuntimeException { public NotFoundException(String msg){ super(msg); } }
Product findProduct(Long id){ return repo.findById(id).orElseThrow(() -> new NotFoundException("Product "+id+" not found")); }

try (var in = Files.newBufferedReader(Path.of("in.txt")); var out = Files.newBufferedWriter(Path.of("out.txt"))) {
  out.write(in.readLine());
} catch (IOException e) {
  throw new UncheckedIOException("I/O error while copying", e);
}
```

- Pitfalls: Nuốt lỗi (catch rỗng), log spam, bắt Exception tổng quát ở quá cao.
- Mini‑lab: Tạo `ValidationException`; khi CSV thiếu cột, throw và log dòng + số thứ tự.

Mini‑Project cuối chương (đề xuất)

- “Kho dữ liệu sản phẩm mini”:
  - Đọc CSV -> map `Product`, lưu vào `Repository<Product, Long>` generic in‑memory.
  - API console: tìm theo tên (contains, ignore-case), thống kê giá trị tồn kho theo danh mục, xuất báo cáo CSV.
  - Nâng cao: thêm `PriceRule` (interface) với nhiều implementation để áp dụng khuyến mãi theo đa hình.

Tóm tắt & Key Takeaways:

- Hiểu bản chất kế thừa/đa hình và khi nào dùng interface vs abstract class.
- Nắm đặc tính hiệu năng của List/Set/Map và chọn cấu trúc dữ liệu đúng.
- Xử lý ngoại lệ hợp lý, không nuốt lỗi; dùng try-with-resources cho I/O.

Checkpoint tự đánh giá:

- Viết hàm generic `max(List<T> list, Comparator<T>)` và test.
- Phân tích độ phức tạp thao tác thêm/tìm kiếm với `ArrayList` vs `LinkedList`.
- Thiết kế interface `Cache<K,V>` và một impl LRU đơn giản.

---

<a id="ch4"></a>

## 4. Build tools (Maven/Gradle), Packaging & Testing cơ bản (Beginner)

#### Giới thiệu

- Mục tiêu: quản lý phụ thuộc, profile, đóng gói, test cơ bản.
- Kiến thức nền: chương 2–3.
- Lý do: đảm bảo build reproducible và có kiểm thử sớm.

#### Nội dung chi tiết

- `pom.xml`/`build.gradle`, BOM; profiles; JUnit 5, Mockito, MVC slice.

#### Ví dụ code thực tế

- Test `OrderService` và `@WebMvcTest` (đã có code trong chương).

#### Ứng dụng thực tế

- Thiết lập profile dev/test/prod; thêm test smoke cho API chính.

#### Tối ưu & best practice

- Khoá version qua BOM; cấu hình CI chạy test và build artifact.

#### Tóm tắt & bài tập

- Tóm tắt: build/test cơ bản đã hoàn thiện.
- Bài tập: thêm test cho `/hello` và profile `dev`.

#### Bổ sung hiện đại (Gradle Version Catalogs)

```toml
# gradle/libs.versions.toml
[versions]
spring-boot = "3.3.2"

[libraries]
spring-boot-starter-web = { module = "org.springframework.boot:spring-boot-starter-web", version.ref = "spring-boot" }
```

```kotlin
// build.gradle.kts
dependencies {
  implementation(libs.spring.boot.starter.web)
}
```

Mục tiêu học:

- Quản lý phụ thuộc, profile, build JAR/Docker, test cơ bản với JUnit.

Thời lượng: 1 tuần

Nội dung:

- `pom.xml`/`build.gradle`: dependency, plugin.
- Profiles (dev/test/prod) và `application-*.yml`.
- JUnit 5 và Mockito căn bản.

Ví dụ test đơn giản:

```java
class OrderServiceTest {
  @Test void checkout_ok_when_amount_small() {
    PaymentGateway gw = (u, a) -> true;
    var service = new OrderService(gw);
    assertTrue(service.checkout(1L, List.of(10, 20)));
  }
}
```

Bài tập: Viết test cho controller `/hello` bằng `@WebMvcTest`.

Lưu ý production: Khóa phiên bản phụ thuộc; dùng BOM của Spring.

Tóm tắt & Key Takeaways:

- Hiểu cấu trúc `pom.xml`/`build.gradle` và chốt version qua BOM.
- Biết tạo profile cấu hình tách biệt theo môi trường.
- Viết được test JUnit 5 cơ bản và test MVC slice (`@WebMvcTest`).

Checkpoint tự đánh giá:

- Viết lệnh Maven để chạy test đơn lẻ? Gợi ý: `-Dtest=ClassName#method`.
- Cách kích hoạt profile `dev` khi chạy local? Gợi ý: `--spring.profiles.active=dev`.
- Khác nhau giữa `compileOnly` và `implementation` (Gradle)? Gợi ý: ảnh hưởng classpath runtime.

---

<a id="ch5"></a>

## 5. Spring Boot Fundamentals (Intermediate)

#### Giới thiệu

- Mục tiêu: hiểu auto‑configuration, DI, configuration properties, profiles, Actuator.
- Kiến thức nền: chương 2–4.
- Lý do: làm chủ khung ứng dụng và vòng đời bean.

#### Nội dung chi tiết

- Component scan; `@Bean` vs `@Component`; properties binding; actuator endpoints.

#### Ví dụ code thực tế

- `GreetingService`, `@ConfigurationProperties`, `/actuator/health` (đã có code trong chương).

#### Ứng dụng thực tế

- Cấu hình dịch vụ thanh toán/vận chuyển qua properties; expose health/metrics.

#### Tối ưu & best practice

- Ghi đè cấu hình đúng chỗ; kiểm soát phơi lộ Actuator; dùng constructor injection.

#### Tóm tắt & bài tập

- Tóm tắt: hiểu cách Spring Boot tự cấu hình và ghi đè.
- Bài tập: tạo `PayProps` (timeout/retries) và áp dụng trong service.

Mục tiêu học:

- Hiểu auto-configuration, `@Configuration`, `@Bean`, lifecycle, profiles.

Thời lượng: 1 tuần

Nội dung:

- Component scan, `@Component`, `@Service`, `@Repository`.
- Configuration properties, `application.yml`.
- Actuator cơ bản.

Giải thích chi tiết:

- Auto-configuration: Spring Boot bật cấu hình mặc định dựa trên starter có mặt trên classpath (ví dụ: `spring-boot-starter-web` cấu hình MVC + Tomcat). Có thể ghi đè bằng `@Bean` hoặc bằng properties trong `application.yml`.
- Dependency Injection (DI): Spring tạo và quản lý bean, inject qua constructor giúp bất biến và dễ test.

```java
@Service
class GreetingService { String hi(String name){ return "Xin chào, "+name; } }

@RestController
class Api {
  private final GreetingService svc;
  Api(GreetingService svc){ this.svc = svc; }
  @GetMapping("/hi/{name}") Map<String,String> hi(@PathVariable String name){ return Map.of("msg", svc.hi(name)); }
}
```

- Configuration Properties: bind cấu hình sang class type-safe.

```yaml
app:
  payment:
    timeoutMs: 2000
    retries: 3
```

```java
@ConfigurationProperties(prefix="app.payment")
record PayProps(int timeoutMs, int retries) {}
@Configuration @EnableConfigurationProperties(PayProps.class)
class PayCfg {}
```

- Profiles: `application-dev.yml`, bật bằng `--spring.profiles.active=dev` để tách config theo môi trường.
- Actuator: cung cấp `/actuator/health`, `/info`, `/metrics`. Mở thêm endpoint bằng `management.endpoints.web.exposure.include`.

Ví dụ cấu hình properties:

```yaml
# src/main/resources/application.yml
app:
  greeting: "Xin chào"
```

```java
@ConfigurationProperties(prefix = "app")
record AppProps(String greeting) {}

@RestController
class GreetingController {
  private final AppProps props;
  GreetingController(AppProps props) { this.props = props; }
  @GetMapping("/greet/{name}") Map<String,String> greet(@PathVariable String name){
    return Map.of("msg", props.greeting()+", "+name);
  }
}
```

Bài tập: Tạo `@ConfigurationProperties` cho thông số thanh toán (timeout, retries).

Lưu ý production: Bật Actuator `/health`, `/info`; ẩn endpoint nhạy cảm.

Tóm tắt & Key Takeaways:

- Nắm cơ chế auto-configuration và cách ghi đè bằng `@Bean`/properties.
- Biết bind cấu hình với `@ConfigurationProperties` an toàn và testable.
- Làm chủ Actuator cơ bản và kiểm soát phơi lộ endpoint.

Checkpoint tự đánh giá:

- Cách bật exposure Actuator `prometheus`? Gợi ý: `management.endpoints.web.exposure.include`.
- Khác nhau giữa `@Component` và `@Configuration`? Gợi ý: proxy CGLIB, bean factory method.
- Vì sao nên đặt cấu hình trong `application.yml` thay vì hard-code?

---

<a id="ch6"></a>

## 6. JPA/Hibernate & Giao dịch (Intermediate)

#### Giới thiệu

- Mục tiêu: mapping entity, repository, JPQL, transaction, migration.
- Kiến thức nền: SQL cơ bản, chương 5.
- Lý do: bền vững dữ liệu và toàn vẹn giao dịch.

#### Nội dung chi tiết

- Entity/Relational mapping, `@OneToMany`, lazy/eager; `@Transactional`; Flyway/Liquibase.

#### Ví dụ code thực tế

- Entity `Product`, repository, service transactional, migration script (đã có code trong chương).

#### Ứng dụng thực tế

- Lưu trữ đơn hàng, tồn kho, thanh toán; chiến lược fetch và index.

#### Tối ưu & best practice

- Tránh N+1; dùng DTO projection; tối ưu query/index; giới hạn transaction scope.

#### Tóm tắt & bài tập

- Tóm tắt: CRUD bền vững, giao dịch an toàn.
- Bài tập: thêm `Order` + `OrderItem` và test transactional.

Mục tiêu học:

- Mapping entity, repository, JPQL/Criteria, transaction, migrations.

Thời lượng: 1–2 tuần

Nội dung:

- Entity cơ bản, quan hệ OneToMany/ManyToOne/ManyToMany.
- Spring Data JPA: `CrudRepository`, query method, `@Query`.
- Transaction: `@Transactional`, isolation, propagation.
- Flyway/Liquibase migration.

Giải thích chi tiết:

- Entity & PK: Mỗi entity cần khóa chính (`@Id`). Tạo id tự động: `@GeneratedValue(strategy=AUTO/IDENTITY/SEQUENCE)` tùy DB.
- Quan hệ:
  - `@ManyToOne` mặc định `FetchType.EAGER`, nên chuyển `LAZY` để tránh N+1 khi không cần.
  - `@OneToMany(mappedBy="order", cascade=CascadeType.ALL)` biểu diễn danh sách con. Tránh `EAGER` cho tập lớn.
  - `@ManyToMany` ít dùng cho bảng lớn, cân nhắc bảng trung gian (2 × OneToMany) để kiểm soát tốt hơn.
- Cascade: `PERSIST`, `MERGE`, `REMOVE`, `REFRESH`, `DETACH`. Chỉ bật khi muốn lan hành vi rõ ràng (ví dụ Order -> OrderItem).
- Transaction: `@Transactional` áp dụng ở service. Với đọc, dùng `readOnly=true` để Hibernate tối ưu. Isolation `READ_COMMITTED` thường đủ cho OLTP; nếu cần nhất quán cao, cân nhắc `REPEATABLE_READ`/`SERIALIZABLE` (đổi lại lock/hiệu năng).
- Truy vấn:

```java
@Query("select p from Product p where p.price >= :min order by p.price desc")
List<Product> findExpensive(@Param("min") BigDecimal min);
```

- Tối ưu N+1: Dùng `join fetch` hoặc `@EntityGraph` khi biết chắc cần dữ liệu liên quan.

Ví dụ code (PostgreSQL):

```xml
<!-- pom.xml -->
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
<dependency>
  <groupId>org.postgresql</groupId>
  <artifactId>postgresql</artifactId>
  <scope>runtime</scope>
</dependency>
```

```yaml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/shop
    username: shop
    password: shop
  jpa:
    hibernate:
      ddl-auto: validate
    show-sql: true
```

```java
@Entity
class Product {
  @Id @GeneratedValue Long id;
  String name;
  BigDecimal price;
}

interface ProductRepo extends JpaRepository<Product, Long> {
  List<Product> findByNameContainingIgnoreCase(String q);
}

@Service
class ProductService {
  private final ProductRepo repo;
  ProductService(ProductRepo repo){this.repo=repo;}
  @Transactional(readOnly=true)
  List<Product> search(String q){ return repo.findByNameContainingIgnoreCase(q); }
}

@RestController
@RequestMapping("/api/products")
class ProductController {
  private final ProductService svc;
  ProductController(ProductService svc){this.svc=svc;}
  @GetMapping public List<Product> all(@RequestParam(required=false) String q){
    return (q==null||q.isBlank())? svc.search("") : svc.search(q);
  }
}
```

Bài tập: Thiết kế entity `Order`, `OrderItem` và viết service tính tổng tiền có transaction.

Lưu ý production: Dùng migration (Flyway) để quản lý schema; chú ý N+1 query, dùng `fetch join`/`EntityGraph`.

Nâng cao (JPA/Hibernate):

- Khóa lạc quan: dùng `@Version` để tránh ghi đè cạnh tranh.

```java
@Entity class Inventory { @Id Long productId; int stock; @Version long v; }
```

- `@EntityGraph` hoặc `join fetch` để tránh N+1:

```java
@EntityGraph(attributePaths = {"items"})
Optional<Order> findById(Long id);
```

- Isolation transaction và read phenomena: READ_COMMITTED vs REPEATABLE_READ.
- Flyway migration ví dụ: `src/main/resources/db/migration/V1__init.sql`

```sql
create table product(id bigserial primary key, name varchar(200) not null, price numeric not null);
create index idx_product_name on product using gin (to_tsvector('simple', name));
```

### 6A. PostgreSQL & MySQL cơ bản (migrations, CRUD, index)

- Dependencies (Maven):

```xml
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
<dependency>
  <groupId>org.flywaydb</groupId>
  <artifactId>flyway-core</artifactId>
</dependency>
<dependency>
  <groupId>org.postgresql</groupId>
  <artifactId>postgresql</artifactId>
  <scope>runtime</scope>
</dependency>
<dependency>
  <groupId>com.mysql</groupId>
  <artifactId>mysql-connector-j</artifactId>
  <scope>runtime</scope>
</dependency>
```

- Entity + Repository với chỉ mục:

```java
@Entity @Table(name="products", indexes=@Index(name="idx_products_name", columnList="name"))
class Product { @Id @GeneratedValue Long id; String name; BigDecimal price; }

interface ProductRepo extends JpaRepository<Product, Long> {
  @Query("select p from Product p where lower(p.name) like lower(concat('%', :q, '%'))")
  List<Product> search(@Param("q") String q);
}
```

- Flyway: `V1__init.sql` (Postgres) và lưu ý MySQL (ENGINE/InnoDB, collation UTF8MB4).

```sql
-- Postgres
create table products(id bigserial primary key, name varchar(200) not null, price numeric not null);
create index idx_products_name on products using gin (to_tsvector('simple', name));
-- MySQL
create table products(
  id bigint primary key auto_increment,
  name varchar(200) not null,
  price decimal(19,2) not null
) engine=InnoDB default charset=utf8mb4 collate=utf8mb4_0900_ai_ci;
create index idx_products_name on products(name);
```

- EXPLAIN cơ bản: `EXPLAIN ANALYZE` (Postgres) và `EXPLAIN FORMAT=JSON` (MySQL) để kiểm tra index được hit.

### 6B. JPA nâng cao & tối ưu truy vấn

- Pessimistic Lock khi cập nhật tồn kho:

```java
@Transactional
public void reserveStock(Long productId, int qty){
  var p = repo.findById(productId, LockModeType.PESSIMISTIC_WRITE).orElseThrow();
  // ... cập nhật tồn kho
}
```

- Batch insert/update: cấu hình `hibernate.jdbc.batch_size=50`, dùng `saveAll` theo lô và flush/clear định kỳ.
- Projection/DTO: dùng interface‑based projection để tránh load cột không cần.
- JSON: MySQL `json_extract`, Postgres `jsonb_path_query_first` khi cần lưu metadata.
- Read‑replica: tách DataSource (read/write) và route theo annotation ở service (tham khảo Spring RoutingDataSource).

Checkpoint DB (6A/6B):

- Thực hiện EXPLAIN cho `search(q)` và chứng minh index hoạt động.
- Viết migration thêm chỉ mục tổng hợp và đo cải thiện truy vấn.
- Thiết kế chiến lược lock phù hợp khi 2 người mua cùng sản phẩm cuối.

Tóm tắt & Key Takeaways:

- Hiểu mapping quan hệ và kỹ thuật tránh N+1; kiểm soát transaction.
- Áp dụng migration để version hóa schema.
- Sử dụng optimistic locking để bảo vệ cập nhật đồng thời.

Checkpoint tự đánh giá:

- Khi nào dùng `@Transactional(readOnly=true)`? Ảnh hưởng đến Hibernate như thế nào?
- Khác nhau giữa `merge` và `save` trong JPA? Tình huống sử dụng?
- Viết JPQL để tìm sản phẩm giá > X và tên chứa Y.

---

<a id="ch7"></a>

## 7. REST API, Validation, Error Handling (Intermediate)

#### Giới thiệu

- Mục tiêu: thiết kế RESTful, validate dữ liệu, chuẩn hoá lỗi.
- Kiến thức nền: chương 5–6.
- Lý do: API ổn định cho frontends và dịch vụ khác.

#### Nội dung chi tiết

- Resource design, status code, pagination; Hibernate Validator; `@ControllerAdvice`.

#### Ví dụ code thực tế

- DTO `CreateProduct`, `@Valid`, `GlobalExceptionHandler` (đã có code trong chương).

#### Ứng dụng thực tế

- API sản phẩm/đơn hàng với filter/sort; error model chuẩn cho clients.

#### Tối ưu & best practice

- Idempotency cho POST; tiêu chuẩn hoá error codes; tài liệu hoá với OpenAPI.

#### Bổ sung hiện đại (OpenAPI)

```xml
<dependency>
  <groupId>org.springdoc</groupId>
  <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
  <version>2.5.0</version>
</dependency>
```

Truy cập Swagger UI tại `/swagger-ui.html`; cấu hình `servers`/security schemes cho JWT.

#### Bổ sung hiện đại (Problem Details - RFC7807)

```java
@RestControllerAdvice
class ProblemHandler {
  @ExceptionHandler(EntityNotFoundException.class)
  ResponseEntity<ProblemDetail> notFound(EntityNotFoundException e, HttpServletRequest req){
    var pd = ProblemDetail.forStatus(HttpStatus.NOT_FOUND);
    pd.setTitle("Entity not found");
    pd.setDetail(e.getMessage());
    pd.setProperty("instance", req.getRequestURI());
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(pd);
  }
}
```

#### Tóm tắt & bài tập

- Tóm tắt: API nhất quán và dễ tiêu thụ.
- Bài tập: thêm phân trang/sort và test lỗi validation.

Mục tiêu học:

- Thiết kế API chuẩn, versioning, DTO mapping, validation.

Thời lượng: 1 tuần

Nội dung:

- DTO vs Entity, MapStruct/record DTO.
- Validation: `@Valid`, `@NotBlank`, `@Email`, custom validator.
- Error handling: `@ControllerAdvice` + `@ExceptionHandler`.
- API versioning: URI `/v1`, header, hoặc content-negotiation.

Giải thích chi tiết:

- Thiết kế tài nguyên: mỗi tài nguyên có URL ổn định (`/api/v1/products/{id}`), dùng danh từ số nhiều; thao tác qua HTTP verbs (GET/POST/PUT/PATCH/DELETE). Trả status code phù hợp (201 khi tạo, 404 khi không tìm thấy, 400 khi dữ liệu sai).
- DTO vs Entity: Không expose entity trực tiếp để tránh rò rỉ field và coupling JPA. Dùng DTO records hoặc MapStruct để map.

```java
record ProductDto(Long id, String name, BigDecimal price){}
@GetMapping("/api/v1/products/{id}")
ResponseEntity<ProductDto> get(@PathVariable Long id){
  var p = repo.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
  return ResponseEntity.ok(new ProductDto(p.id, p.name, p.price));
}
```

- Validation: bật `spring-boot-starter-validation`, annotate DTO và dùng `@Valid` trên controller; viết validator custom khi cần logic đặc thù.
- Error handling: centralize với `@ControllerAdvice`, trả Problem JSON (RFC7807) để chuẩn hóa lỗi.
- Versioning: ưu tiên prefix `/v1`. Khi breaking, giữ `/v1` chạy song song `/v2` một thời gian chuyển tiếp.

Ví dụ:

```java
record CreateProductReq(@NotBlank String name, @NotNull BigDecimal price) {}
record ErrorRes(String code, String message, Instant timestamp) {}

@RestControllerAdvice
class ApiExceptionHandler {
  @ExceptionHandler(MethodArgumentNotValidException.class)
  ResponseEntity<ErrorRes> invalid(MethodArgumentNotValidException ex){
    String msg = ex.getBindingResult().getAllErrors().get(0).getDefaultMessage();
    return ResponseEntity.badRequest().body(new ErrorRes("VALIDATION_ERROR", msg, Instant.now()));
  }
}

@PostMapping("/api/products")
public Product create(@Valid @RequestBody CreateProductReq req){
  var p = new Product(); p.name=req.name(); p.price=req.price();
  return repo.save(p);
}
```

Bài tập: Thiết kế API `POST /api/orders` với validation và trả lỗi thân thiện.

Lưu ý production: Chuẩn hóa lỗi; bật CORS có kiểm soát nguồn; rate limiting ở gateway.

Nâng cao (REST chuẩn hóa):

- Chuẩn lỗi Problem Details (RFC7807):

```json
{
  "type": "https://api.example.com/errors/validation",
  "title": "Validation failed",
  "status": 400,
  "detail": "price must be positive",
  "instance": "/api/products"
}
```

- MapStruct mapping DTO↔Entity:

```java
@Mapper(componentModel = "spring") interface ProductMapper {
  Product toEntity(CreateProductReq req);
  ProductDto toDto(Product p);
}
```

- Versioning: ưu tiên `/v1`, và tách module cho `v2` khi breaking.
- Idempotency cho `POST` nhạy cảm (đơn hàng) bằng header `Idempotency-Key` + store tạm.

Tóm tắt & Key Takeaways:

- Thiết kế API có DTO, validation và xử lý lỗi chuẩn hóa.
- Tư duy idempotency ở endpoint tạo mới; quản lý version.
- Cấu hình CORS hợp lệ theo môi trường.

Checkpoint tự đánh giá:

- Viết `@ControllerAdvice` để trả Problem JSON cho `EntityNotFoundException`.
- Thiết kế DTO `UpdateProductReq` và mapping với MapStruct.
- Tạo `curl` minh họa lỗi validation và quan sát cấu trúc trả về.

---

<a id="ch8"></a>

## 8. Spring Security + JWT (Intermediate)

#### Giới thiệu

- Mục tiêu: xác thực/ủy quyền, JWT stateless.
- Kiến thức nền: chương 5–7.
- Lý do: bảo vệ tài nguyên, giảm rủi ro bảo mật phổ biến.

#### Nội dung chi tiết

- Filter chain, `SecurityFilterChain`, password encoder, JWT bearer, method security.

#### Ví dụ code thực tế

- Login phát hành JWT, `@PreAuthorize` (đã có code trong chương).

#### Ứng dụng thực tế

- Role/permission cho sản phẩm/đơn hàng; phân quyền theo chủ sở hữu.

#### Tối ưu & best practice

- TTL ngắn, refresh token rotation; revoke; cấu hình CORS.

#### Tóm tắt & bài tập

- Tóm tắt: bảo mật căn bản, sẵn sàng production.
- Bài tập: bảo vệ `POST /products` và viết test auth.

Mục tiêu học:

- Xác thực JWT, phân quyền RBAC, method security.

Thời lượng: 1 tuần

Nội dung:

- Filter chuỗi: `OncePerRequestFilter` trích Bearer token.
- `SecurityFilterChain` thay thế `WebSecurityConfigurerAdapter`.
- `@PreAuthorize` với `hasRole('ADMIN')`/`hasAuthority('product:read')`.
- Refresh token và revocation chiến lược.

Giải thích chi tiết:

- JWT gồm 3 phần: `header.payload.signature` (Base64URL). Server ký (HMAC/RS256) và client gửi qua header `Authorization: Bearer <token>`.
- Đăng nhập: verify username/password (BCrypt), sinh JWT access token TTL ngắn, refresh token TTL dài hơn.

```java
// Sinh JWT bằng jjwt
String token = Jwts.builder()
 .setSubject(user.getUsername())
 .claim("roles", List.of("ROLE_USER"))
 .setExpiration(Date.from(Instant.now().plusSeconds(3600)))
 .signWith(Keys.hmacShaKeyFor(secret.getBytes()), SignatureAlgorithm.HS256)
 .compact();
```

- Filter: parse JWT, set Authentication vào SecurityContext để Spring Security phân quyền.
- Method security: `@PreAuthorize("hasRole('ADMIN')")` bảo vệ ở service/controller; ưu tiên bảo vệ cả API và service layer.
- Refresh & revoke: lưu bảng refresh token (hash), rotate mỗi lần sử dụng, revoke khi logout hoặc nghi ngờ lộ.

Ví dụ cấu hình tối thiểu:

```xml
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-security</artifactId>
</dependency>
<dependency>
  <groupId>io.jsonwebtoken</groupId>
  <artifactId>jjwt-api</artifactId>
  <version>0.11.5</version>
</dependency>
```

```java
@Configuration
@EnableMethodSecurity
class SecurityConfig {
  @Bean SecurityFilterChain http(HttpSecurity http) throws Exception {
    return http.csrf(csrf->csrf.disable())
      .authorizeHttpRequests(auth->auth
        .requestMatchers("/actuator/health", "/auth/**").permitAll()
        .anyRequest().authenticated())
      .addFilterBefore(new JwtAuthFilter(), UsernamePasswordAuthenticationFilter.class)
      .build();
  }
}

class JwtAuthFilter extends OncePerRequestFilter {
  @Override protected void doFilterInternal(HttpServletRequest req, HttpServletResponse res, FilterChain fc)
      throws ServletException, IOException {
    String h = req.getHeader("Authorization");
    if(h!=null && h.startsWith("Bearer ")){
      String jwt = h.substring(7);
      // verify, parse claims → create Authentication
      var auth = new UsernamePasswordAuthenticationToken("user", null, List.of(new SimpleGrantedAuthority("ROLE_USER")));
      SecurityContextHolder.getContext().setAuthentication(auth);
    }
    fc.doFilter(req, res);
  }
}
```

RBAC mẫu (bảng):

- users(id, username, password_hash, enabled)
- roles(id, name)
- permissions(id, name)
- user_roles(user_id, role_id)
- role_permissions(role_id, permission_id)

Bài tập: Bảo vệ `/api/products` chỉ cho `ROLE_ADMIN` tạo, `ROLE_USER` chỉ đọc.

Lưu ý production: Lưu secret an toàn, rotate keys, thêm `@PreAuthorize` ở service.

Nâng cao (Security):

- Bcrypt/Argon2 cấu hình strength:

```java
@Bean PasswordEncoder encoder(){ return new BCryptPasswordEncoder(12); }
```

- Refresh token & revocation: bảng `refresh_tokens(id, user_id, token_hash, expires_at, revoked_at)`; rotate khi dùng.
- CORS an toàn:

```java
@Bean CorsConfigurationSource cors(){ var c=new CorsConfiguration(); c.setAllowedOrigins(List.of("https://app.example.com")); c.setAllowedMethods(List.of("GET","POST","PUT","DELETE")); c.setAllowCredentials(true); var s=new UrlBasedCorsConfigurationSource(); s.registerCorsConfiguration("/**", c); return s; }
```

- ABAC với SpEL: `@PreAuthorize("hasRole('ADMIN') or #userId == authentication.name")`.

Tóm tắt & Key Takeaways:

- Hiểu chuỗi filter, cấu hình `SecurityFilterChain`, và method security.
- Áp dụng refresh token rotation và token revocation an toàn.
- CORS cấu hình theo domain whitelist; mật khẩu băm mạnh.

Checkpoint tự đánh giá:

- Viết rule cho chỉ chủ đơn hàng được xem: `@PreAuthorize("hasAuthority('order:read') and #order.userId == principal.id")` (gợi ý dùng service để lấy owner).
- Trình bày chiến lược revoke token khi user logout.
- Cách chèn `JwtAuthenticationConverter` để map claims→authorities.

---

<a id="ch9"></a>

## 9. Message Queue: RabbitMQ/Kafka (Intermediate)

#### Giới thiệu

- Mục tiêu: giao tiếp async, decoupling, retry/dlq.
- Kiến thức nền: chương 6–8.
- Lý do: tăng thông lượng, độ bền và chống sốc tải.

#### Nội dung chi tiết

- RabbitMQ exchange/queue; Kafka topic/partition; consumer group; retry/dlq; idempotency.

#### Ví dụ code thực tế

- Producer/consumer, keying, idempotent handler (đã có code trong chương).

#### Ứng dụng thực tế

- Order → Payment → Notification; audit logs; event sourcing nhẹ.

#### Tối ưu & best practice

- Chọn key, partition; backoff; outbox pattern.

#### Tóm tắt & bài tập

- Tóm tắt: xử lý bất đồng bộ đáng tin cậy.
- Bài tập: thêm retry/dlq và kiểm thử bằng Testcontainers.

Mục tiêu học:

- Gửi/nhận sự kiện, thiết kế topic, idempotency.

Thời lượng: 1 tuần

Nội dung:

- RabbitMQ (exchange, queue, routing) và Kafka (topic, partition, consumer group).
- Dùng Spring for Rabbit/Kafka để publish/consume.
- Thiết kế event schema, versioning, idempotency key.

Giải thích chi tiết:

- RabbitMQ: broker theo mô hình message + routing. Exchange types: `direct` (exact key), `topic` (pattern), `fanout` (broadcast). Ack/nack điều khiển requeue; DLX (dead-letter exchange) để đẩy message lỗi sang hàng chờ khác.
- Kafka: log phân vùng, lưu trữ theo offset. Consumer group chia tải theo partition. Thứ tự đảm bảo trong 1 partition cùng key. Producer chọn partition bằng key để giữ thứ tự theo aggregate.
- Exactly-once vs at-least-once: Kafka hỗ trợ idempotent producer và transactional gửi, nhưng thực tế vẫn cần idempotency ở consumer bằng kho lưu eventId.
- Schema event: thêm `type`, `version`, `occurredAt`, `aggregateId` để tiến hóa schema an toàn. Dùng Avro/Protobuf khi thích hợp.

Ví dụ Kafka:

```xml
<dependency>
  <groupId>org.springframework.kafka</groupId>
  <artifactId>spring-kafka</artifactId>
</dependency>
```

```java
@Service
class OrderEventPublisher {
  private final KafkaTemplate<String, String> kafka;
  OrderEventPublisher(KafkaTemplate<String,String> kafka){this.kafka=kafka;}
  void publishOrderCreated(String orderId){
    kafka.send("order.events", orderId, "{\"type\":\"ORDER_CREATED\",\"orderId\":\""+orderId+"\"}");
  }
}

@Component
class OrderEventListener {
  @KafkaListener(topics = "order.events", groupId = "billing")
  public void onMessage(String payload){
    // parse JSON và xử lý
  }
}
```

Bài tập: Khi tạo Order, publish sự kiện; service Inventory consume để trừ tồn kho.

Lưu ý production: Chia partition theo key; đặt `max.poll.interval.ms`, `concurrency`; retry+DLQ.

Nâng cao (MQ thực hành):

- RabbitMQ ví dụ (Spring AMQP):

```xml
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-amqp</artifactId>
</dependency>
```

```java
@Configuration class AmqpConfig {
  @Bean TopicExchange ex(){ return new TopicExchange("order.ex"); }
  @Bean Queue q(){ return new Queue("order.q"); }
  @Bean Binding b(Queue q, TopicExchange ex){ return BindingBuilder.bind(q).to(ex).with("order.*"); }
}
@Service class OrderPublisher { private final AmqpTemplate t; OrderPublisher(AmqpTemplate t){this.t=t;} void created(String id){ t.convertAndSend("order.ex","order.created", id);} }
@RabbitListener(queues = "order.q") void handle(String id){ /* consume */ }
```

- Idempotency consumer: lưu `processed_events(event_id, consumer)` để bỏ qua trùng.
- Kafka consumer tuning: `max.poll.records`, `fetch.min.bytes`, `enable.auto.commit=false` + manual commit sau xử lý thành công.
- Exactly-once vs At-least-once: dùng idempotency + transactional producer (Kafka) cho gần exactly-once.

#### Bổ sung hiện đại (Outbox, DLQ, Idempotency)

- Outbox pattern (JPA) để không mất sự kiện khi commit DB thất bại hoặc producer lỗi:

```java
@Entity @Table(name="outbox_events")
class OutboxEvent { @Id @GeneratedValue Long id; String aggregateType; String aggregateId; String type; @Column(columnDefinition="text") String payload; Instant occurredAt; }

@Transactional
public void placeOrder(Order order){
  orderRepo.save(order);
  var evt = new OutboxEvent();
  evt.aggregateType = "Order"; evt.aggregateId = order.id.toString(); evt.type = "ORDER_CREATED";
  evt.payload = objectMapper.writeValueAsString(Map.of("orderId", order.id));
  evt.occurredAt = Instant.now();
  outboxRepo.save(evt);
  // Commit ở đây đảm bảo dữ liệu và sự kiện được ghi đồng thời
}

// Publisher (định kỳ) đọc outbox và gửi Kafka, sau đó đánh dấu đã gửi
@Scheduled(fixedDelay = 1000)
void publishOutbox(){
  List<OutboxEvent> batch = outboxRepo.findTop100ByOrderByIdAsc();
  for (var e : batch) {
    kafka.send("order.events", e.aggregateId, e.payload);
    outboxRepo.delete(e); // hoặc đánh dấu processed
  }
}
```

- Kafka DLQ: cấu hình container error handler để gửi lỗi sang topic `.DLT`:

```java
@Bean
ConcurrentKafkaListenerContainerFactory<String,String> kafkaFactory(ConsumerFactory<String,String> cf, KafkaTemplate<String,String> tpl){
  var f = new ConcurrentKafkaListenerContainerFactory<String,String>(); f.setConsumerFactory(cf);
  f.setCommonErrorHandler(new DefaultErrorHandler(new DeadLetterPublishingRecoverer(tpl), new ExponentialBackOffWithMaxRetries(5)));
  return f;
}
```

- Idempotency với Redis (chống xử lý trùng lặp):

```java
boolean firstTime = Boolean.TRUE.equals(redis.setIfAbsent("evt:"+eventId, "1", Duration.ofHours(6)));
if (!firstTime) return; // đã xử lý
// ... xử lý sự kiện an toàn
```

- Reactive messaging (Reactor Kafka) cho pipeline tốc độ cao (tuỳ chọn):

```java
ReceiverOptions<String,String> opts = ReceiverOptions.<String,String>create(props).subscription(Set.of("order.events"));
KafkaReceiver.create(opts).receive()
  .concatMap(rec -> process(rec.value()).then(Mono.fromRunnable(() -> rec.receiverOffset().acknowledge())))
  .onErrorContinue((ex, d) -> log.error("err", ex))
  .subscribe();
```

#### Bổ sung hiện đại (Kafka Streams)

```xml
<dependency>
  <groupId>org.apache.kafka</groupId>
  <artifactId>kafka-streams</artifactId>
</dependency>
```

Ví dụ topology đếm sự kiện theo key (đọc `order.events` và ghi `order.events.count`):

```java
@Bean ApplicationRunner streamsRunner(){
  return args -> {
    Properties p = new Properties();
    p.put(StreamsConfig.APPLICATION_ID_CONFIG, "orders-agg");
    p.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
    StreamsBuilder b = new StreamsBuilder();
    KStream<String,String> events = b.stream("order.events");
    events.groupByKey().count().toStream().to("order.events.count");
    KafkaStreams streams = new KafkaStreams(b.build(), p);
    streams.start();
  };
}
```

Tóm tắt & Key Takeaways:

- Phân biệt Rabbbit vs Kafka; chọn theo use-case (command vs event streaming).
- Hiểu partitioning, consumer group, và idempotency thực thi ở consumer.
- Thiết lập retry + DLQ để cô lập lỗi dữ liệu.

Checkpoint tự đánh giá:

- Chọn key partition cho sự kiện ORDER_CREATED? Vì sao? (Gợi ý: `orderId` để giữ thứ tự.)
- Viết cấu hình concurrency cho KafkaListener xử lý song song an toàn.
- Minh họa chiến lược retry có backoff và DLQ cho message lỗi.

---

<a id="ch10"></a>

## 10. Hiệu năng & Caching, HikariCP, Actuator (Advanced)

#### Giới thiệu

- Mục tiêu: tối ưu latency/throughput, tận dụng cache, cấu hình pool, quan sát.
- Kiến thức nền: chương 5–9.
- Lý do: giảm tải DB, ổn định dưới áp lực.

#### Nội dung chi tiết

- Redis cache, rate limit; HikariCP sizing; metrics/tracing với Actuator.

#### Ví dụ code thực tế

- `@Cacheable`, cấu hình HikariCP, metrics Prometheus (đã có code trong chương).

#### Ứng dụng thực tế

- Cache sản phẩm/hàng tồn; circuit breaker cho dịch vụ phụ thuộc.

#### Tối ưu & best practice

- Tính toán pool size; tránh cache stampede; bật structured logging.

#### Tóm tắt & bài tập

- Tóm tắt: biết đo và cải thiện hiệu năng có kỷ luật.
- Bài tập: thêm cache Redis cho GET sản phẩm, quan sát metrics.

Mục tiêu học:

- Dùng Redis cache, tối ưu connection pool, metrics.

Thời lượng: 1 tuần

Nội dung:

- `spring-boot-starter-cache` + Redis, key design, TTL, cache invalidation.
- HikariCP tuning: pool size ~ 2×CPU cores, timeouts.
- Actuator + Micrometer + Prometheus.

Ví dụ Redis cache:

```xml
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-data-redis</artifactId>
</dependency>
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-cache</artifactId>
</dependency>
```

```java
@EnableCaching
@Service
class CachedProductService {
  private final ProductRepo repo;
  CachedProductService(ProductRepo repo){this.repo=repo;}
  @Cacheable(cacheNames="product", key="#id")
  public Product get(Long id){ return repo.findById(id).orElseThrow(); }
}
```

```yaml
spring:
  redis:
    host: localhost
    port: 6379
  datasource:
    hikari:
      maximum-pool-size: 16
management:
  endpoints:
    web:
      exposure:
        include: health,info,metrics,prometheus
```

Bài tập: Thêm cache cho `search(q)` với TTL 5 phút; xóa cache khi cập nhật sản phẩm.

Lưu ý production: Tránh cache stampede (lock, jitter TTL), warmup cache, theo dõi hit ratio.

#### Bổ sung hiện đại (Cache & Pool)

- Chống cache stampede với Spring Cache: `@Cacheable(sync = true)` để đồng bộ hoá tải lần đầu cho cùng key.

```java
@Cacheable(cacheNames="product", key="#id", sync = true)
public Product get(Long id){ ... }
```

- TTL + Jitter (random thêm 10–20%): tránh “cache avalanche” khi đồng loạt hết hạn.
- Two-level cache: Caffeine (in-memory) phía trước Redis để giảm độ trễ đọc nóng.
- HikariCP sizing dựa trên I/O bound: dùng công thức Little’s Law, đo thời gian query P95 để tinh chỉnh.

#### Bổ sung hiện đại (Virtual Threads & Native Image)

- Virtual Threads (Java 21+) cho workload I/O-bound (Spring Boot 3.2+):

```java
@Bean Executor taskExecutor(){
  return Executors.newVirtualThreadPerTaskExecutor();
}
```

```yaml
spring:
  threads:
    virtual:
      enabled: true
```

Lưu ý: JDBC vẫn blocking theo kết nối; virtual threads giúp tận dụng tốt tài nguyên khi có nhiều I/O chờ.

- Native image (GraalVM) cho startup nhanh, footprint nhỏ:

```bash
mvn -Pnative native:compile           # build nhị phân native
# Hoặc dùng buildpack
mvn -DskipTests spring-boot:build-image -Pnative
```

Khi cần, thêm runtime hints hoặc `@RegisterReflectionForBinding` cho JSON binding đặc biệt.

Nâng cao (Hiệu năng JVM & Metrics):

- GC và container: dùng G1GC (mặc định JDK17), gợi ý flags:

```
-XX:+UseStringDeduplication -XX:MaxRAMPercentage=75.0 -XX:+ExitOnOutOfMemoryError
```

- HikariCP: bắt đầu với `minIdle=CPU cores`, `maxPoolSize ~ 2×cores` rồi đo lường.
- Micrometer:

```java
@Component class CheckoutMetrics {
  private final Counter orders;
  CheckoutMetrics(MeterRegistry r){ orders = Counter.builder("orders.created").register(r); }
  void inc(){ orders.increment(); }
}
```

- Cache invalidation chiến lược: write-through vs write-behind; cache-aside phổ biến.

Tóm tắt & Key Takeaways:

- Tối ưu pool và cache dựa trên đo đạc, không cảm tính.
- Xuất metrics và theo dõi SLA/SLO với Prometheus+Grafana.
- Tránh stampede bằng lock/jitter và warm-up dữ liệu nóng.

Checkpoint tự đánh giá:

- Trình bày tác động của `maximumPoolSize` quá lớn lên DB.
- Thiết kế key Redis để cache kết quả tìm kiếm theo `q` và `page`.
- Tạo một `Timer` Micrometer đo latency endpoint `/api/orders`.

### 10B. Redis từ cơ bản đến nâng cao

- Dependencies:

```xml
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-data-redis</artifactId>
</dependency>
```

- Spring Cache + RedisTemplate:

```java
@EnableCaching
@Configuration
class RedisCfg {
  @Bean RedisTemplate<String, String> redisTemplate(LettuceConnectionFactory cf){
    var t = new RedisTemplate<String,String>(); t.setConnectionFactory(cf); return t;
  }
}

@Cacheable(cacheNames="user", key="#id")
public User getUser(long id){ ... }
```

- Redis Pub/Sub và Streams:

```java
// publish stream
var rec = StreamRecords.objectBacked(Map.of("orderId","1","type","CREATED")).withStreamKey("order.events");
stringRedisTemplate.opsForStream().add(rec);
// consumer group (pseudo)
stringRedisTemplate.opsForStream().read(Consumer.from("grp","c1"), StreamReadOptions.empty().count(10), StreamOffset.create("order.events", ReadOffset.lastConsumed()))
```

- Rate limiting (token bucket, Lua) và distributed lock (Redisson) cho tác vụ định kỳ/critical sections.
- Redis Cluster/Sentinel: lưu ý topology, failover và key hashing.

Checkpoint Redis (10B):

- Viết demo consumer group đọc từ Redis Streams và đảm bảo idempotency.
- Triển khai rate limiting 100 req/minute theo user với Lua hoặc Bucket4j.
- Tạo cache key cho search có tham số trang/sort, xử lý invalidation khi cập nhật.

---

<a id="ch11"></a>

## 11. Reactive: Spring WebFlux (Advanced)

#### Giới thiệu

- Mục tiêu: xử lý I/O quy mô lớn non‑blocking, stream dữ liệu.
- Kiến thức nền: Java streams, concurrency; chương 5–10.
- Lý do: tiết kiệm tài nguyên, phù hợp realtime/chat.

#### Nội dung chi tiết

- Mono/Flux, backpressure; router functions; R2DBC/Mongo reactive; SSE/WebSocket.

#### Ví dụ code thực tế

- WebFlux controller, reactive repo, SSE stream (đã có code trong chương).

#### Ứng dụng thực tế

- Bảng tin realtime, thông báo đẩy, xử lý log/metrics quy mô lớn.

#### Tối ưu & best practice

- Giới hạn thread; không block trong reactive; publishOn/subscribeOn đúng chỗ.

#### Tóm tắt & bài tập

- Tóm tắt: khi nào chọn reactive, khi nào không.
- Bài tập: viết SSE `/events` và test backpressure.

Mục tiêu học:

- Hiểu WebFlux, khi nào dùng reactive vs blocking.

Thời lượng: 1 tuần

Nội dung:

- Reactor `Mono`/`Flux`, backpressure, thread model.
- Khi dùng: I/O bound, nhiều kết nối, streaming; tránh nếu logic CPU-bound thuần.

Ví dụ endpoint reactive:

```xml
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-webflux</artifactId>
</dependency>
```

```java
@RestController
@RequestMapping("/rx")
class RxController {
  @GetMapping("/numbers")
  Flux<Integer> numbers(){ return Flux.range(1, 10).delayElements(Duration.ofMillis(100)); }
}
```

Bài tập: Viết endpoint stream log hệ thống theo thời gian thực (SSE).

Lưu ý production: Cần non-blocking driver (R2DBC) nếu muốn full reactive data path.

Nâng cao (Reactive):

- Tránh chặn: khi bắt buộc gọi blocking (JDBC), chuyển sang `boundedElastic()` và cân nhắc thread starvation.

```java
Mono.fromCallable(() -> repo.findById(id)).subscribeOn(Schedulers.boundedElastic())
```

- Context & logging (MDC): dùng `Hooks.enableAutomaticContextPropagation()` và `log()`/`doOnEach`.
- Backpressure: sử dụng `onBackpressureBuffer`/`drop` phù hợp use-case stream nóng.

#### Bổ sung hiện đại (R2DBC, MDC, RSocket)

- R2DBC Postgres mẫu và repository reactive:

```xml
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-data-r2dbc</artifactId>
</dependency>
<dependency>
  <groupId>io.r2dbc</groupId>
  <artifactId>r2dbc-postgresql</artifactId>
  <scope>runtime</scope>
</dependency>
```

```java
@Table("products")
record ProductRx(@Id Long id, String name, BigDecimal price){}
interface ProductRxRepo extends ReactiveCrudRepository<ProductRx, Long> {
  Flux<ProductRx> findByNameContainsIgnoreCase(String q);
}
```

- MDC/Tracing propagation trong Reactor:

```java
Hooks.enableAutomaticContextPropagation();
Mono.deferContextual(ctx -> {
  MDC.put("traceId", ctx.getOrDefault("traceId", "-"));
  log.info("processing");
  return Mono.empty();
}).contextWrite(Context.of("traceId", tracer.currentSpan().context().traceId()))
 .subscribe();
```

- RSocket (reactive messaging) endpoint đơn giản:

```java
@Controller
class RSocketCtrl {
  @MessageMapping("echo")
  Flux<String> echo(Flux<String> in){ return in.map(s -> "echo:"+s); }
}
```

Tóm tắt & Key Takeaways:

- WebFlux phù hợp IO-bound; hạn chế khi logic CPU-bound hoặc cần JDBC blocking.
- Hiểu backpressure và context propagation để debug/tracing.

Checkpoint tự đánh giá:

- Phân biệt `publishOn` vs `subscribeOn` và tác động thread.
- Viết SSE trả log hệ thống theo nhãn `app=product`.
- Trình bày cách kết nối R2DBC Postgres và bẫy thường gặp.

### 11B. Reactive MongoDB & Change Streams

- Dependencies:

```xml
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-data-mongodb-reactive</artifactId>
</dependency>
```

- Document + Reactive Repository + TTL Index:

```java
@Document("users")
class UserDoc { @Id String id; @Indexed(unique=true) String email; @Indexed(expireAfterSeconds=3600) Instant lastSeen; }
interface UserRepo extends ReactiveMongoRepository<UserDoc, String> { Flux<UserDoc> findByEmailRegex(String regex); }
```

- Aggregation pipeline và Change Streams:

```java
var agg = Aggregation.newAggregation(match(Criteria.where("status").is("PAID")), group("userId").sum("total").as("sum"));
reactiveMongoTemplate.aggregate(agg, "orders", Document.class).subscribe();
reactiveMongoTemplate.changeStream("orders", ChangeStreamOptions.empty(), Document.class)
  .doOnNext(e -> log.info("Changed: {}", e)).subscribe();
```

- Sharding, write concern, read preference: khi scale, chọn `majority` cho giao dịch quan trọng; `secondaryPreferred` cho đọc.

Checkpoint Mongo (11B):

- Tạo TTL index cho `lastSeen` và xác nhận tài liệu tự xóa.
- Viết aggregation nhóm tổng chi tiêu theo user; so sánh latency có index/không index.
- Nghe change stream và cập nhật cache realtime khi đơn hàng đổi trạng thái.

---

<a id="ch12"></a>

## 12. Kiến trúc & Tổ chức mã (Advanced)

#### Giới thiệu

- Mục tiêu: Hexagonal, DDD‑lite, module hoá.
- Kiến thức nền: chương 2–11.
- Lý do: dễ bảo trì, test, mở rộng đội ngũ.

#### Nội dung chi tiết

- Domain/Application/Infrastructure; ports/adapters; boundaries; package by feature.

#### Ví dụ code thực tế

- Service domain thuần Java, adapter REST/DB/MQ (mẫu trong chương).

#### Ứng dụng thực tế

- Chia module product/order/payment; chiến lược giao tiếp giữa bounded contexts.

#### Tối ưu & best practice

- Chống rò rỉ hạ tầng vào domain; interface‑driven; anti‑corruption layer.

#### Tóm tắt & bài tập

- Tóm tắt: cấu trúc sạch và kiểm soát phụ thuộc.
- Bài tập: refactor một module theo Hexagonal.

Mục tiêu học:

- Áp dụng Hexagonal/Ports-Adapters, tách domain/service/inbound/outbound.

Thời lượng: 1 tuần

Nội dung:

- Package by feature vs by layer; tách module.
- DDD-lite: entity, value object, domain service, application service.

ASCII sơ đồ:

```
[HTTP/GraphQL/gRPC] → Inbound Adapter → Application Service → Domain → Outbound Port → [DB/MQ/External]
```

Ví dụ Port/Adapter:

```java
// Port
interface PaymentPort { boolean charge(String orderId, BigDecimal amount); }
// Adapter
@Component class StripeAdapter implements PaymentPort { /* call Stripe */ }
// App Service
@Service class CheckoutUseCase { private final PaymentPort port; /* ... */ }
```

Bài tập: Chuyển `OrderService` sang mô hình port/adapters; mock Port trong test.

Lưu ý production: Tách hợp đồng ở port, cô lập adapter; module hóa để giới hạn phụ thuộc.

Nâng cao (Kiến trúc):

- Cấu trúc module ví dụ:

```
app/ (Spring Boot) → phụ thuộc application/, adapters/
domain/ (pure Java, no Spring)
application/ (use-cases, ports)
adapters/
  inbound-rest/
  outbound-jpa/
  outbound-kafka/
```

- Tư duy domain: invariants và policy trong domain service; anti-corruption layer khi tích hợp hệ ngoài.
- Boundary: định nghĩa port ở application; adapter implement port và inject vào use-case.

#### Bổ sung hiện đại (ArchUnit rules)

```java
@AnalyzeClasses(packages = "com.example")
class ArchitectureTest {
  @ArchTest static final ArchRule domain_is_pure = noClasses()
    .that().resideInAPackage("..domain..")
    .should().dependOnClassesThat().resideInAnyPackage("..spring..", "..adapter..", "..infrastructure..");
}
```

#### Bổ sung hiện đại (CQRS & Event Sourcing)

- Phân tách ghi/đọc: lệnh (command) cập nhật state + ghi event; phần đọc (query) build read models tối ưu truy vấn.

```java
// Command handler
@Transactional
public void handle(CreateOrder cmd){
  var order = Order.create(cmd.customerId(), cmd.items());
  orderRepo.save(order);
  outboxRepo.save(OutboxEvent.from(order.toOrderCreatedEvent()));
}

// Projector cập nhật read model
@KafkaListener(topics = "order.events", groupId = "read-model")
void onOrderCreated(String json){
  var e = mapper.readValue(json, OrderCreated.class);
  readModelRepo.upsert(new OrderView(e.orderId(), e.total(), e.status()));
}
```

- Read model lưu ở storage phù hợp (Elasticsearch/Mongo/Redis) để phục vụ truy vấn nhanh; xử lý eventual consistency ở UI.

Tóm tắt & Key Takeaways:

- Packaging by feature và tách domain giúp dễ bảo trì, test, thay thế adapter.
- Port/Adapter cô lập phụ thuộc framework; domain thuần Java.

Checkpoint tự đánh giá:

- Vẽ lại dependency rules giữa module trên.
- Xác định Port cho Inventory khi chuyển kho: `reserve`, `release` cần idempotent?
- Viết test cho use-case checkout với mock PaymentPort trả lỗi.

---

<a id="ch13"></a>

## 13. Microservices: gRPC, GraphQL, SAGA, Outbox (Expert)

#### Giới thiệu

- Mục tiêu: giao tiếp đa giao thức, nhất quán cuối cùng, chống mất dữ liệu.
- Kiến thức nền: chương 7–12.
- Lý do: mở rộng hệ thống phức tạp, tối ưu hoá đúng domain.

#### Nội dung chi tiết

- gRPC unary/streaming; GraphQL schema/resolver; coordinator/choreography SAGA; outbox/idempotency.

#### Ví dụ code thực tế

- API GraphQL, proto gRPC, SAGA mẫu với outbox (đã có code trong chương).

#### Ứng dụng thực tế

- Đơn hàng đa bước: reserve stock → charge → ship; query tổng hợp với GraphQL.

#### Tối ưu & best practice

- Timeout/retry/budget; theo dõi saga; chọn choreography khi phù hợp.

#### Tóm tắt & bài tập

- Tóm tắt: nền tảng microservices sẵn sàng mở rộng.
- Bài tập: thêm outbox cho sự kiện `OrderCreated`.

Mục tiêu học:

- Giao tiếp service-to-service, schema GraphQL, điều phối giao dịch phân tán.

Thời lượng: 2 tuần

Nội dung:

- gRPC: hiệu năng, strongly-typed; dùng cho nội bộ.
- GraphQL: query/mutation/subscription cho BFF.
- SAGA: orchestrator vs choreographer; Outbox pattern + relay đến Kafka.
- Idempotency key, exactly-once vs at-least-once.

Ví dụ gRPC proto:

```proto
syntax = "proto3";
package billing;
service BillingService { rpc Charge(ChargeReq) returns (ChargeRes); }
message ChargeReq { string orderId = 1; int64 amount = 2; }
message ChargeRes { bool ok = 1; string txId = 2; }
```

Ví dụ GraphQL schema (product):

```graphql
type Product {
  id: ID!
  name: String!
  price: Float!
}

type Query {
  products(q: String): [Product]!
}

type Mutation {
  createProduct(name: String!, price: Float!): Product!
}

type Subscription {
  priceChanged(productId: ID!): Product
}
```

SAGA checkout (choreography):

- OrderCreated → ReserveInventory → PaymentCharge → Confirm/Cancel Order.
- Outbox: ghi event vào bảng outbox trong cùng transaction, relayer publish ra Kafka.

Bài tập: Thiết kế outbox table và một relayer (batch) đẩy event sang Kafka.

Lưu ý production: Quản lý schema evolution (Protobuf/Avro), consumer group, retry, backoff.

Nâng cao (Microservices thực chiến):

- Outbox DDL:

```sql
create table outbox (
  id uuid primary key,
  aggregate_type varchar(64) not null,
  aggregate_id varchar(64) not null,
  event_type varchar(64) not null,
  payload jsonb not null,
  created_at timestamptz default now(),
  processed boolean default false
);
create index on outbox(processed, created_at);
```

- Relay (pseudo-code):

```java
@Transactional
List<Outbox> batch = repo.findTop100ByProcessedFalseOrderByCreatedAt();
batch.forEach(e -> kafka.send(topic(e), e.aggregateId(), e.payload()));
repo.markProcessed(batch);
```

- gRPC client (Spring):

```java
@Bean BillingServiceGrpc.BillingServiceBlockingStub stub(ManagedChannel ch){ return BillingServiceGrpc.newBlockingStub(ch); }
```

- GraphQL subscription (WebSocket): dùng protocol graphql-ws; đảm bảo auth token refresh.
- Orchestrator vs choreography: chọn orchestrator khi cần điều phối tập trung/compensation phức tạp.

#### Bổ sung hiện đại (Spring Cloud & Resilience)

- Config/Discovery:

```xml
<dependency><groupId>org.springframework.cloud</groupId><artifactId>spring-cloud-starter-config</artifactId></dependency>
<dependency><groupId>org.springframework.cloud</groupId><artifactId>spring-cloud-starter-netflix-eureka-client</artifactId></dependency>
```

- Gateway (Spring Cloud Gateway) cấu hình routes:

```yaml
spring:
  cloud:
    gateway:
      routes:
        - id: product
          uri: http://localhost:8080
          predicates: [Path=/api/products/**]
        - id: order
          uri: lb://order-service
          predicates: [Path=/api/orders/**]
```

- Resilience4j CircuitBreaker/Retry/RateLimiter:

```xml
<dependency><groupId>io.github.resilience4j</groupId><artifactId>resilience4j-spring-boot3</artifactId></dependency>
```

```java
@CircuitBreaker(name = "payment", fallbackMethod = "fallback")
public PaymentRes pay(...) { /* call remote */ }
```

#### Bổ sung hiện đại (GraphQL Spring)

```xml
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-graphql</artifactId>
</dependency>
```

```java
@Controller
class ProductGraphql {
  private final ProductService svc;
  ProductGraphql(ProductService svc){ this.svc = svc; }
  @QueryMapping
  List<ProductDto> products(@Argument String q){ return svc.search(q).stream().map(ProductDto::from).toList(); }
}
```

#### Bổ sung hiện đại (gRPC plugin & Service)

```xml
<plugin>
  <groupId>io.grpc</groupId>
  <artifactId>protoc-gen-grpc-java</artifactId>
  <version>1.64.0</version>
</plugin>
```

```java
@GrpcService
class BillingGrpc extends BillingServiceGrpc.BillingServiceImplBase {
  @Override public void charge(ChargeReq req, StreamObserver<ChargeRes> out){
    boolean ok = paymentPort.charge(req.getOrderId(), BigDecimal.valueOf(req.getAmount()));
    out.onNext(ChargeRes.newBuilder().setOk(ok).build()); out.onCompleted();
  }
}
```

Tóm tắt & Key Takeaways:

- Outbox+relay là nền tảng chống mất sự kiện và đảm bảo thứ tự per-aggregate.
- Chọn kênh: gRPC cho nội bộ latency thấp; GraphQL cho BFF hướng client.
- Saga cần idempotency và chiến lược bù trừ rõ ràng.

Checkpoint tự đánh giá:

- Thiết kế topic/partition cho events đơn hàng mức 10k TPS, tiêu chí chọn key?
- Viết flow compensation khi Payment thất bại sau ReserveInventory.
- Trình bày chiến lược evolve schema event mà không phá hỏng consumer cũ.

---

<a id="ch14"></a>

## 14. Quan sát & DevOps: Docker, K8s, CI/CD, OpenTelemetry (Expert)

#### Giới thiệu

- Mục tiêu: đóng gói, triển khai, quan sát end‑to‑end.
- Kiến thức nền: chương 5–13.
- Lý do: vận hành an toàn, rollback nhanh, đo đạc liên tục.

#### Nội dung chi tiết

- Dockerfile, compose; manifests K8s; GH Actions; metrics/traces/logs OTel.

#### Ví dụ code thực tế

- Pipeline CI rút gọn, compose Postgres/Redis/Kafka (đã có trong chương/phụ lục).

#### Ứng dụng thực tế

- Triển khai các dịch vụ mẫu; thiết lập giám sát sự cố và cảnh báo.

#### Tối ưu & best practice

- Immutable image; blue/green/canary; budget quan sát.

#### Tóm tắt & bài tập

- Tóm tắt: từ build đến vận hành có kiểm soát.
- Bài tập: thêm traceId vào log và dashboard metrics.

Mục tiêu học:

- Container hóa, triển khai K8s, pipeline CI/CD, metrics+tracing.

Thời lượng: 2 tuần

Nội dung:

- Dockerfile multi-stage, giảm kích thước image.
- K8s: Deployment, Service, Ingress, ConfigMap, Secret, HPA, probes, PDB.
- CI/CD GitHub Actions: build → test → image → deploy.
- Observability: Micrometer + Prometheus, OpenTelemetry tracing.

#### Bổ sung hiện đại (OpenTelemetry & Probes)

- OpenTelemetry Java Agent (không cần sửa mã):

```bash
JAVA_TOOL_OPTIONS="-javaagent:/otel/javaagent.jar" \
OTEL_EXPORTER_OTLP_ENDPOINT="http://otel-collector:4317" \
OTEL_SERVICE_NAME="product-service" \
OTEL_METRICS_EXPORTER=otlp \
java -jar app.jar
```

- Spring Boot Micrometer Tracing → OTel (yml):

```yaml
management:
  tracing:
    sampling:
      probability: 1.0
  otlp:
    tracing:
      endpoint: http://otel-collector:4317
```

- Probes: map `/actuator/health/readiness` cho readiness, `/actuator/health/liveness` cho liveness (Spring Boot 3+):

```yaml
management:
  endpoint:
    health:
      probes:
        enabled: true
```

#### Bổ sung hiện đại (OTel Collector & Log Correlation)

- docker-compose Collector rút gọn (OTLP gRPC):

```yaml
services:
  otel-collector:
    image: otel/opentelemetry-collector-contrib:0.100.0
    command: ["--config=/etc/otelcol-config.yaml"]
    volumes: ["./otelcol-config.yaml:/etc/otelcol-config.yaml:ro"]
    ports: ["4317:4317", "4318:4318"]
```

- Logback pattern thêm `traceId`/`spanId` (nếu dùng pattern text):

```
%d{ISO8601} [%thread] %-5level %logger{36} - traceId=%X{trace_id} spanId=%X{span_id} %msg%n
```

Ví dụ Dockerfile:

```dockerfile
# syntax=docker/dockerfile:1
FROM maven:3.9-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN mvn -q -DskipTests package

FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=build /app/target/app.jar app.jar
ENV JAVA_OPTS="-XX:MaxRAMPercentage=75.0"
ENTRYPOINT ["sh","-c","java $JAVA_OPTS -jar app.jar"]
```

Ví dụ k8s manifests (rút gọn):

```yaml
apiVersion: apps/v1
kind: Deployment
metadata: { name: product-svc }
spec:
  replicas: 2
  selector: { matchLabels: { app: product } }
  template:
    metadata: { labels: { app: product } }
    spec:
      containers:
        - name: app
          image: ghcr.io/org/product:1.0.0
          ports: [{ containerPort: 8080 }]
          readinessProbe:
            { httpGet: { path: /actuator/health, port: 8080 }, initialDelaySeconds: 5 }
          livenessProbe:
            { httpGet: { path: /actuator/health, port: 8080 }, initialDelaySeconds: 15 }
---
apiVersion: v1
kind: Service
metadata: { name: product }
spec:
  selector: { app: product }
  ports: [{ port: 80, targetPort: 8080 }]
```

Bài tập: Tạo GitHub Actions workflow build+push image lên GHCR/DockerHub.

Lưu ý production: Sử dụng secrets an toàn, ký image (cosign), rollout chiến lược, autoscaling.

Bổ sung manifests vận hành:

```yaml
apiVersion: autoscaling/v2
kind: HorizontalPodAutoscaler
metadata: { name: product-hpa }
spec:
  minReplicas: 2
  maxReplicas: 10
  scaleTargetRef: { apiVersion: apps/v1, kind: Deployment, name: product-svc }
  metrics:
    - type: Resource
      resource:
        name: cpu
        target: { type: Utilization, averageUtilization: 70 }
---
apiVersion: policy/v1
kind: PodDisruptionBudget
metadata: { name: product-pdb }
spec:
  minAvailable: 1
  selector: { matchLabels: { app: product } }
---
apiVersion: networking.k8s.io/v1
kind: Ingress
metadata: { name: product-ing }
spec:
  rules:
    - host: api.example.com
      http:
        paths:
          - path: /products
            pathType: Prefix
            backend:
              service: { name: product, port: { number: 80 } }
---
apiVersion: v1
kind: ConfigMap
metadata: { name: product-config }
data:
  APPLICATION_YML: |
    app:
      greeting: "Xin chào"
---
apiVersion: v1
kind: Secret
metadata: { name: product-secrets }
type: Opaque
stringData:
  DB_PASSWORD: "s3cr3t"
```

CI/CD & Observability nâng cao:

- GitHub Actions cache Maven:

```yaml
- uses: actions/cache@v4
  with:
    path: ~/.m2/repository
    key: m2-${{ runner.os }}-${{ hashFiles('**/pom.xml') }}
```

- OpenTelemetry Java Agent:

```bash
java -javaagent:opentelemetry-javaagent.jar \
  -Dotel.service.name=product \
  -Dotel.exporter.otlp.endpoint=http://otel-collector:4317 \
  -jar app.jar
```

Tóm tắt & Key Takeaways:

- K8s vận hành: requests/limits, HPA, PDB, Ingress, ConfigMap/Secret.
- CI/CD cần cache build, quét bảo mật, và quản lý secrets an toàn.
- OTel agent giúp tracing không xâm lấn mã nguồn.

Checkpoint tự đánh giá:

- Thiết kế readiness vs liveness probe hợp lý cho app khởi động lâu.
- Viết rule HPA dựa trên RPS thay vì CPU (gợi ý: custom metrics).
- Thêm bước scan SCA/Container vào pipeline CI.

---

<a id="ch15"></a>

## 15. Dự án mẫu: E-commerce

#### Giới thiệu

- Mục tiêu: dựng dịch vụ bán hàng đơn giản, mở rộng dần.
- Kiến thức nền: chương 2–14.
- Lý do: tổng hợp kiến thức vào bài thực chiến.

#### Nội dung chi tiết

- Danh mục/sản phẩm/giỏ hàng/đơn hàng; API; cache; bảo mật; logs/metrics.

#### Ví dụ code thực tế

- Skeleton tại `samples/projects/ecommerce-service` (Spring Boot 3, JDK 17).

#### Ứng dụng thực tế

- Tích hợp Payment/Shipping; áp dụng cache & metrics.

#### Tối ưu & best practice

- Idempotency cho checkout; isolation data; quan sát lỗi.

#### Tóm tắt & bài tập

- Tóm tắt: tạo MVP và đo lường.
- Bài tập: thêm endpoint tìm kiếm sản phẩm và bộ lọc.

Mục tiêu học:

- Thiết kế một hệ thống bán hàng cơ bản đủ chạy: Catalog, Cart, Order, Payment, Inventory.

Thời lượng: 2–3 tuần

Kiến trúc (ASCII):

```
[Web/SPA] --(REST/GraphQL)--> [API Gateway]
   |                               |
   v                               v
[Auth]    [Catalog]  [Cart]  [Order]  [Inventory]  [Payment]
                \         \      |          |        /
                 \         ---- Kafka/RabbitMQ ------
```

DB Schema (chính):

- users(id, email, password_hash, roles)
- products(id, name, price, stock, status)
- orders(id, user_id, total, status, created_at)
- order_items(id, order_id, product_id, qty, price)
- payments(id, order_id, amount, provider, status, tx_id)
- outbox(id, aggregate_type, aggregate_id, type, payload, created_at, processed)

API endpoints tiêu biểu (REST):

- GET /api/products?q=…
- POST /api/cart/items {productId, qty}
- POST /api/orders {addressId, paymentMethod}
- GET /api/orders/{id}
- POST /api/payments {orderId}

Contract mẫu:

```json
POST /api/orders
{
  "items": [{"productId": 1, "qty": 2}],
  "shippingAddressId": 10,
  "paymentMethod": "COD"
}
```

```json
200 OK
{ "id": 123, "status": "CREATED", "total": 199.0 }
```

Sequence checkout (choreography):

1. Order Service tạo ORDER_CREATED (+ outbox).
2. Inventory consume ORDER_CREATED → reserve stock.
3. Payment consume ORDER_RESERVED → charge.
4. Order consume PAYMENT_SUCCESS → mark PAID; nếu fail → CANCELLED + release stock.

Tích hợp:

- gRPC giữa Order–Payment; Kafka cho sự kiện.
- GraphQL cho product search/aggregation ở BFF.

Checklist deploy & considerations:

- Scale Catalog đọc nhiều; cache sản phẩm.
- Partition Kafka theo `orderId` để giữ thứ tự.
- DB: index (products.name), (orders.user_id, created_at).
- Cân nhắc sharding bảng orders khi lớn.

Bài tập: Cài đặt flow ORDER_CREATED → ORDER_PAID với Kafka và Outbox.

Tóm tắt & Key Takeaways:

- Phân tách bounded context: Catalog, Order, Inventory, Payment với giao tiếp sự kiện.
- Outbox giúp đảm bảo publish sự kiện đáng tin cậy; partition theo `orderId`.
- API thiết kế rõ ràng cho cart→order→payment với idempotency.

Checkpoint tự đánh giá:

- Viết DDL index tối ưu cho truy vấn lịch sử đơn hàng của user.
- Thiết kế event types cho dòng đời đơn hàng: ORDER_CREATED, ORDER_RESERVED, PAYMENT_SUCCESS/FAILED, ORDER_PAID, ORDER_CANCELLED.
- `curl` test tạo đơn hàng và theo dõi sự kiện (gợi ý dùng kcat / rabbitmqadmin).

DB Choices & Ops:

- OLTP: PostgreSQL/MySQL; chọn Postgres nếu dùng nhiều JSONB, full-text; MySQL nếu cần tương thích hệ sinh thái hiện có.
- Cache: Redis cho sản phẩm phổ biến, giỏ hàng (TTL), session.
- Outbox: bảng Postgres có index theo `(processed, created_at)` để batch relay hiệu quả.
- Migration gates: block start khi Flyway pending migrations; readiness probe phụ thuộc DB ready.

---

<a id="ch16"></a>

## 16. Dự án mẫu: Social Network

#### Giới thiệu

- Mục tiêu: timeline, bài đăng, bình luận, theo dõi.
- Kiến thức nền: chương 2–14.
- Lý do: mô hình quan hệ người dùng và feed.

#### Nội dung chi tiết

- User/Profile/Post/Comment; API; bảo mật; tối ưu đọc nhiều.

#### Ví dụ code thực tế

- Skeleton tại `samples/projects/social-service`.

#### Ứng dụng thực tế

- Feed theo dõi, thông báo, search.

#### Tối ưu & best practice

- Chỉ mục đọc; phân trang keyset; rate limit.

#### Tóm tắt & bài tập

- Tóm tắt: dựng social cơ bản.
- Bài tập: thêm API theo dõi và feed người dùng.

Mục tiêu học:

- Hệ thống đăng bài, comment, like, follow, thông báo.

Thời lượng: 2 tuần

Kiến trúc (ASCII):

```
[Web/Mobile] → [BFF GraphQL] → [User] [Post] [Comment] [Feed] [Notification]
                               ↘ Kafka (events: POST_CREATED, LIKE_ADDED)
```

DB Schema:

- users(id, email, pass_hash, name)
- posts(id, user_id, content, created_at)
- comments(id, post_id, user_id, content, created_at)
- follows(follower_id, followee_id, created_at)
- likes(id, post_id, user_id, created_at)

API chính:

- GraphQL Query: feed(userId, limit, cursor)
- Mutation: createPost(content), like(postId), follow(userId)

Sequence tạo post:

1. Post Service lưu post → phát `POST_CREATED`.
2. Feed Service tiêu thụ, fan-out tới followers hoặc ghi log để query fan-in.
3. Notification Service gửi push/email.

Tích hợp:

- Subscription GraphQL cho real-time feed.
- Redis cache cho timeline.

Checklist:

- Chọn mô hình feed (fan-out vs fan-in) theo scale.
- Dedup like, idempotency.

Bài tập: Thiết kế GraphQL schema và resolver cho `createPost` + subscription `postAdded`.

Nâng cao & ví dụ GraphQL:

```graphql
subscription OnPostAdded($userId: ID!) {
  postAdded(userId: $userId) {
    id
    content
    userId
    createdAt
  }
}
```

Indexes đề xuất:

- posts(user_id, created_at desc), likes(post_id, user_id unique), follows(follower_id, followee_id unique).

Tóm tắt & Key Takeaways:

- Chọn mô hình feed theo scale; dùng cache/denormalize khi cần.
- GraphQL subscriptions cho realtime; bảo vệ bằng auth + rate limit.

Checkpoint tự đánh giá:

- Thiết kế chiến lược xóa dữ liệu (GDPR-like) ảnh hưởng feed như thế nào?
- Tối ưu query feed để tránh N+1 (gợi ý: batch loader/DataLoader GraphQL).
- `curl`/GraphQL Playground: tạo post và nhận subscription sự kiện mới.

DB Choices & Ops:

- Document store: MongoDB cho post/comment (nội dung, embed nhẹ), index compound (user_id, created_at).
- Cache: Redis cho timeline, recent posts; invalidation dựa trên sự kiện POST_CREATED/DELETED.
- Search: bổ sung Elasticsearch/OpenSearch nếu cần full-text mạnh; hoặc Postgres FTS.

---

<a id="ch17"></a>

## 17. Dự án mẫu: Chat Realtime

#### Giới thiệu

- Mục tiêu: nhắn tin thời gian thực qua WebSocket/SSE.
- Kiến thức nền: chương 11.
- Lý do: minh hoạ reactive và realtime patterns.

#### Nội dung chi tiết

- Kết nối WebSocket, broadcast, rooms, lưu lịch sử tối thiểu.

#### Ví dụ code thực tế

- Skeleton tại `samples/projects/chat-service` (WebSocket echo/room).

#### Ứng dụng thực tế

- Chat nội bộ, thông báo realtime.

#### Tối ưu & best practice

- Giới hạn kết nối, heartbeat, backpressure.

#### Tóm tắt & bài tập

- Tóm tắt: nền tảng chat hoạt động.
- Bài tập: thêm kênh phòng và lịch sử tin nhắn in‑memory.

Mục tiêu học:

- Phòng chat nhiều người dùng, tin nhắn realtime, lịch sử.

Thời lượng: 1–2 tuần

Kiến trúc (ASCII):

```
[Web/Mobile] —(WebSocket/STOMP/SSE)→ [Chat Gateway] → [Chat Service]
                                       ↘ Redis Pub/Sub hoặc Kafka ←→ [History/DB]
```

DB Schema:

- rooms(id, name)
- room_members(room_id, user_id)
- messages(id, room_id, sender_id, content, created_at)

Endpoint WebSocket (Spring): `/ws` với topic `/topic/rooms/{id}`.

Sequence gửi tin nhắn:

1. Client gửi `SEND` tới `/app/rooms/{id}`.
2. Gateway publish vào Kafka/Redis.
3. Chat Service lưu DB, broadcast ra `/topic/rooms/{id}`.

Checklist:

- Scale theo số kết nối (WebFlux), sticky session hoặc token-based room auth.
- Lưu trữ: TTL, partition messages theo room.

Bài tập: Tạo endpoint STOMP và broadcast tin nhắn tới các subscriber.

Ví dụ Spring STOMP:

```java
@Controller
class ChatController {
  @MessageMapping("/rooms/{id}")
  @SendTo("/topic/rooms/{id}")
  Message send(@DestinationVariable String id, Message incoming){
    return incoming;
  }
}
```

Token-based room auth: thêm interceptor kiểm tra quyền vào room trước khi subscribe.

Tóm tắt & Key Takeaways:

- Lưu/stream tách rời: DB lưu lịch sử, broker phát realtime.
- Scale theo kết nối: dùng WebFlux và tối ưu số thread/netty.

Checkpoint tự đánh giá:

- Thiết kế sharding messages theo roomId để scale lưu trữ.
- Chống spam: rate limit per user/channel như thế nào?
- Demo client JS kết nối STOMP và gửi/nhận tin nhắn.

DB Choices & Ops:

- Realtime bus: Redis Pub/Sub hoặc Streams (ưu tiên Streams để replay/backfill).
- Lưu trữ: Mongo (TTL index cho message cũ) hoặc Postgres partition theo room/ngày.
- Backpressure: áp hạn mức số message/giây per room; drop/queue tùy SLA.

---

<a id="ch18"></a>

## 18. Dự án mẫu: Microservices Demo End-to-End

#### Giới thiệu

- Mục tiêu: nhiều dịch vụ phối hợp, gọi nhau, quan sát chung.
- Kiến thức nền: chương 12–14.
- Lý do: thực hành phân tách và giao tiếp giữa services.

#### Nội dung chi tiết

- Gateway + Order + Payment (vd. REST); cấu hình, retry; log/trace chung.

#### Ví dụ code thực tế

- Skeleton tại `samples/projects/microservices-e2e` (3 services tối thiểu).

#### Ứng dụng thực tế

- Mô phỏng checkout xuyên dịch vụ; trực quan trace end‑to‑end.

#### Tối ưu & best practice

- Timeouts, circuit breaker, idempotency.

#### Tóm tắt & bài tập

- Tóm tắt: hiểu tương tác multi‑service.
- Bài tập: thêm endpoint thanh toán giả lập với retry.

Mục tiêu học:

- Tổ hợp nhiều service: gateway, auth, product, order, inventory, payment, search.

Thời lượng: 2–3 tuần

Nội dung:

- API Gateway (Spring Cloud Gateway) + OAuth2 login.
- Service discovery (Eureka/Consul) hoặc static DNS.
- gRPC nội bộ giữa order–payment.
- Kafka events, outbox.
- Observability: Grafana+Prometheus, Jaeger/Tempo.

Checklist:

- Tracing xuyên dịch vụ (propagate headers), correlation-id.
- Circuit breaker (resilience4j), bulkhead, retry.

Bài tập: Dựng PoC 3 service và triển khai lên K8s local (kind/minikube).

Nâng cao (Resilience & Gateway):

```yaml
spring:
  cloud:
    gateway:
      routes:
        - id: product
          uri: http://product
          predicates: [Path=/api/products/**]
          filters: [TokenRelay]
resilience4j:
  circuitbreaker:
    instances:
      product: { slidingWindowSize: 50, failureRateThreshold: 50 }
  retry:
    instances:
      product: { maxAttempts: 3, waitDuration: 200ms }
```

Tóm tắt & Key Takeaways:

- Gateway hợp nhất auth/route/logging; resilience bảo vệ chuỗi call.
- Tracing xuyên dịch vụ yêu cầu propagate headers chuẩn W3C TraceContext.

Checkpoint tự đánh giá:

- Viết filter thêm `X-Correlation-Id` nếu chưa có.
- Thiết kế healthcheck và readiness cho tất cả service trong PoC.

---

<a id="ch19"></a>

## 19. Testing nâng cao: Unit, Integration, Contract, E2E, Testcontainers

#### Bổ sung hiện đại (Testcontainers & Pact)

- Testcontainers Postgres + Kafka ví dụ:

```java
@Testcontainers
class OrderIT {
  @Container static PostgreSQLContainer<?> pg = new PostgreSQLContainer<>("postgres:16");
  @Container static KafkaContainer kafka = new KafkaContainer(DockerImageName.parse("confluentinc/cp-kafka:7.6.0"));

  @DynamicPropertySource static void props(DynamicPropertyRegistry r){
    r.add("spring.datasource.url", () -> pg.getJdbcUrl());
    r.add("spring.datasource.username", () -> pg.getUsername());
    r.add("spring.datasource.password", () -> pg.getPassword());
    r.add("spring.kafka.bootstrap-servers", kafka::getBootstrapServers);
  }

  @Test void create_order_publishes_event(){ /* call API, assert consumed event */ }
}
```

- Pact contract test (consumer):

```java
@PactTestFor(providerName = "product-service")
class ProductApiContractTest {
  @Pact ProviderPact productPact(PactDslWithProvider p){
    return p.given("product exists")
      .uponReceiving("GET /api/products/1")
      .path("/api/products/1").method("GET")
      .willRespondWith().status(200)
      .body(newJsonBody(o -> { o.numberType("id", 1); o.stringType("name", "Book"); o.numberType("price", 10.5);}).build())
      .toPact();
  }
}
```

- E2E smoke với RestAssured hoặc Playwright (API/UI) chạy trong CI.

#### Giới thiệu

- Mục tiêu: chiến lược kiểm thử đa tầng, cô lập phụ thuộc.
- Kiến thức nền: chương 4–8.
- Lý do: tự tin thay đổi nhanh mà không vỡ.

#### Nội dung chi tiết

- Unit/Integration/Contract (Pact)/E2E; Testcontainers; fixtures; seed data.

#### Ví dụ code thực tế

- Testcontainers Postgres/Kafka, hợp đồng Pact (đã có trong chương).

#### Ứng dụng thực tế

- Verify giao tiếp giữa services trước khi triển khai.

#### Tối ưu & best practice

- Test nhanh/tách lớp; dữ liệu ổn định; chạy song song.

#### Tóm tắt & bài tập

- Tóm tắt: kiểm thử là sản phẩm đầu tiên.
- Bài tập: thêm contract test cho `GET /products/{id}`.

Mục tiêu học:

- Phủ đủ tầng kiểm thử và cấu hình môi trường test cô lập.

Thời lượng: 1 tuần

Nội dung:

- Unit: JUnit5 + Mockito.
- Integration: `@SpringBootTest` với Testcontainers (Postgres/Redis/Kafka/RabbitMQ).
- Contract tests: Pact (provider/consumer) cho API/gRPC/HTTP.
- E2E: Selenium/Playwright cho UI.

Ví dụ Testcontainers:

```xml
<dependency>
  <groupId>org.testcontainers</groupId>
  <artifactId>postgresql</artifactId>
  <version>1.20.1</version>
  <scope>test</scope>
</dependency>
```

```java
@Testcontainers
@SpringBootTest
class ProductRepoIT {
  @Container static PostgreSQLContainer<?> pg = new PostgreSQLContainer<>("postgres:16");
  @DynamicPropertySource static void props(DynamicPropertyRegistry r){
    r.add("spring.datasource.url", pg::getJdbcUrl);
    r.add("spring.datasource.username", pg::getUsername);
    r.add("spring.datasource.password", pg::getPassword);
  }
  @Autowired ProductRepo repo;
  @Test void save_and_find(){ var p=new Product(); p.name="A"; p.price=new BigDecimal("10");
    var saved=repo.save(p); assertTrue(repo.findById(saved.id).isPresent()); }
}
```

Ví dụ Pact (consumer DSL rút gọn):

```java
@PactTestFor(providerName = "product-provider")
class ProductConsumerPactTest { /* định nghĩa interactions và verify */ }
```

Bài tập: Viết integration test tạo sản phẩm và kiểm tra cache hoạt động.

Nâng cao (Testing chiến lược):

- Phân tầng: unit nhanh → integration chọn lọc → contract để chống phá vỡ → E2E cho happy path chính.
- Mockito tips: tránh over-mock; test hành vi domain thay vì chi tiết triển khai.
- Pact: publish contracts vào broker; CI của provider verify trước khi release.
- Mutation testing (PIT): đo độ hiệu quả test.

Tóm tắt & Key Takeaways:

- Đủ 3 lớp test: unit, integration (Testcontainers), contract; E2E tối thiểu.
- Tách test profiles, khởi tạo dữ liệu test qua SQL/data builders.

Checkpoint tự đánh giá:

- Viết `@DataJpaTest` cho repo và so sánh tốc độ với `@SpringBootTest`.
- Thêm Kafka Testcontainers và test consumer idempotent.
- Tạo một hợp đồng Pact cho `GET /api/products/{id}`.

---

<a id="ch20"></a>

## 20. Bảo mật chuyên sâu: OAuth2/OIDC, PKCE, RBAC/ABAC, Anti-XSS/CSRF/CORS

#### Giới thiệu

- Mục tiêu: OAuth2/OIDC + PKCE; RBAC/ABAC; bảo vệ trình duyệt.
- Kiến thức nền: chương 8–9.
- Lý do: bảo vệ end‑user và tài sản doanh nghiệp.

#### Nội dung chi tiết

- Flows OAuth2; id_token; role/permission; anti‑XSS/CSRF/CORS; headers an toàn.

#### Ví dụ code thực tế

- Resource server JWT, method security, CORS cấu hình (đã có trong chương).

#### Ứng dụng thực tế

- Phân quyền chi tiết theo phòng ban/chủ sở hữu; bảo vệ SPA/mobile.

#### Tối ưu & best practice

- Rotate refresh token; same‑site cookies; CSP.

#### Tóm tắt & bài tập

- Tóm tắt: defense‑in‑depth cho ứng dụng web/API.
- Bài tập: rule ABAC xem đơn hàng theo ownerId.

Mục tiêu học:

- Hiểu OAuth2/OIDC flow, PKCE; mô hình RBAC/ABAC; bảo vệ đầu vào và trình duyệt.

Thời lượng: 1–2 tuần

Nội dung:

- OAuth2 Authorization Code + PKCE, refresh token, token revocation.
- OIDC: id_token và claims.
- RBAC: role-based; ABAC: theo thuộc tính (dept, ownerId).
- Input validation (Hibernate Validator), sanitization, SQL injection (PreparedStatement), XSS (encode output), CSRF (stateless JWT thì disable CSRF), CORS cấu hình allowlist.

Ví dụ Spring Security OAuth2 Resource Server:

```xml
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-oauth2-resource-server</artifactId>
</dependency>
```

```java
@Bean SecurityFilterChain api(HttpSecurity http) throws Exception {
  http.oauth2ResourceServer(o -> o.jwt());
  http.authorizeHttpRequests(a->a.anyRequest().authenticated());
  return http.build();
}
```

Ví dụ method-level security:

```java
@PreAuthorize("hasAuthority('product:write') or hasRole('ADMIN')")
public Product createProduct(...) { /* ... */ }
```

Bảng permission mẫu:

- permissions(id, code: `product:read`, `product:write`, ...)
- role_permissions(role_id, permission_id)
- user_attributes(user_id, key, value) — cho ABAC.

Bài tập: Thêm kiểm tra ABAC: chỉ chủ sở hữu đơn hàng được xem chi tiết.

Checklist security audit:

- Quản lý secrets, TLS, headers bảo mật (HSTS, CSP), log truy cập.
- Kiểm tra dependency vulnerabilities (OWASP Dependency Check).

Nâng cao (OAuth2/OIDC & Trình duyệt):

- Authorization Code + PKCE: public client (SPA/mobile) bắt buộc PKCE; rotate refresh token.
- Token TTL ngắn; refresh token dài hơn, ràng buộc device/fingerprint nếu cần.
- CSRF: với session stateful bật CSRF token; với JWT stateless thì disable CSRF filter nhưng bảo vệ bằng same-site cookie và CORS chặt chẽ.
- XSS: encode output, CSP hạn chế nguồn script; sanitize input HTML (vd. OWASP Java HTML Sanitizer) khi cần WYSIWYG.

Ví dụ CORS an toàn (Spring Boot 3):

```yaml
spring:
  web:
    cors:
      allowed-origins: ["https://app.example.com"]
      allowed-methods: ["GET", "POST", "PUT", "DELETE"]
      allow-credentials: true
```

#### Bổ sung hiện đại (Authorization Server & CSP)

- Spring Authorization Server tối thiểu (cho môi trường dev/test):

```xml
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-oauth2-authorization-server</artifactId>
</dependency>
```

```java
@Configuration @EnableWebSecurity
class AuthzConfig {
  @Bean SecurityFilterChain authz(HttpSecurity http) throws Exception {
    OAuth2AuthorizationServerConfiguration.applyDefaultSecurity(http);
    return http.build();
  }
  @Bean RegisteredClientRepository clients(){
    var c = RegisteredClient.withId(UUID.randomUUID().toString())
      .clientId("spa").clientName("spa")
      .authorizationGrantType(AuthorizationGrantType.AUTHORIZATION_CODE)
      .redirectUri("http://localhost:3000/callback")
      .scope("openid").scope("profile").build();
    return new InMemoryRegisteredClientRepository(c);
  }
}
```

- CSP headers (giới hạn nguồn script/style) và Security headers cơ bản:

```java
@Bean SecurityFilterChain api(HttpSecurity http) throws Exception {
  http.headers(h -> h
    .contentSecurityPolicy(csp -> csp.policyDirectives("default-src 'self'; script-src 'self' 'unsafe-inline'"))
    .httpStrictTransportSecurity(hsts -> hsts.includeSubDomains(true))
    .referrerPolicy(r -> r.policy(ReferrerPolicyHeaderWriter.ReferrerPolicy.SAME_ORIGIN))
  );
  return http.build();
}
```

#### Bổ sung hiện đại (Keycloak & Resource Server JWT)

- docker-compose Keycloak (dev):

```yaml
services:
  keycloak:
    image: quay.io/keycloak/keycloak:24.0
    command: ["start-dev", "--http-port=8087"]
    environment:
      - KEYCLOAK_ADMIN=admin
      - KEYCLOAK_ADMIN_PASSWORD=admin
    ports: ["8087:8087"]
```

- Resource server trỏ tới JWK Set URI từ Keycloak realm:

```yaml
spring:
  security:
    oauth2:
      resourceserver:
        jwt:
          jwk-set-uri: http://localhost:8087/realms/demo/protocol/openid-connect/certs
```

- Mapping role → authorities: dùng `JwtAuthenticationConverter` đọc `realm_access.roles`.

Tóm tắt & Key Takeaways:

- Nắm flow OAuth2/OIDC thực tế với PKCE và refresh token rotation.
- RBAC kết hợp ABAC để kiểm soát chi tiết; kiểm soát CORS/CSRF/XSS thực dụng.

Checkpoint tự đánh giá:

- Mô tả chiến lược revoke refresh token khi thiết bị bị mất.
- Viết rule ABAC cho phép admin phòng ban xem đơn hàng thuộc phòng.
- Bật HTTP security headers cơ bản (HSTS/CSP) trong Spring Security.

---

<a id="ch21"></a>

## 21. Phụ lục

#### Giới thiệu

- Mục tiêu: tập hợp mẫu cấu hình và lệnh tiện dụng.
- Kiến thức nền: đã học các chương trước.
- Lý do: tra cứu nhanh khi triển khai.

#### Nội dung chi tiết

- BOM, docker-compose, GH Actions, Gradle, log cấu trúc (mẫu đã có trong chương).

#### Ví dụ code thực tế

- Các mẫu cấu hình sẵn dùng; copy và chỉnh cho dự án.

#### Ứng dụng thực tế

- Dùng để khởi tạo nhanh và chuẩn hoá dự án trong team.

#### Tối ưu & best practice

- Luôn giữ secret an toàn; tái sử dụng BOM; pin version.

#### Tóm tắt & bài tập

- Tóm tắt: hộp công cụ triển khai nhanh.
- Bài tập: tạo compose cho Postgres/Redis/Kafka local.

Cheat-sheets:

- Git: `git clone`, `branch`, `commit`, `push`, `rebase`, `tag`.
- SQL: `SELECT`, `JOIN`, index, transaction ACID.
- JPA annotations: `@Entity`, `@Id`, `@OneToMany`, `@ManyToOne`, `@Embeddable`.
- Spring annotations: `@Component`, `@Service`, `@Repository`, `@Configuration`, `@Bean`, `@RestController`, `@ControllerAdvice`.

Mẫu `pom.xml` (rút gọn với Spring Boot BOM):

```xml
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-dependencies</artifactId>
      <version>3.3.2</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency>
  </dependencies>
</dependencyManagement>
```

Docker Compose (Postgres+Redis+Kafka rút gọn):

```yaml
services:
  postgres:
    image: postgres:16
    environment: { POSTGRES_USER: shop, POSTGRES_PASSWORD: shop, POSTGRES_DB: shop }
    ports: ["5432:5432"]
  redis:
    image: redis:7
    ports: ["6379:6379"]
  kafka:
    image: bitnami/kafka:3
    environment: { KAFKA_ENABLE_KRAFT: "yes" }
    ports: ["9092:9092"]
```

Docker Compose (Postgres + MySQL + MongoDB + Redis):

```yaml
services:
  postgres:
    image: postgres:16
    environment: { POSTGRES_USER: app, POSTGRES_PASSWORD: app, POSTGRES_DB: app }
    ports: ["5432:5432"]
  mysql:
    image: mysql:8
    environment: { MYSQL_ROOT_PASSWORD: root, MYSQL_DATABASE: app }
    command: ["--default-authentication-plugin=mysql_native_password"]
    ports: ["3306:3306"]
  mongo:
    image: mongo:7
    ports: ["27017:27017"]
  redis:
    image: redis:7
    ports: ["6379:6379"]
```

GitHub Actions (rút gọn):

```yaml
name: ci
on: [push]
jobs:
  build:
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v4
      - uses: actions/setup-java@v4
        with: { distribution: temurin, java-version: 17 }
      - run: mvn -B -DskipTests verify
      - uses: docker/login-action@v3
        with: { registry: ghcr.io, username: ${{ github.actor }}, password: ${{ secrets.GITHUB_TOKEN }} }
      - run: docker build -t ghcr.io/org/app:${{ github.sha }} .
      - run: docker push ghcr.io/org/app:${{ github.sha }}
```

Mẫu `build.gradle` (Gradle Kotlin DSL):

```kotlin
plugins {
  id("org.springframework.boot") version "3.3.2"
  id("io.spring.dependency-management") version "1.1.5"
  java
}

java { sourceCompatibility = JavaVersion.VERSION_17 }

repositories { mavenCentral() }

dependencies {
  implementation("org.springframework.boot:spring-boot-starter-web")
  testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.test { useJUnitPlatform() }
```

Logback JSON (structured logging):

```xml
<configuration>
  <appender name="STDOUT" class="ch.qos.logback.core.ConsoleAppender">
    <encoder class="net.logstash.logback.encoder.LogstashEncoder" />
  </appender>
  <root level="INFO"><appender-ref ref="STDOUT"/></root>
  <logger name="org.springframework" level="INFO"/>
  <logger name="org.hibernate.SQL" level="WARN"/>
  <logger name="org.hibernate.type.descriptor.sql.BasicBinder" level="WARN"/>
  <!-- MDC fields like traceId/spanId if using OTel -->
</configuration>
```

Rollback plan:

- Blue/Green hoặc Canary; giữ version N-1 sẵn sàng; script rollback.

Pre-deploy checklist:

- DB migration đã chạy? Health check pass? Observability OK? Secrets cập nhật?

---

<a id="ch22"></a>

## 22. Timeline đề xuất

#### Giới thiệu

- Mục tiêu: lập kế hoạch học phù hợp quỹ thời gian.
- Kiến thức nền: toàn bộ giáo trình.
- Lý do: đảm bảo tiến độ và nhịp thực hành đều đặn.

#### Nội dung chi tiết

- Ba tốc độ: nhanh/trung bình/chậm; điều chỉnh theo mục tiêu cá nhân.

#### Ví dụ code thực tế

- Không áp dụng; tham chiếu các dự án mẫu để phân bổ thời gian.

#### Ứng dụng thực tế

- Lập lịch học và review theo checkpoint từng chương.

#### Tối ưu & best practice

- Tạo nhật ký học, đánh giá theo tuần, giữ context bằng mini‑project.

#### Tóm tắt & bài tập

- Tóm tắt: kế hoạch 8–48 tuần linh hoạt.
- Bài tập: chọn tốc độ và lên lịch cụ thể trong calendar.

- Tổng thể: 24 tuần (6–8 giờ/tuần)

Phân bổ theo chương (ước lượng):

- Tuần 1: Ch.1–2 (Giới thiệu, Java cơ bản)
- Tuần 2: Ch.3
- Tuần 3: Ch.4
- Tuần 4: Ch.5
- Tuần 5–6: Ch.6
- Tuần 7: Ch.7
- Tuần 8: Ch.8
- Tuần 9: Ch.9
- Tuần 10: Ch.10
- Tuần 11: Ch.11
- Tuần 12: Ch.12
- Tuần 13–14: Ch.13
- Tuần 15–16: Ch.14
- Tuần 17–19: Ch.15 (E-commerce)
- Tuần 20–21: Ch.16 (Social)
- Tuần 22–23: Ch.17 (Chat)
- Tuần 24: Ch.18 + Ch.19–20 + ôn tập

Ba tốc độ học:

- Nhanh (full-time ~ 30–40h/tuần): 8–10 tuần. Mỗi “tuần” ở trên coi như 2–3 ngày.
- Trung bình (part-time ~ 10–12h/tuần): 24 tuần như bảng.
- Chậm (hobby ~ 4–6h/tuần): 40–48 tuần; mỗi tuần ở trên kéo dài 2 tuần thực tế.

Cách sử dụng timeline:

- Mỗi chương đều có Bài tập & Checkpoint — coi đó là điều kiện qua chương.
- Ưu tiên làm ngay một mini-project sau mỗi khối (Beginner, Intermediate, Advanced) trước khi sang Expert.

---

Kết luận: Với lộ trình này, bạn có thể tự mình xây dựng và triển khai các hệ thống Java/Spring Boot hiện đại, có kiểm thử, bảo mật, hiệu năng và DevOps đầy đủ. Hãy giữ nhịp độ đều, ưu tiên thực hành, và đừng quên đo đạc (metrics) để học từ dữ liệu thực tế.
