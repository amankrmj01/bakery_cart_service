package com.shah_s.bakery_cart_service;

import org.springframework.boot.SpringApplication;

public class TestBakeryCartServiceApplication {

    public static void main(String[] args) {
        SpringApplication.from(BakeryCartServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
