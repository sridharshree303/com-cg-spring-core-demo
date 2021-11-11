package com.cg.spring.core.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.spring.core.demo.model.Department;
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
		
		Employee emp = ctx.getBean("employee",Employee.class);
		System.out.println(emp.toString());
		
		Employee emp2 = ctx.getBean("employee1",Employee.class);
		System.out.println(emp2.toString());

		Employee emp3 = ctx.getBean("employee2", Employee.class);
		System.out.println(emp3.toString());
		
		// COLLECTION INJECTION
		Department dept = ctx.getBean("department",Department.class);     // setter or property injection
		System.out.println(dept.toString());
		
		Department dept1 = ctx.getBean("department1",Department.class);   // constructor injection
		System.out.println(dept1.toString());
		
		// INNER Beans
		
		Employee emp4 = ctx.getBean("employee3", Employee.class);
		System.out.println(emp4.toString());
		// Autowire
		Employee emp5 = ctx.getBean("employee5", Employee.class);
		System.out.println(emp5.toString());

		
		((AbstractApplicationContext) ctx).close();
		System.out.println("End");
		
		
		
	}
}



