package com.malina.spring.scope.services;

import java.util.List;

public interface OrderService {
    List<Integer> addProducts(List<Integer> productList);
    List<Integer> getProducts();
}
