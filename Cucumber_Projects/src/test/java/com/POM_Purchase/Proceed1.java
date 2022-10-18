package com.POM_Purchase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed1 {
	public WebDriver driver;
	
	public Proceed1(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@title='Proceed to checkout']//following::a[@title='Proceed to checkout']")
	private WebElement proceed;
	
	public WebElement getProceed() {
		return proceed;
	}
	
}
