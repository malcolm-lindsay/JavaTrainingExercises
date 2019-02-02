package com.qa.Blackjack;

public class Runner {

	public static void main(String[] args) {
		System.out.println(playBlackjack(22, 22));
	}
	
	public static int playBlackjack(int a, int b) {
		if (a > 21 && b > 21) {
			return 0;
		}
		
		if (a > 21) {
			return b;
		} else if (b > 21){
			return a;
		} else if (21 - a > 21 - b) {
			return b;
		} else {
			return a;
		}
	}
}
