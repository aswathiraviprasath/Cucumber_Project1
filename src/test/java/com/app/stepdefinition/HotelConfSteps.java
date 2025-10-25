package com.app.stepdefinition;

import com.app.pageexe.HotelConfExe;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HotelConfSteps extends HotelConfExe {

	@When("Enter the firstname {string}")
	public void enter_the_firstname(String string) {
	    firstName();
	}

	@When("Enter the lastname {string}")
	public void enter_the_lastname(String string) {
	   lastName();
	}

	@When("Enter the Billing address {string}")
	public void enter_the_billing_address(String string) {
	    address();
	}

	@When("Enter the Credit card number {string}")
	public void enter_the_credit_card_number(String string) {
	    ccNum();
	}

	@When("Select the Credit card type {string}")
	public void select_the_credit_card_type(String string) {
	    ccType();
	}

	@When("Select the Expiry month {string}")
	public void select_the_expiry_month(String string) {
	    expMonth();
	}

	@When("Select the Expiry year {string}")
	public void select_the_expiry_year(String string) {
	   expYear();
	}

	@When("Enter the CVV number {string}")
	public void enter_the_cvv_number(String string) {
	    cvv();
	}

	@When("Click the BookNow button")
	public void click_the_book_now_button() {
	   bookHotel();
	}
	
	@When("Wait on the page for sometime")
	public void wait_on_the_page_for_sometime() {
	   waitExplicit();
	}

	@Then("Print the OrderId")
	public void print_the_order_id() {
	    orderNo();
	}

	
}
