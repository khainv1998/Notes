# Sample: PostgreSQL + Spring Data JPA + Flyway

Mục tiêu
- CRUD sản phẩm, tìm kiếm có index, migration Flyway, integration test (gợi ý Testcontainers).

Dependencies (pom.xml)
```xml
<dependencies>
  <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
  </dependency>
  <dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <scope>runtime</scope>
  </dependency>
  <dependency>
    <groupId>org.flywaydb</groupId>
    <artifactId>flyway-core</artifactId>
  </dependency>
  <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-test</artifactId>
    <scope>test</scope>
  </dependency>
</dependencies>
```

Migration (db/migration/V1__init.sql)
```sql
create table products(
  id bigserial primary key,
  name varchar(200) not null,
  price numeric not null
);
create index idx_products_name on products using gin (to_tsvector('simple', name));
```

Entity & Repository
```java
@Entity @Table(name="products")
class Product { @Id @GeneratedValue Long id; String name; BigDecimal price; }

interface ProductRepo extends JpaRepository<Product, Long> {
  @Query("select p from Product p where lower(p.name) like lower(concat('%', :q, '%'))")
  List<Product> search(@Param("q") String q);
}
```

application.yml
```yaml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/app
    username: app
    password: app
  jpa:
    open-in-view: false
    hibernate:
      ddl-auto: validate
```

Chạy nhanh
- docker compose up -d postgres
- mvn spring-boot:run

Bài tập
- Thêm projection DTO, và chạy EXPLAIN ANALYZE cho truy vấn search.
