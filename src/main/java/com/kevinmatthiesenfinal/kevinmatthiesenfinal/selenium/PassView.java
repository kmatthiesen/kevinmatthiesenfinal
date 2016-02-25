package com.kevinmatthiesenfinal.kevinmatthiesenfinal.selenium;

import org.catalystitservices.PageObjectFramework.Framework.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PassView extends PageObject{
	
	private static final By passLink = By.linkText("Parking Pass");
	private static final By passCreateLink = By.linkText("Create");
	private static final By passUpdateRow = By.xpath("//*[@id='view-port']/ui-view/ui-view/div/div/fieldset[1]/table/tbody/tr[2]");

	public PassView(WebDriver driver) {
		
		super(driver);
		_url = "localhost:8080/";
		goTo(_url);
		
	}
	
	public PassCreate passCreate() {
		
		click(passLink);
		click(passCreateLink);
		return new PassCreate(_driver);
		
	}
	
	public PassUpdate passUpdate() {
		
		click(passUpdateRow);
		return new PassUpdate(_driver);
		
	}

}
