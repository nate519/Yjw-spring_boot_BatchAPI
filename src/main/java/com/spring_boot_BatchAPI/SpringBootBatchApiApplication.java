package com.spring_boot_BatchAPI;

import com.spring_boot_BatchAPI.component.HelloPrinter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootBatchApiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootBatchApiApplication.class);
		HelloPrinter helloPrinter = context.getBean(HelloPrinter.class);
		helloPrinter.printHello();
	}
}
