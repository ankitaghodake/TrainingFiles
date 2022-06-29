package com.zensar.entity;

public class wageEmployee extends Employee {
	private int hours;
	private int rate;

	public wageEmployee(int salary, String name, int id, int hours, int rate) {
		/*
		 * setSalary(salary); setName(name); setId(id);
		 */
		super(salary, name, id);
		this.hours = hours;
		this.rate = rate;
		
	}

	@Override
	public String toString() {
		return getSalary() + " " + getName() + " " + getId() + " " + hours
				+ " " + rate;
	}

	public int calculateSalary() {
		return hours * rate;
	}

}
