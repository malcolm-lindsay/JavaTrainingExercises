package com.qa.LibaryProject;

public class Books extends Items {

	public Boolean Fictional;

	Books(String name, boolean onLoan, int value, int year, boolean Fictional) {
		super.name = name;
		super.onLoan = onLoan;
		super.value = value;
		super.year = year;
		this.Fictional = Fictional;
	}
}

