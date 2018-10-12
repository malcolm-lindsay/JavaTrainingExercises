package Garage;

public class Lorry extends Vehicle {

	public int maximumLoad;

	public Lorry(String name, String colour, int year, int numberOfDoors, String typeOfFuel, int maximumLoad) {
		super.name = name;
		super.colour = colour;
		super.year = year;
		super.numberOfDoors = numberOfDoors;
		super.typeOfFuel = typeOfFuel;
		this.maximumLoad = maximumLoad;
	 }
}
