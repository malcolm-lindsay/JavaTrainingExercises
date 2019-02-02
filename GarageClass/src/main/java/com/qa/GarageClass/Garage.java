package com.qa.GarageClass;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Garage {

	List<Vehicle> myGarage;
	
	public Garage() {
		this.myGarage = new ArrayList<>();
	}
	
	public void store(Vehicle myVehicle) {
		myGarage.add(myVehicle);
	}
	
	public void printBill() {	
		List<Object> myBills = myGarage.stream()
						  .map(i -> {
							  int bill = 0;
							  
							  bill += i.getTopSpeed()*3;
							  
							  if (i instanceof Car) {
								  bill += ((Car) i).getNumberOfSeatbelts()*10;
								  
							  } else if (i instanceof Motorcycle) {
								  if (((Motorcycle) i).getHasSideCar()) {
									  bill += 50;
								  }
								  
							  } else if (i instanceof Sled) {
								  bill += ((Sled) i).getNumberOfRails()*30;
							  }
							  
							  return bill;
						  	})
						  .collect(Collectors.toList());
		
		System.out.println(myBills);
	}
	
	public void remove(Vehicle myVehicle) {
		myGarage = myGarage.stream().filter(i -> !(i == myVehicle)).collect(Collectors.toList());
	}
	
	public void remove(String numberPlate) {
		myGarage = myGarage.stream().filter(i -> !(i.getNumberPlate().equals(numberPlate))).collect(Collectors.toList());
	}
	
	public void removeSlow(int topSpeed) {
		myGarage = myGarage.stream().filter(i -> i.getTopSpeed() > topSpeed).collect(Collectors.toList());
	}
	
	public void removeByType(String type) {
		if (type.equals("Car") || type.equals("car")) {
			myGarage = myGarage.stream().filter(i -> !(i instanceof Car)).collect(Collectors.toList());
		} else if (type.equals("Motorcycle") || type.equals("motorcycle")) {
			myGarage = myGarage.stream().filter(i -> !(i instanceof Motorcycle)).collect(Collectors.toList());
		} else if (type.equals("Sled") || type.equals("sled")) {
			myGarage = myGarage.stream().filter(i -> !(i instanceof Sled)).collect(Collectors.toList());
		}
	}
	
	public void emptyGarage() {
		myGarage.removeAll(myGarage);
	}
}
