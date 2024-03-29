package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Customer;

@SpringBootApplication
public class SpringBootProjectApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootProjectApplication.class, args);
		Customer cust = context.getBean(Customer.class);
		cust.show();
	}

}
