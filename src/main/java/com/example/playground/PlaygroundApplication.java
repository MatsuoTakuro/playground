package com.example.playground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlaygroundApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlaygroundApplication.class, args);

		PlaygroundApplication a = new PlaygroundApplication();
		a.purchase(1, 500);
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
}
