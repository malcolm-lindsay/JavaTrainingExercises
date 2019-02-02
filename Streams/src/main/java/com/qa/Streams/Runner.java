package com.qa.Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5, 9, 8, 12);
		onlyUniqueSquares(numbers);
	}
	
	public static void printList(List<Integer> myList) {
		myList.stream().forEach(System.out::println);
	}
	
	public static void printEvens(List<Integer> myList) {
		myList.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
	}
	
	public static void printTenTimes(List<Integer> myList) {
		myList.stream().map(i -> i*10).forEach(System.out::println);
	}
	
	public static void printHighest(List<Integer> myList) {
		IntSummaryStatistics stats = myList.stream().mapToInt((x) -> x).summaryStatistics();
		
		System.out.println(stats.getMax());
	}
	
	public static void printLowest(List<Integer> myList) {
		IntSummaryStatistics stats = myList.stream().mapToInt((x) -> x).summaryStatistics();
		
		System.out.println(stats.getMin());
	}
	
	public static void printSquares(List<Integer> myList) {
		List<Integer> squaredList = myList.stream().map(i -> i*i).collect(Collectors.toList());
		
		System.out.println(squaredList);
	}
	
	public static void uniqueSquares(List<Integer> myList) {
		List<Integer> uniqueSquares = myList.stream().map(i -> i*i).distinct().collect(Collectors.toList());
		
		System.out.println(uniqueSquares);
	}
	
	public static void onlyUniqueSquares(List<Integer> myList) {
		List<Integer> onlyUniqueSquares = myList.stream().filter(i -> Collections.frequency(myList, i) == 1).map(i -> i*i).collect(Collectors.toList());
		
		System.out.println(onlyUniqueSquares);
	}
}
