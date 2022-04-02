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

	public  void sub() {
		int quantity =  1;
		int unitPrice = 500;
		int basePrice = quantity * unitPrice;

		int shippingCost = shippingCost(basePrice);

		double itemPrice = (basePrice + shippingCost) * takeRate();
		System.out.println(itemPrice);
	}

	public  double takeRate()  {
		return 1.10;
	}

	public int shippingCost(int basePrice) {
		if (basePrice < 3000) return 500;

		return 0;
	}

}
