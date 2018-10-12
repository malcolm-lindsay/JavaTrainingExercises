package com.qa.LibaryProject;

public class GovermentDocuments extends Items {

	public boolean confidential;

	GovermentDocuments(String name, boolean onLoan, int value, int year, boolean confidential) {
		super.name = name;
		super.onLoan = onLoan;
		super.value = value;
		super.year = year;
		this.confidential = confidential;
	}
}
