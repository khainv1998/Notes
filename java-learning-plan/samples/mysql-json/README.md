# Sample: MySQL + JSON queries

Mục tiêu
- Lưu sự kiện JSON, query theo field JSON, native query + index.

Dependencies (pom.xml)
```xml
<dependencies>
  <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
  </dependency>
  <dependency>
    <groupId>com.mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <scope>runtime</scope>
  </dependency>
</dependencies>
```

Entity & Repository
```java
@Entity @Table(name="events")
class Event { @Id @GeneratedValue Long id; @Column(columnDefinition="json") String payload; }

interface EventRepo extends JpaRepository<Event,Long> {
  @Query(value="select * from events where json_extract(payload,'$.type') = ?1", nativeQuery=true)
  List<Event> findByType(String type);
}
```

Migration
```sql
create table events(
  id bigint primary key auto_increment,
  payload json not null
) engine=InnoDB default charset=utf8mb4;
create index idx_events_type on events((json_extract(payload,'$.type')));
```

Chạy nhanh
- docker compose up -d mysql
- mvn spring-boot:run

Bài tập
- Viết native query lọc theo `payload.userId` và tạo index phù hợp.
