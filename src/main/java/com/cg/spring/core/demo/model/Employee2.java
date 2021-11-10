package com.cg.spring.core.demo.model;

//Java based configuration 

public class Employee2 {
	private int eid;
	private String firstName;
	private double salary;

	public Employee2() {
		super();
	}

	public Employee2(int eid, String firstName, double salary) {
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
		return "Employee2 [eid=" + eid + ", firstName=" + firstName + ", salary=" + salary + "]";
	}

	
}
