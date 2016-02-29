package com.kevinmatthiesenfinal.kevinmatthiesenfinal.selenium;

import static org.junit.Assert.assertEquals;

import org.catalystitservices.PageObjectFramework.Framework.PageObjectTest;
import org.junit.Before;
import org.junit.Test;

public class PassCreateTest extends PageObjectTest{

private PassView passView;
	
	@Before
	public void setUp() {
		
		passView = new PassView(getDriver());
		
	}

	@Test
	public void goToPassCreate() {
		
		String expected = "http://localhost:8080/#/pass/create";
		String actual = passView.passCreate().getUrl();
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void createPass() {
		
		String expected = "Pass successfully created.";
		String actual = passView.passCreate().createPass();
		
		assertEquals(expected, actual);
		
	}

}
