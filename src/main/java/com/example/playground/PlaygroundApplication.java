package com.example.playground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlaygroundApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlaygroundApplication.class, args);

		PlaygroundApplication a = new PlaygroundApplication();
		a.sub();
	}

	void sub() {
		int quantity =  1;
		int unitPrice = 500;
		int basePrice = quantity * unitPrice;

		int shippingCost = shippingCost(basePrice);

		double itemPrice = (basePrice + shippingCost) * takeRate();
		System.out.println(itemPrice);
	}

	double takeRate()  {
		return 1.10;
	}

	int shippingCost(int basePrice) {
		ShippingCost cost = new ShippingCost(basePrice);
		return cost.amount();
	}
}
