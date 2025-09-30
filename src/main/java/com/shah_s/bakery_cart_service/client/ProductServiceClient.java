package com.shah_s.bakery_cart_service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@FeignClient(name = "product-service", path = "/api/products")
public interface ProductServiceClient {

    @GetMapping("/{productId}")
    Map<String, Object> getProductById(@PathVariable UUID productId);

    @GetMapping
    List<Map<String, Object>> getProductsByIds(@RequestParam List<UUID> productIds);

    @GetMapping("/{productId}/stock")
    Map<String, Object> checkStockAvailability(@PathVariable UUID productId,
                                              @RequestParam Integer quantity);

    @PostMapping("/{productId}/stock/reserve")
    Map<String, Object> reserveStock(@PathVariable UUID productId,
                                   @RequestBody Map<String, Integer> request);

    @PostMapping("/{productId}/stock/release")
    Map<String, Object> releaseStock(@PathVariable UUID productId,
                                   @RequestBody Map<String, Integer> request);

    @PostMapping("/batch/validate")
    List<Map<String, Object>> validateProducts(@RequestBody List<UUID> productIds);
}
