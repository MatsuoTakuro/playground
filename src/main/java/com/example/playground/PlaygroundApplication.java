package com.example.playground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlaygroundApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlaygroundApplication.class, args);

		PlaygroundApplication a = new PlaygroundApplication();
		a.stateTransitions();
	}

	void stateTransitions() {
		State from = State.UNDER_REVIEW;
		State to = State.APPROVED;
		System.out.println("Can it transition" +
				" from " + from.name() +
				" to " + to.name() +
				" ? " +
				" - "
				+ new StateTransitions().canTransit(from, to));
	}


}
