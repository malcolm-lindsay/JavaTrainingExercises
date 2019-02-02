package com.qa.GarageClass;

public class Car extends Vehicle {

	private int numberOfSeatbelts;
	private boolean retractableRoof;
	
	public Car(int topSpeed, String numberPlate, String colour, int numberOfSeatbelts, boolean retractableRoof) {
		super(topSpeed, numberPlate, colour);
		this.numberOfSeatbelts = numberOfSeatbelts;
		this.retractableRoof = retractableRoof;
	}

	public boolean isRetractableRoof() {
		return retractableRoof;
	}

	public int getNumberOfSeatbelts() {
		return numberOfSeatbelts;
	}
}
