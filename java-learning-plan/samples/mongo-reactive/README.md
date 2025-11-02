# Sample: MongoDB Reactive + Aggregation + Change Streams

Mục tiêu
- ReactiveMongoRepository, Aggregation pipeline, TTL index, Change Streams.

Dependencies (pom.xml)
```xml
<dependencies>
  <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-webflux</artifactId>
  </dependency>
  <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-mongodb-reactive</artifactId>
  </dependency>
</dependencies>
```

Document & Repository
```java
@Document("users")
class UserDoc { @Id String id; @Indexed(unique=true) String email; @Indexed(expireAfterSeconds=3600) Instant lastSeen; }
interface UserRepo extends ReactiveMongoRepository<UserDoc, String> { Flux<UserDoc> findByEmailRegex(String regex); }
```

Aggregation & Change Streams
```java
var agg = Aggregation.newAggregation(match(Criteria.where("status").is("PAID")), group("userId").sum("total").as("sum"));
reactiveMongoTemplate.aggregate(agg, "orders", Document.class).subscribe();
reactiveMongoTemplate.changeStream("orders", ChangeStreamOptions.empty(), Document.class)
  .doOnNext(e -> log.info("Changed: {}", e)).subscribe();
```

application.yml
```yaml
spring:
  data:
    mongodb:
      database: app
      uri: mongodb://localhost:27017/app
```

Chạy nhanh
- docker compose up -d mongo
- mvn spring-boot:run

Bài tập
- Tạo TTL index và xác nhận document tự xóa.
- Sử dụng change stream để warm cache khi đơn hàng cập nhật.
