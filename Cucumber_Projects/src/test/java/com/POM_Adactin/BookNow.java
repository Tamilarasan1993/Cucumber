package com.POM_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookNow {
	
	public WebDriver driver;
	
	public BookNow(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver,this);
		}

	@FindBy(xpath="//span//following::input[@name='first_name']")
	private WebElement firstname;

	@FindBy(xpath="//span//preceding::input[@name='last_name']")
	private WebElement lastname;


	@FindBy(xpath="//textarea[@name='address']")
	private WebElement address;


	@FindBy(xpath="//label//following::input[@id='cc_num']")
	private WebElement card_no;


	@FindBy(xpath="//label//preceding::select[@name='cc_type']")
	private WebElement card_type;

	@FindBy(xpath="//span//following::select[@name='cc_exp_month']")
	private WebElement exp_mon;

	@FindBy(xpath="//span//following::select[@name='cc_exp_year']")
	private WebElement exp_year;

	@FindBy(xpath="//table//descendant::input[@name='cc_cvv']")
	private WebElement cvv_no;

	@FindBy(xpath="//input[@id='book_now']")
	private WebElement bookNow;
	
	@FindBy(xpath="//input//following-sibling::input[@name='my_itinerary']")
	private WebElement itinerary;
	
	@FindBy(xpath="//input//following::input[@name='search_hotel']")
	private WebElement searchHotel;
	

	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCard_no() {
		return card_no;
	}
	public WebElement getCard_type() {
		return card_type;
	}
	public WebElement getExp_mon() {
		return exp_mon;
	}
	public WebElement getExp_year() {
		return exp_year;
	}
	public WebElement getCvv_no() {
		return cvv_no;
	}
	public WebElement getBookNow() {
		return bookNow;
	}
	public WebElement getItinerary() {
		return itinerary;
		}
	public WebElement getSearchHotel() {
		return searchHotel;
	}

}

