package com.example.playground;

import java.util.ArrayList;
import java.util.List;

public class Customers {
    List<Customer> customers;

    Customers(List<Customer> customers) {
        this.customers = customers;
    }

    Customers add(Customer customer) {
        List<Customer> result = new ArrayList(customers);
        result.add(customer);
        return new Customers(result);
    }
}
