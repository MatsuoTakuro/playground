package com.example.playground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlaygroundApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlaygroundApplication.class, args);

		PlaygroundApplication a = new PlaygroundApplication();
		a.purchase(1, 500);
		a.addQuantity(10, 50);
		a.discountPrice(1000, 500);
		a.logic();
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

	void logic() {
		Customer customer = new Customer();
		System.out.println("fee for this customer is " + customer.fee().amount);
		Customer child = new Customer(CustomerType.CHILD);
		System.out.println("fee for this customer is " + child.fee().amount);
	}

}
