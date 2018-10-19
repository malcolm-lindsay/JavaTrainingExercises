package com.qa.Hospital;

public class EnumsPractise {
	
	public enum seniorityLevel{
		ONE, TWO, THREE, FOUR, FIVE
	}
	
	public void exampleMethod(seniorityLevel level) {
//		seniorityLevel level = seniorityLevel.TWO;
		
		if (level == seniorityLevel.TWO) {
			System.out.println("Hello world");
		}
	}	
}
