package Garage;

public class Car extends Vehicle {

	public int numberOfPassengers;

	public Car(String name, String colour, int year, int numberOfDoors, String typeOfFuel, int numberOfPassengers) {
		super.name = name;
		super.colour = colour;
		super.year = year;
		super.numberOfDoors = numberOfDoors;
		super.typeOfFuel = typeOfFuel;
		this.numberOfPassengers = numberOfPassengers;
	}

	@Override
	public String toString() {
		return "Car " + super.colour + super.year;
	}
}


