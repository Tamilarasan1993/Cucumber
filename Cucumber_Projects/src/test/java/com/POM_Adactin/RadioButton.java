package com.POM_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButton {

	public WebDriver driver;

	@FindBy(xpath="//table//following::input[@type='radio']")
	private WebElement radio_btn;

	@FindBy(xpath="//input//preceding::input[@name='continue']")
	private WebElement proceed;

	public RadioButton(WebDriver driver){
	this.driver= driver;
	PageFactory.initElements(driver, this);
	}
	public WebElement getRadio_btn() {
		return radio_btn;
	}
	public WebElement getProceed() {
		return proceed;
	}
}
	
