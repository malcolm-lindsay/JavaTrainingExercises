package com.qa.Hospital;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestingBJ {

	
	@Test
	public void test() {

		BJ blackjack = new BJ();

		assertEquals(8, blackjack.Blackjack(5, 8));
		
	}
	
}
