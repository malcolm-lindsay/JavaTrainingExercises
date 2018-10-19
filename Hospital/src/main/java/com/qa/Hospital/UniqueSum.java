package com.qa.Hospital;

public class UniqueSum {

	
//	Given 3 integer values, return their sum. If one value is the same as another value, they do not count towards the sum. In other words, only return the sum of unique numbers given. 
	
	public int UniqueSum(int a, int b, int c) {
		if (a==b)
			return c;
		
		if(b==c)
			return a;
		
		if (a==c)
			return b;
				
		return a+b+c;
	}
	
}
