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

    int count() {
        return 10;
    }

    String found() {
        if (count() == 0 ) return "Not found";

        return String.format("%s件見つかりました。", count());
    }
}
