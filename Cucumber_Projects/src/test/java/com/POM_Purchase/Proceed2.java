package com.POM_Purchase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed2 {
	public WebDriver driver;
	
	public Proceed2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//button[@name='processAddress']")
	private WebElement proceed;
	
	public WebElement getProceed() {
		return proceed;
	}
	

}
