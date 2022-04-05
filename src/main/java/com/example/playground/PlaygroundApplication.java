package com.example.playground;

import com.example.playground.customer.Customer;
import com.example.playground.customer.CustomerType;
import com.example.playground.customer.Customers;
import com.example.playground.fee.Fee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class PlaygroundApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlaygroundApplication.class, args);

		PlaygroundApplication a = new PlaygroundApplication();
		a.purchase(1, 500);
		a.addQuantity(10, 50);
		a.discountPrice(1000, 500);
		a.charge();
	}

	void purchase(int quantity, int unitPrice) {
		int basePrice = quantity * unitPrice;
		int shippingCost = shippingCost(basePrice);

		double itemPrice = (basePrice + shippingCost) * takeRate();
		System.out.println("item price is " +  itemPrice);
	}

	int shippingCost(int basePrice) {
		ShippingCost cost = new ShippingCost(basePrice);
		return cost.amount();
	}

	double takeRate()  {
		TakeRate rate = new TakeRate();
		return rate.getTakeRate();
	}

	void addQuantity(int baseValue, int additionalValue) {
		Quantity baseQuantity = new Quantity(baseValue);
		Quantity addedQuantity = baseQuantity.add(new Quantity(additionalValue));
		System.out.println("baseQuantity is " + baseQuantity.value);
		System.out.println("addedQuantity is " + addedQuantity.value);
	}

	void discountPrice(int baseAmount, int discountAmount) {
		Money basePrice = new Money(baseAmount);
		Money discounted = basePrice.minus(discountAmount);
		System.out.println("basePrice is " + basePrice.amount);
		System.out.println("discounted is " + discounted.amount);
	}

	void charge() {
		Customer adult = new Customer();
		Fee customerFee = adult.fee();
		System.out.println("fee for this adult is " + customerFee.money().amount);

		Customer child = new Customer(CustomerType.CHILD);
		Fee childFee = child.fee();
		System.out.println("fee for this child is " + child.fee().money().amount);

		Customers customers = new Customers(Arrays.asList(adult, child));
		Reservation reservation = new Reservation(customers);
		System.out.println("the total fee is " + reservation.feeTotal().amount);

		for (Fee fee: reservation.fees) {
			Charger charger = new Charger(fee);
			System.out.println("the subtotal amount to be charged is " + charger.money().amount);
		}
	}

}
