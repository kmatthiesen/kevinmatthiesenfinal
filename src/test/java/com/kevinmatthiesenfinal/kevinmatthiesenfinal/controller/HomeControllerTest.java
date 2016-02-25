package com.kevinmatthiesenfinal.kevinmatthiesenfinal.controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class HomeControllerTest {
	
	private HomeController homeController;

	@Before
	public void setup(){
		
		homeController = new HomeController();
		
	}
	
	@Test
	public void indexTest() {
		
		String expected = "/index.html";
		String actual = homeController.index();
		
		assertEquals(expected, actual);
		
	}
	
}
