package com.kevinmatthiesenfinal.kevinmatthiesenfinal.selenium;

import static org.junit.Assert.*;

import org.catalystitservices.PageObjectFramework.Framework.PageObjectTest;
import org.junit.Before;
import org.junit.Test;

public class PassViewTest extends PageObjectTest{
	
	private PassView passView;
	
	@Before
	public void setUp() {
		
		passView = new PassView(getDriver());
		
	}

	@Test
	public void amIOnTheRightPage() {
		
		String expected = "http://localhost:8080/#/pass/view";
		String actual = passView.getUrl();
		
		assertEquals(expected, actual);
		
	}

}
