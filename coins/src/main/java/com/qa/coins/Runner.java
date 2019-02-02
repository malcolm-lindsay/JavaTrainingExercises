package com.qa.coins;

public class Runner {

	public static void main(String[] args) {
		change(2.46, 20);
	}
	
	public static void change(double cost, double amount) {
		System.out.println("The cost is £" + cost + " and the customer pays £" + amount + " therefore the change is:");
		int change = (int)((amount - cost)*100);
		
		
		int twentys = (int) (change/2000);
		change -= twentys*2000;
		int tens = (int) (change/1000);
		change -= tens*1000;
		int fives = (int) (change/500);
		change -= fives*500;
		int twos = (int) (change/200);
		change -= twos*200;
		int ones = (int) (change/100);
		change -= ones*100;
		int fiftyPence = (int) (change/50);
		change -= fiftyPence*50;
		int twentyPence = (int) (change/20);
		change -= twentyPence*20;
		int tenPence = (int) (change/10);
		change -= tenPence*10;
		int fivePence = (int) (change/5);
		change -= fivePence*5;
		int twoPence = (int) (change/2);
		change -= twoPence*2;
		int onePence = (int) (change/1);
		change -= onePence;
		
		if (twentys != 0) {
			System.out.println(twentys + " £20 notes");
		} if (tens != 0) {
			System.out.println(tens + " £10 notes");
		} if (fives != 0) {
			System.out.println(fives + " £5 notes");
		} if (twos != 0) {
			System.out.println(twos + " £2 coins");
		} if (ones != 0) {
			System.out.println(ones + " £1 coins");
		} if (fiftyPence != 0) {
			System.out.println(fiftyPence + " 50p coins");
		} if (twentyPence != 0) {
			System.out.println(twentyPence + " 20p coins");
		} if (tenPence != 0) {
			System.out.println(tenPence + " 10p coins");
		} if (fivePence != 0) {
			System.out.println(fivePence + " 5p coins");
		} if (twoPence != 0) {
			System.out.println(twoPence + " 2p coins");
		} if (onePence != 0) {
			System.out.println(onePence + " 1p coins");
		}
	}
}
