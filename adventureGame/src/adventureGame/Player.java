package adventureGame;

public class Player {

	public int x;
	public int y;

	Player(int x, int y) {
		this.x = x;
		this.y = y;

	}
	
	
	

	public String travelNorth() {
		y += 1;
		return "player moved north";
	}

	public String travelEast() {
		x += 1;
		return "player moved east";
	}

	public String travelSouth() {
		y -= 1;
		return "player moved south";
	}

	public String travelWest() {
		x -= 1;
		return "player moved west";
	}

	public String checkLocation() {
		return "Player is " + y + "km y," + x + "km x";
	}
}
