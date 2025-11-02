# ecommerce-service (skeleton)

Requirements: JDK 17+, Maven 3.9+

Run:

```
mvn spring-boot:run
```

API:

- GET http://localhost:8080/api/products
- GET http://localhost:8080/api/products/{id}
- POST http://localhost:8080/api/products

Request body example:

```
{
  "name": "Laptop",
  "price": 1200.00
}
```

