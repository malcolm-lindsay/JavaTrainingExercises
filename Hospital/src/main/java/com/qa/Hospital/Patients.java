package com.qa.Hospital;

public class Patients extends People {

	public String treatment;
	private boolean criticalCondition;
	String location;

	@Override
	public String toString() {
		return "Patients [treatment=" + treatment + ", criticalCondition=" + criticalCondition + ", name=" + name + ", age=" + age + "]";
	}

	Patients(String name, int age, String treatment, boolean criticalCondition) {
		super.name = name;
		super.age = age;
		this.treatment = treatment;
		this.criticalCondition = criticalCondition;
	}
}
