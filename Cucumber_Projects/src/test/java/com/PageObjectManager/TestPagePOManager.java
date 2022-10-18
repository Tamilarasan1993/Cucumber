package com.PageObjectManager;

import org.openqa.selenium.WebDriver;

import com.POM_Practice.TestPage;

public class TestPagePOManager {
	public WebDriver driver;
	private TestPage test;
	
	public TestPagePOManager(WebDriver driver) {
		this.driver = driver;
	}

	public TestPage getTestPage() {
		if (test==null) {
			test = new TestPage(driver);
			}
		return test;
	}

}
