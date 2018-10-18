package com.qa.LibaryProject;

public class Runner {

	public static void main(String[] args) {

		Library firstLibrary = new Library();

		Books book = new Books("Harry Potter", false, 20, 2005, true);

		GovermentDocuments documents = new GovermentDocuments("document1", false, 200, 2016, false);
		firstLibrary.addItem(book);
		firstLibrary.addItem(documents);
		
//		System.out.println(book);
		
		firstLibrary.updateItem("Harry Potter", "Ron Weasley");


		
		firstLibrary.printList();

	
	}
}
