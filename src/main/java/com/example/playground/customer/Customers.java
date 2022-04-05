package com.example.playground.customer;

import java.util.ArrayList;
import java.util.List;

public class Customers {

    public List<Customer> customers;
    public Customers(List<Customer> customers) {
        this.customers = customers;
    }

    public Customers addCustomer(Customer customer) {
        List<Customer> result = new ArrayList(this.customers);
        System.out.println("result initialized " + result);
        result.add(customer);
        System.out.println("added result " + result);
        return new Customers(result);
    }
}
