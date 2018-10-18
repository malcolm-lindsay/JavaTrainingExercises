package com.qa.Hospital;

public class Doctor extends Employees {

	String position;

	public Doctor(String name, int age, int employeeID, int yearsOfExperience, String position) {
		super(name, age, employeeID, yearsOfExperience, position);
		this.position = position;
	}

	@Override
	public String toString() {
		return "Doctor [position=" + position + ", employeeID=" + employeeID + ", yearsOfExperience="
				+ yearsOfExperience + ", name=" + name + ", age=" + age + "]";
	}

}
