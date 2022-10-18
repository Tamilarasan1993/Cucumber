package com.POM_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {
	public WebDriver driver;

	public Search(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//select[@name='location']")
	private WebElement location;
	
	@FindBy(xpath="//select[@name='hotels']")
	private WebElement hotels;
	
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement roomtype;

	@FindBy(xpath="//select[@id='room_nos']")
	private WebElement rooms; 

	@FindBy(xpath="//input[@name='datepick_in']")
	private WebElement checkin;
	
	@FindBy(xpath="//input[@name='datepick_out']")
	private WebElement checkout;
	
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement adults;
	
	@FindBy(xpath="//select[@id='child_room']")
	private WebElement childs;
	
	@FindBy(xpath="//td//child::input[@value='Search']")
	private WebElement search;


	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRooms() {
		return rooms;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getChilds() {
		return childs;
	}

	public WebElement getSearch() {
		return search;
	}
	
	
	
	
	
	
}
