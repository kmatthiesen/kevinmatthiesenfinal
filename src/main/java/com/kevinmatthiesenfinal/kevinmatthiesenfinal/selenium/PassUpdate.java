package com.kevinmatthiesenfinal.kevinmatthiesenfinal.selenium;

import org.catalystitservices.PageObjectFramework.Framework.PageObject;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PassUpdate extends PageObject{

	private static final By vehicleSelect = By.xpath("//*[@id='vehicle-dropdown']");
	private static final By vehicleName = By.xpath("//*[@id='vehicle-dropdown']/option[3]");
	private static final By updateBtn = By.xpath("//*[@id='view-port']/ui-view/ui-view/div/div/form/fieldset/div[3]/button[1]");
	private static final By successMessage = By.xpath("//*[@id='view-port']/ui-view/ui-view/div/div/form/fieldset/div[3]/div[1]");
	private static final By deleteBtn = By.xpath("//*[@id='view-port']/ui-view/ui-view/div/div/form/fieldset/div[3]/button[3]");
	private Alert alert;
	private String passId;
	
	public PassUpdate(WebDriver driver, String id) {
		
		super(driver);
		setPassId(id);
		
	}
	
	/**
	 * @return the passId
	 */
	public String getPassId() {
	
		return passId;
		
	}

	/**
	 * @param passId the passId to set
	 */
	public void setPassId(String passId) {
	
		this.passId = passId;
		
	}

	public String updatePass() {
		
		waitForElementToExist(vehicleSelect);
		click(vehicleSelect);
		click(vehicleName);
		click(updateBtn);
		return getText(successMessage);
		
	}
	
	public PassView deletePass(PassView passView) {
		
		click(deleteBtn);
		alert = _driver.switchTo().alert();
		alert.accept();
		alert = _driver.switchTo().alert();
		alert.accept();
		return passView;
		
	}
	

}