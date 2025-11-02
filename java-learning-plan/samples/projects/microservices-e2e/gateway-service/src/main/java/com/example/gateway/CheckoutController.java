package com.example.gateway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

import java.util.Map;

@RestController
@RequestMapping("/api/checkout")
class CheckoutController {
    private final RestClient http;
    private final String orderUrl;
    private final String paymentUrl;

    CheckoutController(RestClient.Builder builder,
                       @Value("${services.order.url:http://localhost:8081}") String orderUrl,
                       @Value("${services.payment.url:http://localhost:8082}") String paymentUrl) {
        this.http = builder.build();
        this.orderUrl = orderUrl;
        this.paymentUrl = paymentUrl;
    }

    @GetMapping("/ping")
    Map<String, String> ping() {
        String o = http.get().uri(orderUrl + "/api/orders/ping").retrieve().body(String.class);
        String p = http.get().uri(paymentUrl + "/api/payments/ping").retrieve().body(String.class);
        return Map.of("gateway", "ok", "order", o, "payment", p);
    }
}

