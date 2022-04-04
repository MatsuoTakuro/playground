package com.example.playground;

public class Customer {

    CustomerType customerType;
    Customer() {
        this.customerType = CustomerType.ADULT;
    }

    Customer(CustomerType customerType) {
        this.customerType = customerType;
    }

     Boolean isChild() {
        return this.customerType == CustomerType.CHILD;
    }

    Boolean isAdult() {
        return this.customerType == CustomerType.ADULT;
    }

//  TODO: This method should be defined independently in Fee class, from Customer class
    double fee() {
        int baseFee = 1000;
        if (isChild()) {
            return  baseFee * 0.5;
        }
        return  baseFee;
    }
}
