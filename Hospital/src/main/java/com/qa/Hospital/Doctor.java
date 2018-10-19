package com.qa.Hospital;

public class Doctor extends Employees {

	private String position;

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Doctor(String name, int age, int employeeID, int yearsOfExperience, String position) {
		super(name, age, employeeID, yearsOfExperience, position);
		this.position = position;
	}

	@Override
	public String toString() {
		return "Doctor [position=" + position + ", Teams=" + Teams + ", employeeID=" + getEmployeeID()
				+ ", yearsOfExperience=" + getYearsOfExperience() + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ "]";
	}
}
