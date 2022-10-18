package com.cucumber_runner;

	import java.time.Duration;

	import org.junit.AfterClass;
	import org.junit.BeforeClass;
	import org.junit.runner.RunWith;
	import org.openqa.selenium.WebDriver;

	import Utility_Files.Base_Class;
	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(features=".//Feature//Purchase.feature",
									glue = "com.purchase_stepdef",
									monochrome = true,publish = true,
									plugin ="html:Reports/Purchase.html"
									
									)

	public class Purchase_Runner {
		public static WebDriver driver;
		
		@BeforeClass
		public static void set_Up() {
			driver = Base_Class.Browser("Chrome");
			driver.get("http://automationpractice.com/index.php");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		}
		
		@AfterClass
		public static void tear_Down() {
			//driver.close();
		}
	}


