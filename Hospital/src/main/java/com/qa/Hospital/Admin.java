package com.qa.Hospital;

public class Admin extends Employees{

	Hospital hospital = new Hospital();
	
	public String addPatient(Patient a) {
	hospital.setPatientsList(a);
	return "Patient added";
	}
	
	
	
//	As a member of the Hospital Admin team
//	I want to be able to remove a doctor from a team
//	So that the system accurately reflects the state of the teams.


}
