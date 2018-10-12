package com.qa.LibaryProject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestLibrary {

	@Test
	public void AddTest() {

		Library firstLibrary = new Library();

		Books book = new Books("Harry Potter", false, 20, 2005, true);

		assertEquals("Item added", firstLibrary.addItem(book));

	}

}
