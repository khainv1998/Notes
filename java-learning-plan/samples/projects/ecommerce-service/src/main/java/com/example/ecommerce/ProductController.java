package com.example.ecommerce;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api/products")
class ProductController {
    private final Map<Long, Product> store = new ConcurrentHashMap<>();
    private final AtomicLong seq = new AtomicLong(0);

    ProductController() {
        create(new Product(null, "Book", new BigDecimal("10.50")));
        create(new Product(null, "Pen", new BigDecimal("1.20")));
    }

    @GetMapping
    List<Product> list() { return new ArrayList<>(store.values()); }

    @GetMapping("/{id}")
    Product get(@PathVariable Long id) { return Optional.ofNullable(store.get(id))
            .orElseThrow(() -> new NoSuchElementException("Product %d not found".formatted(id))); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Product create(@RequestBody @Valid Product p) {
        long id = seq.incrementAndGet();
        Product np = new Product(id, p.name(), p.price());
        store.put(id, np);
        return np;
    }
}

