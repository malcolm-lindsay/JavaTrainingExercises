package adventureGame;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {

		String Observations = "";
		Swamp swamp1 = new Swamp();
		Player player1 = new Player(0, 0);

		System.out.println(player1.y);

		while ((player1.x != 5) || (player1.y != 4)) {

			System.out.println(player1.checkLocation());

			String callFunction;
			System.out.println("Select which direction you would like to travel: North, East, West or South");
			Scanner command = new Scanner(System.in);
			callFunction = command.nextLine();

			System.out.println(callFunction);

			if (callFunction.equals("North")) {
				player1.travelNorth();
			}
			if (callFunction.equals("East")) {
				player1.travelEast();
			}
			if (callFunction.equals("South")) {
				player1.travelSouth();
			}
			if (callFunction.equals("West")) {
				player1.travelWest();
			}

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
		System.out.println("you reached the treasure");
	}
}
