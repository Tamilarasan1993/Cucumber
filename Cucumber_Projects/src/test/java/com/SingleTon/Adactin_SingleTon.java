package com.SingleTon;

import org.openqa.selenium.WebDriver;

import com.PageObjectManager.Adactin_POManager;

import Utility_Files.Base_Class;

public class Adactin_SingleTon extends Base_Class{

	public static WebDriver driver = Base_Class.Browser("Chrome");
	
	public static Adactin_POManager manager = new Adactin_POManager(driver);
	public static void main(String[] args) throws Throwable {
		GetUrl(AdactinData_Manager.instanceForTDM().instanceForTDR().getUrl());
		String username = AdactinData_Manager.instanceForTDM().instanceForTDR().getUsername();
		Sendkeys(manager.getHome().getEmail(),username);
		String password = AdactinData_Manager.instanceForTDM().instanceForTDR().getPassword();
		Sendkeys(manager.getHome().getPassword(),password);
		Click(manager.getHome().getLogin());
		SelectValue(manager.getPage2().getLocation(),AdactinData_Manager.instanceForTDM().instanceForTDR().getLocation());
		SelectValue(manager.getPage2().getHotels(), AdactinData_Manager.instanceForTDM().instanceForTDR().getHotel());
		SelectValue(manager.getPage2().getRoomtype(), AdactinData_Manager.instanceForTDM().instanceForTDR().getRoomType());
		SelectValue(manager.getPage2().getRooms(), "2");
		Clear(manager.getPage2().getCheckin());
		Sendkeys(manager.getPage2().getCheckin(), "09/12/2022");
		Clear(manager.getPage2().getCheckout());
		Sendkeys(manager.getPage2().getCheckout(), "10/12/2022");
		SelectIndex(manager.getPage2().getAdults(), 4);
		SelectValue(manager.getPage2().getChilds(), "1");
		Click(manager.getPage2().getSearch());
		Click(manager.getRadio().getRadio_btn());
		Click(manager.getRadio().getProceed());
		Sendkeys(manager.getBook().getFirstname(), "Tom");
		Sendkeys(manager.getBook().getLastname(), "Sts");
		Sendkeys(manager.getBook().getAddress(), "INDIA,CHENNAI");
		Sendkeys(manager.getBook().getCard_no(), "9988776655443322");
		SelectValue(manager.getBook().getCard_type(), "AMEX");
		SelectValue(manager.getBook().getExp_mon(), "12");
		SelectValue(manager.getBook().getExp_year(), "2022");
		Sendkeys(manager.getBook().getCvv_no(), "373");
		Click(manager.getBook().getBookNow());
		Click(manager.getBook().getItinerary());
		Click(manager.getBook().getSearchHotel());
	
	}
}
