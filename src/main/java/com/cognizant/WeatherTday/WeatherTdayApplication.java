package com.cognizant.WeatherTday;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableJpaRepositories
@SpringBootApplication
public class WeatherTdayApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherTdayApplication.class, args);
	}

}
