package com.PageObjectManager;

import org.openqa.selenium.WebDriver;

import com.POM_Flipkart.Login;

public class Flipkart_POManager {
	public WebDriver driver;
	

	public Flipkart_POManager(WebDriver driver) {
		this.driver= driver;
	}
	private Login login;

	public Login getLogin() {
		if (login==null) {
			login= new Login(driver);
		}
		return login;
	}
	

}
