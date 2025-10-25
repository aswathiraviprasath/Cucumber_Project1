package com.app.stepdefinition;

import com.app.pageexe.HotelSelectExe;

import io.cucumber.java.en.When;

public class HotelSelectSteps extends HotelSelectExe{
	
	@When("Click the Select radiobutton")
	public void click_the_select_radiobutton() {
	    radioButton();
	}

	@When("Click the Continue button")
	public void click_the_continue_button() {
	    continueButton();
	}


}
