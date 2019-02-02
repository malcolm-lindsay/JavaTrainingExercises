package com.qa.GarageClass;

public class Runner {

	public static void main(String[] args) {
		Garage myGarage = new Garage();
		
		Vehicle myCar = new Car(110, "KR06 KFJ", "Red", 4, true);
		Vehicle myMotorcycle = new Motorcycle(100, "KI56 LSW", "Blue", false);
		Vehicle mySled = new Sled(45, "IG09 HWU", "Green", 3);
		
		myGarage.store(myCar);
		myGarage.store(myMotorcycle);
		myGarage.store(mySled);
		
		myGarage.printBill();
	}
}
