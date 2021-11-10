package com.cg.spring.core.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cg.spring.core.demo.model.Employee2;

@Configuration
public class Config {

	@Bean
	public Employee2 employee2() {

//		return new Employee2();
		return new Employee2(101, "Sonu", 10.25);
	}
}
