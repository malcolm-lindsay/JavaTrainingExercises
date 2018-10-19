package com.qa.Hospital;

public class Patients extends People {

	private String treatment;
	private boolean criticalCondition;
	String location;


	@Override
	public String toString() {
		return "Patients [treatment=" + getTreatment() + ", criticalCondition=" + criticalCondition + ", location="
				+ location + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getClass()=" + getClass() + "]";
	}


	Patients(String name, int age, String treatment, boolean criticalCondition) {
		super.setName(name);
		super.setAge(age);
		this.setTreatment(treatment);
		this.criticalCondition = criticalCondition;
	}


	public String getTreatment() {
		return treatment;
	}

	
	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}
}
