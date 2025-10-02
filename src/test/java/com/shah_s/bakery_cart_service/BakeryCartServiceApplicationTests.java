package com.shah_s.bakery_cart_service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class BakeryCartServiceApplicationTests {

    @Test
    void contextLoads() {
    }

}
