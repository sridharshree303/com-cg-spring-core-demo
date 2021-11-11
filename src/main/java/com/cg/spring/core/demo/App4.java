package com.cg.spring.core.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.spring.core.demo.model.Employee4;

public class App4 {
	
	// 

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("SpringConfig2.xml");
		
		Person person = ctx.getBean("employee",Employee4.class);
		person.eat();
		System.out.println(person.toString());
		
		Person person1 = ctx.getBean("child",Employee4.class);    
		person.eat();
		System.out.println(person1.toString());
		
		((AbstractApplicationContext) ctx).close();

	}

}
