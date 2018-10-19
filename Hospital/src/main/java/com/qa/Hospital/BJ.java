package com.qa.Hospital;

public class BJ {

	public int Blackjack(int a, int b) {
		if (a>21 && b>21)
				return 0;
		return (a> b) ? a : b;
	}	
}
