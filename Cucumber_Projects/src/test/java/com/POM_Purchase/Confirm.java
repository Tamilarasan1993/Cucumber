package com.POM_Purchase;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirm {
	public static WebDriver driver;
	
	public Confirm(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class='button btn btn-default button-medium']")
	private WebElement confirmOrder;
	
	public WebElement getConfirmOrder() {
		return confirmOrder;
	}


}
