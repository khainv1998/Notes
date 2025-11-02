package com.example.social;

import jakarta.validation.constraints.NotBlank;

public record Post(Long id, @NotBlank String author, @NotBlank String content) {}

