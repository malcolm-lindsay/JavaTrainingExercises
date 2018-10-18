package com.qa.Hospital;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Hospital {
	
	public List<Patients> patientsList = new ArrayList<Patients>();
	
	public List<Doctor> doctorList = new ArrayList<Doctor>();
	
	HashMap<String, String> patientsLocation = new HashMap<String, String>();
		
	public void addDoctor(Doctor a) {
		doctorList.add(a);
	}
	
	public void removeDoctor(Doctor a) {
		doctorList.remove(a);
	}

	public void changeDoctorPosition(String name, String newPosition){
		for (int i =0; i< doctorList.size(); i++) {
			if (doctorList.get(i).name == name) {
				doctorList.get(i).position = newPosition; }
			}
		}
		
	public void getDoctorList() {
		doctorList.stream().forEach(System.out::println);
	}
		
	
	public void getPatientsList() {
		patientsList.stream().forEach(System.out::println);
	}

	public void addPatient(Patients a, String location) {
		patientsList.add(a);
		patientsLocation.put(a.name, "surgery");
	}
	
	public String removePatient(String name) {
		patientsLocation.remove(name);
		for (int i = 0; i < patientsList.size(); i++) {
			if (name == patientsList.get(i).name) {
				patientsList.remove(i);
				return name + "removed from patientList";
			}
		}
		return "Patient does not exist";
	}

	
	public String checkLocation(String name) {
		return patientsLocation.get(name);
	}

	public String checkTreatment(String a) {
		for (int i = 0; i < patientsList.size(); i++) {
			if (patientsList.get(i).name == a) {
				return patientsList.get(i).treatment;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "Hospital [patientsList=" + patientsList + "]";
	}
	
}
