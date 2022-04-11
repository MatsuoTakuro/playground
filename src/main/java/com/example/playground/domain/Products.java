package com.example.playground.domain;

import java.util.List;

public class Products {

    List<Product> products;
    Products(List<Product> products) {
      this.products = products;
    };

    void add(Product product) {
        this.products.add(product);
    }
}
