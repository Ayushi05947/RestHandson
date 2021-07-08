package com.cognizant.xmlexample.model;

public class EmployeeModel {
	private int id;
	private String name;
	private double salary;
	
	
	public EmployeeModel() {
		super();
	}

	public EmployeeModel(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
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

	public void setId(int id) {
		this.id = id;
	}
}