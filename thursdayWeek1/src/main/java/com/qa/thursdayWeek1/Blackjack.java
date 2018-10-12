package com.qa.thursdayWeek1;

public class Blackjack {

	public int closerTo21(int a, int b) {
		if (21 - a <= 21 - b) {
			return a;
		} else if (a > 21 && b > 21) {
			return 0;
		} else {
			return -1;
		}
	}

	// Given 2 Integer values greater than 0, return whichever value is closest to
	// 21 without going over 21. If they both go over 21 then return 0;

}

