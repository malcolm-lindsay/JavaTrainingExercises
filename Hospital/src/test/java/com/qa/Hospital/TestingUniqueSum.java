package com.qa.Hospital;
import org.junit.Test;


import static org.junit.Assert.assertEquals;


public class TestingUniqueSum {

	@Test
	public void test() {
		
		UniqueSum unique = new UniqueSum();


		assertEquals(50, unique.UniqueSum(40, 6, 4));
		
	}
	
}
