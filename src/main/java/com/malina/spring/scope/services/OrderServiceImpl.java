package com.malina.spring.scope.services;

import com.malina.spring.scope.models.Basket;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final Basket basket;

    public OrderServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public List<Integer> addProducts(List<Integer> productList) {
        return basket.addProducts(productList);
    }

    @Override
    public List<Integer> getProducts() {
        return basket.getProducts();
    }
}
