package com.PageObjectManager;

import org.openqa.selenium.WebDriver;

import com.POM_Purchase.Confirm;
import com.POM_Purchase.Dresses;
import com.POM_Purchase.My_account;
import com.POM_Purchase.Payment;
import com.POM_Purchase.Proceed1;
import com.POM_Purchase.Proceed2;
import com.POM_Purchase.Proceed3;
import com.POM_Purchase.Signin_btn;

public class Purchase_POManager {
	public WebDriver driver;
	public Purchase_POManager(WebDriver driver) {
		this.driver = driver;
	}
	private Signin_btn sign;
	private My_account my;
	private Dresses quick;
	private Proceed1 pro1;
	private Proceed2 pro2;
	private Proceed3 pro3;
	private Payment mode;
	private Confirm order;
	
	public Signin_btn getSign() {
		if (sign==null) {
			sign = new Signin_btn(driver);
		}return sign;
	}
	public My_account getMy() {
		if (my==null) {
			my= new My_account(driver);
		}
		return my;
	}
	public Dresses getQuick() {
		if (quick==null) {
			quick= new Dresses(driver);
		}
		return quick;
	}
	public Proceed1 getPro1() {
		if (pro1==null) {
			pro1= new Proceed1(driver);
		}
		return pro1;
	}
	public Proceed2 getPro2() {
		if (pro2==null) {
			pro2=new Proceed2(driver);
		}
		return pro2;
	}
	public Proceed3 getPro3() {
		if (pro3==null) {
			pro3= new Proceed3(driver);
		}
		return pro3;
	}
	public Payment getMode() {
		if (mode==null) {
			mode=new Payment(driver);
		}
		return mode;
	}
	public Confirm getOrder() {
		if (order==null) {
			order=new Confirm(driver);
		}
		return order;
	}
	
	
	
	
	
	
	

}
