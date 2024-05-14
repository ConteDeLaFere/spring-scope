package com.malina.spring.scope.controllers;

import com.malina.spring.scope.services.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/add")
    public List<Integer> addProducts(@RequestParam List<Integer> productList) {
        return orderService.addProducts(productList);
    }

    @GetMapping("/get")
    public List<Integer> getProducts() {
        return orderService.getProducts();
    }
}
