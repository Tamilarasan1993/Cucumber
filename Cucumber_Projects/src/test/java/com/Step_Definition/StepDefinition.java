package com.Step_Definition;

import org.openqa.selenium.WebDriver;

import com.PageObjectManager.Adactin_POManager;
import com.cucumber_runner.adactin_runner;

import Utility_Files.Base_Class;
import io.cucumber.java.en.*;

public class StepDefinition extends Base_Class{
	public static WebDriver driver = adactin_runner.driver;
	public static Adactin_POManager manager = new Adactin_POManager(driver);
	
	
	
	@Given("User Navigates To URL")
	public void user_navigates_to_url() {
		GetUrl("https://adactinhotelapp.com/");
	}
	@When("User enters the valid {string} in Username field")
	public void user_enters_the_valid_in_username_field(String username) {
		Sendkeys(manager.getHome().getEmail(), username);
	}
	@When("User enters the valid {string} in Password field")
	public void user_enters_the_valid_in_password_field(String Password) {
		Sendkeys(manager.getHome().getPassword(), Password);
	}
	@Then("User clicks on login button and it navigates to Adactin.com - Search Hotel")
	public void user_clicks_on_login_button_and_it_navigates_to_adactin_com_search_hotel() {
		Click(manager.getHome().getLogin());
	}


	@When("User selects the {string} in Location dropdown list")
	public void user_selects_the_in_location_dropdown_list(String location) {
		SelectValue(manager.getPage2().getLocation(), location);
	}

	@When("User selects the {string} in Hotel dropdown list")
	public void user_selects_the_in_hotel_dropdown_list(String hotel) {
	SelectValue(manager.getPage2().getHotels(), hotel);
	}

	@When("User selects the {string} in Roomtype dropdown list")
	public void user_selects_the_in_roomtype_dropdown_list(String roomtype) {
	SelectValue(manager.getPage2().getRoomtype(), roomtype);
	}

	@When("User selects the {string} in NoOfRooms dropdown list")
	public void user_selects_the_in_no_of_rooms_dropdown_list(String rooms) {
		SelectValue(manager.getPage2().getRooms(), rooms);
	}

	@When("User enters the date {string} in Check In Date field")
	public void user_enters_the_date_in_check_in_date_field(String checkin) {
	Clear(manager.getPage2().getCheckin());
		Sendkeys(manager.getPage2().getCheckin(), checkin);
	}

	@When("User enters the date {string} in Check Out Date field")
	public void user_enters_the_date_in_check_out_date_field(String checkout) {
	Clear(manager.getPage2().getCheckout());
	Sendkeys(manager.getPage2().getCheckout(), checkout);
	}
	
	@When("User selects the {string} in No of Adults dropdown list")
	public void user_selects_the_in_no_of_adults_dropdown_list(String adults) {
		SelectValue(manager.getPage2().getAdults(), adults);
	}

	@When("User selects the {string} in No of Children dropdown list")
	public void user_selects_the_in_no_of_children_dropdown_list(String children) {
		SelectValue(manager.getPage2().getChilds(), children);
	}

	@Then("User clicks on search button and it navigates to Adactin.com - Select Hotel")
	public void user_clicks_on_search_button_and_it_navigates_to_adactin_com_select_hotel() {
		Click(manager.getPage2().getSearch());
	}

	@When("User clicks on Radio button")
	public void user_clicks_on_radio_button() {
		Click(manager.getRadio().getRadio_btn());
	}


	@Then("User clicks on Continue button and it navigates to Adactin.com - Book A Hotel")
	public void user_clicks_on_continue_button_and_it_navigates_to_adactin_com_book_a_hotel() {
		Click(manager.getRadio().getProceed());
	}

	@When("User enters {string} in First Name field")
	public void user_enters_in_first_name_field(String firstname) {
	Sendkeys(manager.getBook().getFirstname(), firstname);
	}

	@When("User enters {string} in Last Name field")
	public void user_enters_in_last_name_field(String lastname) {
	Sendkeys(manager.getBook().getLastname(), lastname);
	}

	@When("User enters {string} in Address TextArea")
	public void user_enters_in_address_text_area(String address) {
		Sendkeys(manager.getBook().getAddress(), address);
	}

	@When("User enters the {string} in Card No field")
	public void user_enters_the_in_card_no_field(String cardno) {
		Sendkeys(manager.getBook().getCard_no(), cardno);
	}

	@When("User selects the {string} in Card type dropdown list")
	public void user_selects_the_in_card_type_dropdown_list(String cardtype) {
		SelectValue(manager.getBook().getCard_type(), cardtype);
	}
	

	@When("User selects the {string} in Expiry Month dropdown list")
	public void user_selects_the_in_expiry_month_dropdown_list(String expmonth) {
	SelectValue(manager.getBook().getExp_mon(), expmonth);
	}

	@When("User selects the {string} in Expiry Year dropdown list")
	public void user_selects_the_in_expiry_year_dropdown_list(String expyear) {
	SelectValue(manager.getBook().getExp_year(), expyear);
	}

	@When("User enters the {string} no in CVV no field")
	public void user_enters_the_no_in_cvv_no_field(String cvvno) {
	Sendkeys(manager.getBook().getCvv_no(), cvvno);
	}

	@Then("User enters the BookNow button and it navigates to Adactin.com - Hotel Booking Confirmation")
	public void user_enters_the_book_now_button_and_it_navigates_to_adactin_com_hotel_booking_confirmation() {
		Click(manager.getBook().getBookNow());
	}


	@When("User clicks on My Itinerary to check the Booking Confirmation")
	public void user_clicks_on_my_itinerary_to_check_the_booking_confirmation() {
		Click(manager.getBook().getItinerary());
	}

	

}
