package com.example.playground;

import com.example.playground.customer.Customer;
import com.example.playground.customer.Customers;
import com.example.playground.fee.Fee;

import java.util.ArrayList;
import java.util.List;

public class Reservation {

    List<Fee> fees;
    public Reservation() { this.fees = new ArrayList<Fee>(); }

    public Reservation(List<Fee> fees) {
        this.fees = fees;
    }

    public Reservation(Customers customers) {
        List<Fee> result = new ArrayList();
        for (Customer customer: customers.customers) {
            result.add(customer.fee());
        }
        this.fees = result;
    }

    public Reservation addFee(Fee fee) {
        List<Fee> result = new ArrayList(this.fees);
        result.add(fee);
        return new Reservation(result);
    }

    public Reservation addFee(Customers customers) {
        List<Fee> result = new ArrayList(this.fees);
        for (Customer customer: customers.customers) {
            result.add(customer.fee());
        }
        return new Reservation(result);
    }

    Money feeTotal() {
        return new Money().total(this.fees);
    }
}
