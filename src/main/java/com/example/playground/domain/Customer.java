package com.example.playground.domain;

public class Customer {

    String firstName;
    String lastName;
    Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    void register(Customer customer) {};
}
