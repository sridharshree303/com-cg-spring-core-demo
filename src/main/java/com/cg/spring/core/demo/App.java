package com.cg.spring.core.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.spring.core.demo.model.Employee;

/*
 * @author Vaman Deshmukh spring demo project 
 * @Hello world program
 *  
 */

public class App {
	public static void main(String[] args) {
		
		System.out.println("Start");
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
	//	Employee emp = new Employee(101,"sonu",10.7);
		
		Employee emp = ctx.getBean(Employee.class);
		
		System.out.println(emp.toString());
		
		System.out.println("End");
	}
}
