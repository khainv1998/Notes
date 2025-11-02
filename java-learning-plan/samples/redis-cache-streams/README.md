# Sample: Redis Cache + Streams + Rate Limiting

Mục tiêu
- Dùng Spring Cache với Redis, publish/consume Redis Streams, rate limiting.

Dependencies (pom.xml)
```xml
<dependencies>
  <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-redis</artifactId>
  </dependency>
  <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
  </dependency>
</dependencies>
```

Cache & Streams
```java
@EnableCaching
@Configuration
class RedisCfg { @Bean RedisTemplate<String,String> redisTemplate(LettuceConnectionFactory cf){ var t=new RedisTemplate<String,String>(); t.setConnectionFactory(cf); return t; } }

@Cacheable(cacheNames="product", key="#id")
public Product getProduct(long id){ ... }

// Publish stream
var rec = StreamRecords.objectBacked(Map.of("orderId","1")).withStreamKey("order.events");
stringRedisTemplate.opsForStream().add(rec);

// Consume group (skeleton)
stringRedisTemplate.opsForStream().read(Consumer.from("grp","c1"), StreamReadOptions.empty().count(10), StreamOffset.create("order.events", ReadOffset.lastConsumed()));
```

Rate Limiting (gợi ý Lua script token bucket)
```lua
-- KEYS[1]=key, ARGV[1]=tokens, ARGV[2]=rate, ARGV[3]=ttl
local tokens = redis.call('incrby', KEYS[1], -ARGV[1])
if tokens < 0 then redis.call('expire', KEYS[1], ARGV[3]); return 0 else return 1 end
```

application.yml
```yaml
spring:
  data:
    redis:
      host: localhost
      port: 6379
```

Chạy nhanh
- docker compose up -d redis
- mvn spring-boot:run

Bài tập
- Viết consumer group hoàn chỉnh và đảm bảo idempotency theo eventId.
- Thêm rate limit middleware 100 req/min/user.
