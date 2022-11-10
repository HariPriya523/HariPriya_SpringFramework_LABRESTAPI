package com.greatlearning.studentdetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class DebateEventApplication {

	public static void main(String[] args) {
		SpringApplication.run(DebateEventApplication.class, args);
	}

}
