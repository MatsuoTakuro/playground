package com.example.playground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlaygroundApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlaygroundApplication.class, args);

		PlaygroundApplication a = new PlaygroundApplication();
		a.stateTransitions();
		a.dueDatePattern();
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

	void dueDatePattern() {
		DueDate dueDate = new DueDate();
		System.out.println("alert priority of due date is " +dueDate.alertPriority());
	}


}
