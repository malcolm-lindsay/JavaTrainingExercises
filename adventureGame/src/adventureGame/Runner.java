package adventureGame;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		String Observations ="";
		Swamp compass = new Swamp();
		Player player1 = new Player(0, 0);
		String callFunction;
		System.out.println("Select which direction you would like to travel: North, East, West or South");

		Scanner command = new Scanner(System.in);
		callFunction = command.nextLine();
		
//		System.out.println(player1.travelNorth());
//		System.out.println(player1.y);
		
// boolean treasure; 
//	while (treasure = false) {	
//		
//		if (callFunction == "North") {
//		 player1.travelNorth();
//		}
//		if (callFunction == "East") {
//			player1.travelEast();
//		}
//		if (callFunction == "South") {
//			player1.travelSouth();
//		}
//		if (callFunction == "West") {
//			player1.travelWest();
//		if (Observations == "Treasure found")
//		{ treasure = true;}
//		}
//	}
		
		// implementing while loop which is false until player1.x and player1.y coincide with the treasure location 
		

//		System.out.println(player1.y);
//		System.out.println(player1.checkLocation());
		
		

		switch (player1.x) {
		case 5:

			if (player1.y == 4) {
				Observations = "Treasure found";
			}

			if (player1.y < 4) {
				Observations = "Treasure to the north ";
			} else {
				Observations = "You are lost in the fog";
			}

			System.out.println(Observations);
			break;

		case 4:
			Observations = "You are lost in the fog";
			System.out.println(Observations);

			break;

		case 3:
			Observations = "You are lost in the fog";
			System.out.println(Observations);

			break;

		case 2:

			if (player1.y == -4) {
				Observations = " You have entered a dungeon";
			}

			if (player1.y <= 0 && player1.y > -4) {
				Observations = " You can see a dungeon to the south";
			}

			else {
				Observations = "You are lost in the fog";
			}

			System.out.println(Observations);

			break;

		case 1:
			Observations = "You are lost in the fog";
			System.out.println(Observations);
			break;

		case 0:
			Observations = "You are lost in the fog";
			System.out.println(Observations);
			break;

		case -1:
			Observations = "You are lost in the fog";
			System.out.println(Observations);
			break;

		case -2:
			if (player1.y == 2) {
				Observations = " You have entered a forest";
			}

			if (player1.y <= 1) {
				Observations = " You can see a forest to the north";
			}
			
			if (player1.y >= 3) {
				Observations = " You can see a forest to the south";
			}			
			
			else {
				Observations = "You are lost in the fog";
			}
			
			System.out.println(Observations);
			break;

		case -3:
			Observations = "You are lost in the fog";
			System.out.println(Observations);
			break;

		case -4:
			Observations = "You are lost in the fog";
			System.out.println(Observations);
			break;

		case -5:
			Observations = "You are lost in the fog";
			System.out.println(Observations);
			break;

		default:
			Observations = "You are lost in the fog";
			System.out.println(Observations);
			break;
		}
	}
}
