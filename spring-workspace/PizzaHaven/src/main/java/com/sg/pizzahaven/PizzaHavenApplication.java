package com.sg.pizzahaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.sg.pizzahaven")
public class PizzaHavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzaHavenApplication.class, args);
	}

}
