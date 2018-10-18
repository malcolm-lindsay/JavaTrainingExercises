package com.qa.Hospital;
import java.util.ArrayList;
import java.util.List;

public class Employees extends People {
	
	public List<Employees> Teams = new ArrayList<Employees>();
	
	public void getTeamsList() {
		Teams.stream().forEach(System.out::println);
	}
	
				
	public int employeeID;
	public int yearsOfExperience;
	public String position;

	public Employees(String name, int age, int employeeID, int yearsOfExperience, String position) {
		super.name = name;
		super.age = age;
		this.employeeID = employeeID;
		this.yearsOfExperience = yearsOfExperience;
		this.position = position;
	}

	public void addDoctor(Doctor doctor) {
		Teams.add(doctor);
	}
	
	public void addNurse(Nurse nurse) {
		Teams.add(nurse);
	}
	
	public void removeDoctor(Doctor doctor) {
		Teams.remove(doctor);
	}
	
	public void removeNurse(Nurse nurse) {
		Teams.remove(nurse);
	}
}