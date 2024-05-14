package com.malina.spring.scope.models;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class Basket {

    private final List<Integer> products;

    public Basket() {
        products = new ArrayList<>();
    }

    public List<Integer> getProducts() {
        return Collections.unmodifiableList(products);
    }

    public List<Integer> addProducts(List<Integer> productList) {
        products.addAll(productList);
        return products;
    }
}
