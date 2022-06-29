package com.zensar.entity;

public class Employee extends Object{ 
	private int salary;
	private String name;
	private int id;

	public Employee(int salary, String name, int id) {
		super();
		this.salary = salary;
		this.name = name;
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return salary + " " + name + " " + id;
	}

}
