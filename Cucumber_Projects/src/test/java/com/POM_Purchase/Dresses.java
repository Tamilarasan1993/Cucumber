package com.POM_Purchase;

import java.awt.event.WindowEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresses {
	public WebDriver driver;
	
	public Dresses(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@title='Printed Dress']")
	private WebElement printedDress;
	
	@FindBy(xpath="//a[@class='quick-view']")
	private WebElement quickview;
	
	@FindBy(xpath="//iframe[@class='fancybox-iframe']")
	private WebElement iframe;
	
	@FindBy(xpath="//input[@name='qty']")
	private WebElement qty;
	
	@FindBy(xpath="//select[@id='group_1']")
	private WebElement size;
	
	@FindBy(xpath="//a[@name='Orange']")
	private WebElement orange;
	
	@FindBy(xpath="//a[@title='Pink']")
	private WebElement pink;
	
	@FindBy(xpath="//button[@name='Submit']")
	private WebElement addtoCart;
	
	@FindBy(xpath="//span[normalize-space()='Proceed to checkout']")
	private WebElement proceed;
	////a[@title='Proceed to checkout']
	
	
@FindBy(xpath="//img[@alt='Printed Chiffon Dress']")
private WebElement printedSummer;

@FindBy(xpath="(//a[@class='quick-view'])[3]")
private WebElement printedQuick;

@FindBy(xpath="//a[@name='Green']")
private WebElement green;

public WebElement getGreen() {
	return green;
}

public WebElement getPrintedQuick() {
	return printedQuick;
}
	public WebElement getPrintedSummer() {
		return printedSummer;
	}

	public WebElement getProceed() {
		return proceed;
	}
	
	public WebElement getPink() {
		return pink;
	}
	public WebElement getIframe() {
		return iframe;
	}
	public WebElement getQty() {
		return qty;
	}
	public WebElement getSize() {
		return size;
	}
	public WebElement getOrange() {
		return orange;
	}
	public WebElement getAddtoCart() {
		return addtoCart;
	}
	public WebElement getPrintedDress() {
		return printedDress;
	}
	public WebElement getQuickview() {
		return quickview;
	}
	





}