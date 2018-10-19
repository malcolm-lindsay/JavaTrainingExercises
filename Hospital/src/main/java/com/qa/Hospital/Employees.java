package com.qa.Hospital;
import java.util.ArrayList;
import java.util.List;

public class Employees extends People {
	
	public List<Employees> Teams = new ArrayList<Employees>();
	
	public void getTeamsList() {
		Teams.stream().forEach(System.out::println);
	}
	
				
	private int employeeID;
	private int yearsOfExperience;
	private String position;

	public Employees(String name, int age, int employeeID, int yearsOfExperience, String position) {
		super.setName(name);
		super.setAge(age);
		this.employeeID = employeeID;
		this.yearsOfExperience = yearsOfExperience;
		this.position = position;
	}

	
	public List<Employees> getTeams() {
		return Teams;
	}


	public void setTeams(List<Employees> teams) {
		Teams = teams;
	}


	public int getEmployeeID() {
		return employeeID;
	}


	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}


	public int getYearsOfExperience() {
		return yearsOfExperience;
	}


	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
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