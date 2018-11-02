package com.unimed.cfd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class CfdUnimedApplication {

	public static void main(String[] args) {
		SpringApplication.run(CfdUnimedApplication.class, args);
	}
}
