package com.cucumber_runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import Utility_Files.Base_Class;


@RunWith(Cucumber.class)
@CucumberOptions(features = ".\\Feature",glue = "com.Step_Definition",
					plugin = {"html:Reports/Adactin.html"})
public class adactin_runner {
	public static WebDriver driver;
	
	@BeforeClass
	public static void set_Up() {
		driver = Base_Class.Browser("Chrome");
		System.out.println("Success");
	}
	@AfterClass
	public static void tear_Down() {
		driver.close();
	}

}
