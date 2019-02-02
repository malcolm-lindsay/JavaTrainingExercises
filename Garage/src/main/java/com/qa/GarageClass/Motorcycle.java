package com.qa.GarageClass;

public class Motorcycle extends Vehicle {

	private boolean hasSideCar;
	
	public Motorcycle(int topSpeed, String numberPlate, String colour, boolean hasSideCar) {
		super(topSpeed, numberPlate, colour);
		this.hasSideCar = hasSideCar;
	}

	public boolean getHasSideCar() {
		return hasSideCar;
	}
}
