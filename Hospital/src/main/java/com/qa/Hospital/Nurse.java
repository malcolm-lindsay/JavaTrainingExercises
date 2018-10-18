package com.qa.Hospital;

public class Nurse extends Employees {

	public Nurse(String name, int age, int employeeID, int yearsOfExperience, String position) {
		super(name, age, employeeID, yearsOfExperience, position);
	}

	@Override
	public String toString() {
		return "Nurse [employeeID=" + employeeID + ", yearsOfExperience=" + yearsOfExperience
				+ ", position=" + position + ", name=" + name + ", age=" + age + "]";
	}
}
