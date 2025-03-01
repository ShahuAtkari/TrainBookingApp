package com.Springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication

@EnableWebMvc
public class RestApp2TicketbookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApp2TicketbookingApplication.class, args);
	}

}
