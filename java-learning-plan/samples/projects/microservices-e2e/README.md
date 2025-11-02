# microservices-e2e (skeleton)

Three services:
- gateway-service (port 8085)
- order-service (port 8081)
- payment-service (port 8082)

Requirements: JDK 17+, Maven 3.9+

Run each service in a separate terminal:

```
cd order-service && mvn spring-boot:run
```
```
cd payment-service && mvn spring-boot:run
```
```
cd gateway-service && mvn spring-boot:run
```

Test end-to-end:

- GET http://localhost:8085/api/checkout/ping
  - Calls order:8081 and payment:8082, returns combined status.

Configure service URLs (optional): `gateway-service/src/main/resources/application.yml` or env vars
```
services.order.url=http://localhost:8081
services.payment.url=http://localhost:8082
```

