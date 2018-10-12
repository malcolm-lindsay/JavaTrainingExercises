package Garage;

public class Motorbike extends Vehicle {

	private Boolean hasSideCar;

	public Motorbike(String name, String colour, int year, int numberOfDoors, String typeOfFuel, Boolean hasSideCar) {
		super.name = name;
		super.colour = colour;
		super.year = year;
		super.numberOfDoors = numberOfDoors;
		super.typeOfFuel = typeOfFuel;
		this.hasSideCar = hasSideCar;

	}
}
