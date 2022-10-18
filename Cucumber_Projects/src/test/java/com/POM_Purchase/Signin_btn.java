package com.POM_Purchase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin_btn {
	public static WebDriver driver;
	public Signin_btn(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div//preceding-sibling::a[normalize-space()='Sign out']")
	private WebElement signOut_btn;
	
	@FindBy(xpath="//div//child::a[normalize-space()='Sign in']")
	private WebElement signin_btn;
	
	@FindBy(xpath="//div//child::input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath="//div//descendant::input[@id='passwd']")
	private WebElement pwd;
	
	@FindBy(xpath="//i//ancestor::button[@id='SubmitLogin']")
	private WebElement login_btn;
	
	public WebElement getSignin_btn() {
		return signin_btn;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPwd() {
		return pwd;
	}
	public WebElement getLogin_btn() {
		return login_btn;
	}
	
	public WebElement getSignOut_btn() {
		return signOut_btn;
	}
	
}