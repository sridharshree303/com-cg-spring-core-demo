package com.cg.spring.core.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.cg.spring.core.demo.model.Employee2;

public class App2 {

	public static void main(String[] args) {
		System.out.println("Start");

		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

		Employee2 emp2 = ctx.getBean(Employee2.class);

		System.out.println(emp2.toString());

		((AbstractApplicationContext) ctx).close();
		System.out.println("End");

	}

}
