package com.example.social;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api/posts")
class PostController {
    private final Map<Long, Post> store = new ConcurrentHashMap<>();
    private final AtomicLong seq = new AtomicLong();

    @GetMapping
    List<Post> list() { return new ArrayList<>(store.values()); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Post create(@RequestBody @Valid Post p){
        long id = seq.incrementAndGet();
        Post np = new Post(id, p.author(), p.content());
        store.put(id, np);
        return np;
    }
}

