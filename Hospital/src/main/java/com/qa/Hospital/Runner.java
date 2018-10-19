package com.qa.Hospital;

public class Runner {

	public static void main(String[] args) {
		
		Hospital hospital1 = new Hospital();
		
		Nurse nurse1 = new Nurse("Karen",50 , 4, 2, "f");
				
		Doctor doctor1 = new Doctor("Kyle", 22, 1, 1, "GP");
		Doctor doctor2 = new Doctor("Joe", 50, 5, 26,"Junior surgeon");
		
		hospital1.addDoctor(doctor1);
		hospital1.addDoctor(doctor2);
		
		hospital1.getDoctorList();
								
		Patients patient1 = new Patients("David", 19, "tom", true);
		Patients patient2 = new Patients("Larry", 22, "aids", true);
		Patients patient3 = new Patients("Harry", 40, "Broken leg", true);
		
		hospital1.addPatient(patient1, "Surgery");
		hospital1.addPatient(patient2, "Chapel");
		
		Employees Team1 = new Employees("Team1", 5, 1, 1, "Team"); 		
		Team1.addDoctor(doctor1);
		Team1.addDoctor(doctor2);
		Team1.addNurse(nurse1);
		
//		patientsList.stream().map(p -> p.name()).forEach(System.out::println);

		
		hospital1.printNamesWithStream();
		
		EnumsPractise enums = new EnumsPractise();
				
//		System.out.println(Team1);
// hospital1.getPatientsList();
//		hospital1.getPatientsList();

// hospital1.removePatient("Tom");
//		System.out.println(hospital1.checkLocation("David"));
// System.out.println(hospital1.checkLocation("Tom"));

//		Team1.getTeamsList();
	}
}