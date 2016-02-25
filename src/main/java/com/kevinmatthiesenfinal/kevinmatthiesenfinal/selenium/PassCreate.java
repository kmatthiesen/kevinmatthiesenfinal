package com.kevinmatthiesenfinal.kevinmatthiesenfinal.selenium;

import org.catalystitservices.PageObjectFramework.Framework.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PassCreate extends PageObject{
	
	private static final By customerSelect = By.xpath("//*[@id='customer-dropdown']");
	private static final By customerName = By.xpath("//*[@id='customer-dropdown']/option[2]");
	private static final By vehicleSelect = By.xpath("//*[@id='vehicle-dropdown']");
	private static final By vehicleName = By.xpath("//*[@id='vehicle-dropdown']/option[3]");
	private static final By createBtn = By.xpath("//*[@id='view-port']/ui-view/ui-view/div/div/form/fieldset/div[6]/button[1]");
	private static final By successMessage = By.xpath("//*[@id='view-port']/ui-view/ui-view/div/div/form/fieldset/div[6]/div[1]");
	
	public PassCreate(WebDriver driver) {
		
		super(driver);
	}
	
	public String createPass() {
		
		waitForElementToExist(customerSelect);
		click(customerSelect);
		click(customerName);
		click(vehicleSelect);
		click(vehicleName);
		click(createBtn);
		return getText(successMessage);
		
	}
	

}