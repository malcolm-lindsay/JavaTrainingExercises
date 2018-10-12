package mavenFirst;

import java.util.ArrayList;
import java.util.List;

public class Person {

	private String Name;
	private int age;
	private String JobTitle;

	private List<String> container = new ArrayList<String>();

	public Person(String Name, int age, String JobTitle) {
		this.Name = Name;
		this.age = age;
		this.JobTitle = JobTitle;
		this.container.add(this.Name);
		this.container.add(Integer.toString(this.age));
		this.container.add(this.JobTitle);
	}

	@Override
	public String toString() {
		return this.container.get(0);
	}

	public void searchList() {

	}

	public void PrintMethod() {
		for (int i = 0; i < this.container.size(); i++) {
			System.out.println(this.container.get(i));
		}
	}
}

