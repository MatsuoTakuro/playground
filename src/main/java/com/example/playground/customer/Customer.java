package com.example.playground.customer;

import com.example.playground.Money;
import com.example.playground.fee.*;

public class Customer {

    CustomerType customerType;
    public Customer() { this.customerType = CustomerType.ADULT; }

    public Customer(CustomerType customerType) { this.customerType = customerType; }

    public Fee fee() {
        if (isBaby()) return babyFee();
        if (isChild()) return childFee();
        if (isSenior()) return seniorFee();
        return adultFee();
    }

    Boolean isBaby() { return this.customerType == CustomerType.BABY; }

    Boolean isChild() { return this.customerType == CustomerType.CHILD; }

    Boolean isAdult() { return this.customerType == CustomerType.ADULT; }

    Boolean isSenior() { return this.customerType == CustomerType.SENIOR; }

    Fee babyFee() { return new BabyFee(); }

    Fee childFee() { return new ChildFee(); }

    Fee adultFee() { return new AdultFee(); }

    Fee seniorFee() { return new SeniorFee(); }
}
