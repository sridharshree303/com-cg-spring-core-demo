package com.cg.spring.core.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

import com.cg.spring.core.demo.model.Employee3;

@Configuration
@ComponentScan
public class App3 {

	public static void main(String[] args) {
		
		System.out.println("Start");
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(App3.class);
	//	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(App3.class);

		Employee3 emp3 = ctx.getBean(Employee3.class);
		System.out.println(emp3.toString());

		((AbstractApplicationContext) ctx).close();

		System.out.println("End");
	
	}

}
