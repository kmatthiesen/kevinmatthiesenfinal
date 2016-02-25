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

//	@Test
	public void goToUpdatePass() {
		
		String expected = "http://localhost:8080/#/pass/update/9";
		String actual = passView.passUpdate().getUrl();
		
		assertEquals(expected, actual);
		
	}
	
//	@Test
	public void updatePass() {
		
		String expected = "Pass successfully updated.";
		String actual = passView.passUpdate().updatePass();
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void deletePass() {
		
		String expected = "http://localhost:8080/#/pass/view";
		String actual = passView.passUpdate().deletePass(passView).getUrl();
		
		assertEquals(expected, actual);
		
	}


}
