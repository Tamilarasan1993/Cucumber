package com.PageObjectManager;

import org.openqa.selenium.WebDriver;

import com.POM_Adactin.BookNow;
import com.POM_Adactin.Home_Page;
import com.POM_Adactin.RadioButton;
import com.POM_Adactin.Search;

public class Adactin_POManager {
	public WebDriver driver;
	private Home_Page home;
	private Search page2;
	private RadioButton radio;
	private BookNow book;
	
	public Adactin_POManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public Home_Page getHome() {
		if (home==null) {
		home= new Home_Page(driver);
		}
		return home;
	}
	public Search getPage2() {
		if (page2==null) {
		page2= new Search(driver);
		}
		return page2;
	}
	public RadioButton getRadio() {
		if (radio==null) {
		radio = new RadioButton(driver);
		}
		return radio;
	}
	public BookNow getBook() {
		if (book==null) {
		book = new BookNow(driver);
		}
		return book;
	}





}

