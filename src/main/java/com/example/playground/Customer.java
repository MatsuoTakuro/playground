package com.example.playground;

public class Customer {

    CustomerType customerType;
    Customer() { this.customerType = CustomerType.ADULT; }

    Customer(CustomerType customerType) { this.customerType = customerType; }

    Boolean isBaby() { return this.customerType == CustomerType.BABY; }

    Boolean isChild() { return this.customerType == CustomerType.CHILD; }

    Boolean isAdult() { return this.customerType == CustomerType.ADULT; }

    Boolean isSenior() { return this.customerType == CustomerType.SENIOR; }

    Money fee() {
        if (isBaby()) return babyFee();
        if (isChild()) return childFee();
        if (isSenior()) return seniorFee();
        return adultFee();
    }

    Money babyFee() { return new Fee().babyFee(); }

    Money childFee() { return new Fee().childFee(); }

    Money adultFee() { return new Fee().adultFee(); }

    Money seniorFee() { return new Fee().seniorFee(); }

}
