package com.springboot.htms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.springboot.htms")
@EntityScan(basePackages = {"com.springboot.htms"})
public class HotelAndtourismManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelAndtourismManagementSystemApplication.class, args);
	}

}
