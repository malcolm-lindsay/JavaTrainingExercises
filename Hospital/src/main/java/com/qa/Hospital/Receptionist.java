package com.qa.Hospital;

public class Receptionist extends Employees {

	public String department;
	
	public Receptionist(String name, int age, int employeeID, int yearsOfExperience, String position) {
		super.name = name;
		super.age = age;
		super.employeeID = employeeID;
		super.yearsOfExperience = yearsOfExperience;
		super.position = position;
		this.department = department;
	}
}
