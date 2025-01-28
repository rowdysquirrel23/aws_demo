package com.example.travelappcalculatefare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class TravelappcalculatefareApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravelappcalculatefareApplication.class, args);
	}

	   @Bean
	    public RestTemplate restTemplate() {
	        return new RestTemplate();
	    }
}
