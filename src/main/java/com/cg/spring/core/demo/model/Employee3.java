package com.cg.spring.core.demo.model;

import org.springframework.stereotype.Component;

//Annotation based configuration 

@Component
public class Employee3 {

	private int eid = 101;
	private String firstName = "Sonu";
	private double salary = 10.75;

	public Employee3() {
		super();
	}

	public Employee3(int eid, String firstName, double salary) {
		super();
		this.eid = eid;
		this.firstName = firstName;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee3 [eid=" + eid + ", firstName=" + firstName + ", salary=" + salary + "]";
	}
}
