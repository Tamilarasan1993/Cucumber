package com.POM_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestPage {
	public static WebDriver driver;
	
	@FindBy(xpath="//a[@name='ItemAnchor1']//following-sibling::input[@type='text']")
	private WebElement firstname;
	
	@FindBy(xpath="//a[@name='ItemAnchor2']//following-sibling::input[@type='text']")
	private WebElement lastname;
	
	@FindBy(xpath="//a[@name='ItemAnchor3']//following-sibling::input[@type='text']")
	private WebElement phone;
	
	@FindBy(xpath="//iframe[@id='frame-one1434677811']")
	private WebElement frame;
	
	public TestPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getFrame() {
		return frame;
	}
	
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getPhone() {
		return phone;
	}
	
	
	
}
