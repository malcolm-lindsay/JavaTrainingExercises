package Garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	List<Vehicle> VehicleList = new ArrayList<Vehicle>();

	public void setVehicle(Vehicle a) {
		VehicleList.add(a);
	}

	public Vehicle getVehicle(String stringName) {
		if (VehicleList.size() > 0) {
			for (int i = 0; i < VehicleList.size(); i++) {
				if (VehicleList.get(i).name == stringName)
					return VehicleList.get(i);
			}
		}
		return null;
	}


	public String getBill(String name) {
		if (VehicleList.size() > 0) {
			for (int i = 0; i < VehicleList.size(); i++) {
				if (VehicleList.get(i).name == name && VehicleList.get(i).colour == "red") {
					return "Your car is worth £1000";
				} else if (VehicleList.get(i).name == name && VehicleList.get(i).colour == "blue") {
					return "Your car is crap";
				}
			}
		}
		return null;
	}


	public String removeVehicle(String vehicleName) {
		for (int i = 0; i < VehicleList.size(); i++)
			if (vehicleName == VehicleList.get(i).name) {
				VehicleList.remove(i);
				return vehicleName + " removed from VehicleList";
			} else {
				return vehicleName + " does not exist in list";
			}
		return "";
	}
}
