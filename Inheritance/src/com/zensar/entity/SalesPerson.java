package com.zensar.entity;

public class SalesPerson extends wageEmployee {
	private int commition;

	public SalesPerson(int salary, String name, int id, int hours, int rate,
			int commition) {
		super(salary, name, id, hours, rate);
		this.commition = commition;
		
	}

	public int calculateSalary() {
		return super.calculateSalary() + commition;
	}
}
