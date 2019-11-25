package com.demo.springboot;

public class SendableOfMail implements Sendable<Mail>{

	public void send(Mail object) {
		System.out.println("sending mail:" + object);
	}
}
