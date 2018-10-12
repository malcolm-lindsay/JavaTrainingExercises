package com.qa.LibaryProject;

public class Maps extends Items {

	public String location;

	Maps(String name, boolean onLoan, int value, int year, String location) {
		super.name = name;
		super.onLoan = onLoan;
		super.value = value;
		super.year = year;
		this.location = location;
	}

}
