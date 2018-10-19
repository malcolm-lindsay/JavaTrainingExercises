package com.qa.thursdayWeek1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestingBlackjack {

	@Test
	public void test() {

		Blackjack blackjack = new Blackjack();

		assertEquals(18, blackjack.closerTo21(18, 8));
	}

}
