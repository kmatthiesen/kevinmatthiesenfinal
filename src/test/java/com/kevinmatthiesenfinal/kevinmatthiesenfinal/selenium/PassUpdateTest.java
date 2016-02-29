package com.kevinmatthiesenfinal.kevinmatthiesenfinal.selenium;

import static org.junit.Assert.*;
import org.catalystitservices.PageObjectFramework.Framework.PageObjectTest;
import org.junit.Before;
import org.junit.Test;

public class PassUpdateTest extends PageObjectTest{
	
	private PassView passView;
	
	@Before
	public void setUp() {
		
		passView = new PassView(getDriver());
		
	}

	@Test
	public void goToUpdatePass() {
		
		String expected = "http://localhost:8080/#/pass/update/" + passView.passId();
		String actual = passView.passUpdate(passView.passId()).getUrl();
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void updatePass() {
		
		String expected = "Pass successfully updated.";
		String actual = passView.passUpdate(passView.passId()).updatePass();
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void deletePass() {
		
		String expected = "http://localhost:8080/#/pass/view";
		String actual = passView.passUpdate(passView.passId()).deletePass(passView).getUrl();
		
		assertEquals(expected, actual);
		
	}


}
