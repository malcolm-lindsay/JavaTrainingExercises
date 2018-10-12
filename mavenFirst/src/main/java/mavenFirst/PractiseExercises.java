package mavenFirst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PractiseExercises {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5, 9, 8, 12);

		// SquareAndAddtoNewList(numbers);
		SquareUniqueAndAddtoNewList(numbers);

		numbers.stream();

	}

	public static void printAll(List<Integer> numbers) {
		for (int i : numbers) {
			System.out.println(i);
		}
	}

	public static void printEvens(List<Integer> numbers) {
		for (int i : numbers) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	public static void timesTen(List<Integer> numbers) {
		for (int i : numbers) {
			System.out.println(i * 10);
		}
	}

	public static void Highest(List<Integer> numbers) {
		int temp = 0;
		for (int i : numbers) {
			if (i > temp)
				temp = i;
		}
		System.out.println(temp);
	}

	public static void Lowest(List<Integer> numbers) {
		int temp = 50;
		for (int i : numbers) {
			if (i < temp)
				temp = i;
		}
		System.out.println(temp);
	}


	public static void SquareAndAddtoNewList(List<Integer> numbers) {

		List<Integer> NewList = new ArrayList<Integer>();
		for (int i : numbers) {
			int temp = i * i;
			NewList.add(temp);
		}

		for (int i : NewList) {
			System.out.println(i);
		}
	}


	public static void SquareUniqueAndAddtoNewList(List<Integer> numbers) {
		List<Integer> UniqueList = new ArrayList<Integer>();

		for (int i : numbers) {
			if (!UniqueList.contains(i * i)) {
				UniqueList.add(i * i);
				System.out.println(i * i);

			}
		}
	}
}
