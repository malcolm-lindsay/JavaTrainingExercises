package com.qa.LibaryProject;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private List<People> personList = new ArrayList<People>();

	private List<Items> itemsList = new ArrayList<Items>();

	public String addItem(Items a) {
		itemsList.add(a);
		return "Item added";
	}

	public String CheckOut(String itemName) {
		for (int i = 0; i < itemsList.size(); i++) {
			if (itemsList.get(i).name == itemName) {
				itemsList.get(i).onLoan = true;
				return "Item checked out";
			}
		}
		return " ";
	}
}




// 11. ALL of the following:
// a. Check out item
// b. Check in item
// c. Add item
// d. Remove item
// e. Update item
// f. Register person
// g. Delete person
// h. Update person
