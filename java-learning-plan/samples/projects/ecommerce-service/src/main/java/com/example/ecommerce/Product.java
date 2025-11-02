package com.example.ecommerce;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import java.math.BigDecimal;

public record Product(
        Long id,
        @NotBlank String name,
        @Min(0) BigDecimal price
) {}

