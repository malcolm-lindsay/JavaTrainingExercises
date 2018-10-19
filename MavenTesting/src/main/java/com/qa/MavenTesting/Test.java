package com.qa.MavenTesting;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;



public class Test {

	
	
	
	

	@Test
	public void multChar() {
		assertEquals("TTThhheee", oe.multChar("The"));
		assertEquals("AAAAAAbbbbbb", oe.multChar("AAbb"));
		assertEquals("HHHiii---TTThhheeerrreee", oe.multChar("Hi-There"));
	}
	
	
	
}
