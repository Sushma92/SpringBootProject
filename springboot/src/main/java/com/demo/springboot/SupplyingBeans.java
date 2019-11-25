package com.demo.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SupplyingBeans {

	@Bean
	public Sendable<Mail> createSendable(){
		return new SendableOfMail();
	}
	
	@Bean
	public ComplexLogicService complexLogicService(@Autowired Sendable<Mail> sendable) {
		return new ComplexLogicService(sendable);
	}
}
