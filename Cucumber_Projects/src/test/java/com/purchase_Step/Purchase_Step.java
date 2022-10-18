package com.purchase_Step;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.PageObjectManager.Purchase_POManager;
import com.SingleTon.Purchase_Data_Manager;
import com.cucumber_runner.Purchase_Runner;

import Utility_Files.Base_Class;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class Purchase_Step extends Base_Class{
	

	

		public static WebDriver driver=Purchase_Runner.driver;
		public static Purchase_POManager manager = new Purchase_POManager(driver);

		@Before
		public void signIn() {
			Click(manager.getSign().getSignin_btn());
		}
		@After
		public void signOut() {
			Click(manager.getSign().getSignOut_btn());
			driver.navigate().to("http://automationpractice.com/index.php?");
		}
		@When("User enters the Username in username field")
		public void user_enters_the_username_in_username_field() throws IOException {
			Sendkeys(manager.getSign().getEmail(),Purchase_Data_Manager.pdata().datareader().username());
		}
		@When("user enters the Password in password field")
		public void user_enters_the_password_in_password_field() throws IOException {
			Sendkeys(manager.getSign().getPwd(), Purchase_Data_Manager.pdata().datareader().password());
		}
		@Then("User clicks on login button and it navigates to user account page")
		public void user_clicks_on_login_button_and_it_navigates_to_user_account_page() {
			Click(manager.getSign().getLogin_btn());
		}
		@When("User clicks on Casual Dresses in the Dresses and it navigates to CasualDresses page")
		public void user_clicks_on_casual_dresses_in_the_dresses_and_it_navigates_to_casual_dresses_page() {
			ACTIONS(manager.getMy().getDresses(), "MoveTO");
			ACTIONS(manager.getMy().getCasual(), "Click");
			ACTIONS(manager.getQuick().getPrintedDress(), "MoveTo");	
		}
		@When("User chooses the dress and clicks on Quikview")
		public void user_chooses_the_dress_and_clicks_on_quikview() {
			ACTIONS(manager.getQuick().getQuickview(), "Click");
			FRAMES(manager.getQuick().getIframe());
		}
		@When("user selects the Quantity ,size and color")
		public void user_selects_the_quantity_size_and_color() throws IOException {
		Clear(manager.getQuick().getQty());
		Sendkeys(manager.getQuick().getQty(),Purchase_Data_Manager.pdata().datareader().quantity());
		SelectValue(manager.getQuick().getSize(), Purchase_Data_Manager.pdata().datareader().size());
		Click(manager.getQuick().getOrange());
		}
		@When("User clicks on AddToCart button and it shows the pop up of selected items")
		public void user_clicks_on_add_to_cart_button_and_it_shows_the_pop_up_of_selected_items() throws InterruptedException {
			Click(manager.getQuick().getAddtoCart());	
			Thread.sleep(3000);
		}
		@When("User clicks on ProceedToCheckout button and it navigates to summary column in Order Page")
		public void user_clicks_on_proceed_to_checkout_button_and_it_navigates_to_summary_column_in_order_page() {
			Click(manager.getQuick().getProceed());
		}
		@When("User clicks on ProceedToCheckout button in summary column and it navigates to Address column")
		public void user_clicks_on_proceed_to_checkout_button_in_summary_column_and_it_navigates_to_address_column() {
			Click(manager.getPro1().getProceed());
		}
		@When("User clicks on ProceedToCheckout button in Address column and it navigates to Shipping column")
		public void user_clicks_on_proceed_to_checkout_button_in_address_column_and_it_navigates_to_shipping_column() {
			Click(manager.getPro2().getProceed());
		}
		@When("User clicks on CheckBox and clicks on ProceedToCheckout button in Shipping column and it navigates to payment column")
		public void user_clicks_on_check_box_and_clicks_on_proceed_to_checkout_button_in_shipping_column_and_it_navigates_to_payment_column() {
			Click(manager.getPro3().getCheckbox());
			Click(manager.getPro3().getProceed());
		}
		@When("User chooses payment type")
		public void user_chooses_payment_type() {
			Click(manager.getMode().getPay());
		}
		@Then("User clicks on Confirm my order button in MyStore page")
		public void user_clicks_on_confirm_my_order_button_in_my_store_page() {
			Click(manager.getOrder().getConfirmOrder());
		}
		
		
		//Second
		@When("User clicks on Summer Dresses in the Dresses and it navigates to Summer Dresses page")
		public void user_clicks_on_summer_dresses_in_the_dresses_and_it_navigates_to_summer_dresses_page() throws InterruptedException {
			ACTIONS(manager.getMy().getDresses(), "MoveTO");
			ACTIONS(manager.getMy().getSummerDress(), "Click");
			ACTIONS(manager.getQuick().getPrintedSummer(), "MoveTo");
		}
		@When("User chooses the Dress and clicks on Quikview button")
		public void user_chooses_the_dress_and_clicks_on_quikview_button() throws InterruptedException {
			ACTIONS(manager.getQuick().getPrintedQuick(), "Click");
			FRAMES(manager.getQuick().getIframe());
		}
		@When("user selects the quantity,size and colour")
		public void user_selects_the_quantity_size_and_colour() throws Throwable {
			Thread.sleep(4000);
			Clear(manager.getQuick().getQty());
			Sendkeys(manager.getQuick().getQty(),Purchase_Data_Manager.pdata().datareader().quantity());
			SelectValue(manager.getQuick().getSize(), Purchase_Data_Manager.pdata().datareader().size());
			Click(manager.getQuick().getGreen());
		}
		@When("User clicks on AddToCart button and It shows the pop up of selected item")
		public void user_clicks_on_add_to_cart_button_and_it_shows_the_pop_up_of_selected_item() throws InterruptedException {
			Click(manager.getQuick().getAddtoCart());	
			Thread.sleep(3000);
		}
		@When("User clicks ProceedToCheckout button and It navigates to summary column in Order Page")
		public void user_clicks_proceed_to_checkout_button_and_it_navigates_to_summary_column_in_order_page() {
			Click(manager.getQuick().getProceed());
		}
		@When("User clicks ProceedToCheckout button in summary column and It navigates to Address column")
		public void user_clicks_proceed_to_checkout_button_in_summary_column_and_it_navigates_to_address_column() {
			Click(manager.getPro1().getProceed());
		}
		@When("User clicks ProceedToCheckout button in Address column and It navigates to Shipping column")
		public void user_clicks_proceed_to_checkout_button_in_address_column_and_it_navigates_to_shipping_column() {
			Click(manager.getPro2().getProceed());
		}
		@When("User clicks CheckBox and clicks on ProceedToCheckout button in Shipping column and It navigates to payment column")
		public void user_clicks_check_box_and_clicks_on_proceed_to_checkout_button_in_shipping_column_and_it_navigates_to_payment_column() {
			Click(manager.getPro3().getCheckbox());
			Click(manager.getPro3().getProceed());
		}
		@When("User Selects Payment type")
		public void user_selects_payment_type() {
			Click(manager.getMode().getPay());		
		}
		@Then("User clicks Confirm My Order button in MyStore page")
		public void user_clicks_confirm_my_order_button_in_my_store_page() {
			Click(manager.getOrder().getConfirmOrder());
		}

		
	}
	


