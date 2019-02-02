package com.qa.Doggo;

public class Runner {

	public static void main(String[] args) {
		competition(5);
	}
	
	public static void competition(int position) {
		String[] placements = new String[100];
		
		for (int i = 1; i <= 100; i++) {
			if ((i % 10 == 1 || i == 1) && i != 11) {
				placements[i - 1] = i + "st";
			} else if ((i % 10 == 2 || i == 2) && i != 12) {
				placements[i - 1] = i + "nd";
			} else {
				placements[i - 1] = i + "th";
			}
		}
		
		placements[position - 1] = "";
		
		for (int i = 0; i < 100; i++) {
			if (!placements[i].equals("")) {
				System.out.print(placements[i] + ", ");
			}
		}
		
	}

}
