package mavenFirst;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {

		Delegate d1 = new Delegate();

		Delegate aDifferentDelegate = new Delegate();

		d1.remove();

		aDifferentDelegate.changeStream();

		System.out.println(d1.name);

		d1.name = "Matt";

		System.out.println(d1.name);

		Person a = new Person("Malcolm", 22, "Consultant");

		Person b = new Person("Tom", 24, "Doctor");

		a.PrintMethod();
		b.PrintMethod();


		List<String> container2 = new ArrayList<String>();

		container2.stream().map(x -> x).forEach(System.out::println);
		

	}
}
