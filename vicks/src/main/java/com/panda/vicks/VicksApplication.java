package com.panda.vicks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class VicksApplication {

	public static void main(String[] args) {

		// Using the ApplicationContext
		ApplicationContext context = SpringApplication.run(VicksApplication.class, args);

		// Using the getBean() for injecting the Dependency
		Dev obj = context.getBean(Dev.class);

		// Using the objects feature
		obj.build();

	}

}
