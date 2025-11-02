# social-service (skeleton)

Requirements: JDK 17+, Maven 3.9+

Run:

```
mvn spring-boot:run
```

API:

- GET http://localhost:8083/api/posts
- POST http://localhost:8083/api/posts

Body example:

```
{ "author": "alice", "content": "hello world" }
```

