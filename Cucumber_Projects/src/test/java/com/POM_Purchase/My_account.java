package com.POM_Purchase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_account {
	public WebDriver driver;
	
	public My_account(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//li[@id='category-thumbnail']//following::a[@title='Dresses']")
	private WebElement dresses;
	
	@FindBy(xpath="//a[@title='Evening Dresses']//following::a[@title='Casual Dresses']")
	private WebElement casual;
	
	@FindBy(xpath="//a[@title='Evening Dresses']//following::a[@title='Evening Dresses']")
	private WebElement eveningDress;
	
	@FindBy(xpath="//a[.='Summer Dresses']//following::a[.='Summer Dresses']")
	private WebElement summerDress; 
	
	
	public WebElement getSummerDress() {
		return summerDress;
	}
	
	public WebElement getEveningDress() {
		return eveningDress;
	}
	
	public WebElement getDresses() {
		return dresses;
	}
	public WebElement getCasual() {
		return casual;
	}
	

}