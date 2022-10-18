package com.POM_Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	public static WebDriver driver;
	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//page1
	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
	private WebElement close;
	@FindBy(xpath = "//img[@alt='Electronics']")
	private WebElement electronics;
	@FindBy(xpath = "//a[.='Laptop Accessories']")
	private WebElement lapacc;
	public WebElement getLapacc() {
		return lapacc;
	}
	public WebElement getElectronics() {
		return electronics;
		}
	public WebElement getClose() {
		return close;
	}

	
	//page2
	@FindBy(xpath = "//img[contains(@alt,'TP-Link')]")
	private WebElement wifi;
	@FindBy(xpath = "//img[@alt='TP-Link TL-WN725N Wi-Fi Receiver 150 Mbps Wireless Nano USB Adapter']")
	private WebElement adaptor;
	public WebElement getAdaptor() {
		return adaptor;
	}
	public WebElement getWifi() {
		return wifi;
	}

	//page3
	@FindBy(xpath = "//button[.='ADD TO CART']")
	private WebElement addto;
	public WebElement getAddto() {
		return addto;
	}
	@FindBy(xpath = "//div[.='Remove']")
	private WebElement remove;
	public WebElement getRemove() {
		return remove;
	}
	@FindBy(xpath="//div[.='Remove']//preceding::div[.='Remove']")
	private WebElement confirmremove;
	public WebElement getConfirmremove() {
		return confirmremove;
	}
	



}