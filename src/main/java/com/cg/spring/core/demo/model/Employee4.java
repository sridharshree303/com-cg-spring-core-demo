package com.cg.spring.core.demo.model;

import com.cg.spring.core.demo.Person;

public class Employee4 implements Person {
	
	private int id;
	private String name;
	private double salary;

	@Override
	public void eat() {
		System.out.println("Employee4 class configured");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee4 [id=" + id + ", Name=" + name + ", salary=" + salary + "]";
	}
	
}
