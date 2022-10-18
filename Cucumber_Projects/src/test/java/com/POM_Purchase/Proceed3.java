package com.POM_Purchase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed3 {
public static WebDriver driver;
 
 public  Proceed3(WebDriver driver) {
	this.driver= driver;
	PageFactory.initElements(driver,this);
}
 
 @FindBy(xpath="//input[@name='cgv']")
 private WebElement checkbox;
 
 @FindBy(xpath="//button[@name='processCarrier']")
 private WebElement proceed;

 public WebElement getCheckbox() {
	 return checkbox;
 }
 
 public WebElement getProceed() {
	 return proceed;
 }
 

}

	

