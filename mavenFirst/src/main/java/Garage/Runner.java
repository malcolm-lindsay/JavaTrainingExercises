package Garage;

public class Runner {

	public static void main(String[] args) {

		Garage a = new Garage();

		Car ford = new Car("ford", "blue", 1995, 4, "Petrol", 5);
		Lorry HugeLorry = new Lorry("HugeLorry", "red", 2005, 2, "diesel", 10000);
		Motorbike Suzuki = new Motorbike("Suzuki", "black", 2003, 0, "Petrol", false);

		a.setVehicle(ford);
		a.setVehicle(HugeLorry);
		a.setVehicle(Suzuki);

		System.out.println(a.getVehicle("Suzuki").year);

		System.out.println(a.getBill("ford"));

		System.out.println(a.removeVehicle("ford"));

	}
}