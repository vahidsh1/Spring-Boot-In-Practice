package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication springApplication=new SpringApplication(DemoApplication.class);
		springApplication.addListeners(new ApplicationStartingEventListener());
		springApplication.run(args);
	}

}
