package com.qa.CheckStringLambdas;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Runner {

	public static void main(String[] args) {
		System.out.println(checkString("Hello", "Hell"));
	}
	
	public static boolean checkString(String string1, String string2) {
		BiPredicate<String, String> myBiInterface = (s1, s2) -> s1.equals(s2);
		
		return myBiInterface.test(string1, string2);
	}
	
	public static boolean checkHello(String s) {
		Predicate<String> myPredicate = (s1) -> s1.equals("Hello");
		
		return myPredicate.test(s);
	}
}
