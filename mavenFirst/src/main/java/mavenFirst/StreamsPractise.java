package mavenFirst;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsPractise {

	public static void main(String[] args) {
	
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5, 9, 8, 12);
		
		// Printing out whole list
		// numbers.stream().forEach(System.out::println);
		//

		// Printing evens
		// numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

		// Printing the list * 10
		// numbers.stream().map(x -> x * 10).forEach(System.out::println);

		// Printing highest
		int Highest = numbers.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(Highest);

		// Printing Lowest
		int Lowest = numbers.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(Lowest);

		// numbers.stream().collect(Collectors.summarizingInt(numbers::getDependents));

		// SquareAndAddtoNewList
		// List<Integer> squareNumbersList = numbers.stream().map(x -> x *
		// x).collect(Collectors.toList());

		// numbers.stream().map(x -> x
		// *x).collect(Collectors.toList()).stream().forEach(System.out::println);


		// SquareUniqueAndAddToNewList
		List<Integer> UniqueSqaureNumbersList = numbers.stream().map(x -> x * x).collect(Collectors.toList());
		UniqueSqaureNumbersList.stream().distinct().forEach(System.out::println);

		// System.out.println(LambdasPractise.addition.operation(35, 3));

		System.out.println(StringLambdasPractise.concatenation.operation("as", "dw"));


	}

	LambdasPractise TestMathLambda = (a, b) -> a + b;

}

