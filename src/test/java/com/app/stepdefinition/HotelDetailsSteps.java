package com.app.stepdefinition;

import com.app.pageexe.HotelDetailsExe;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HotelDetailsSteps extends HotelDetailsExe{

@When("Select the location {string}")
public void select_the_location(String location) {
    loc(location);
}

@When("Select the hotels {string}")
public void select_the_hotels(String hotel) {
    hotel(hotel);
}

@When("Select the roomtype {string}")
public void select_the_roomtype(String roomtype) {
	
    roomType(roomtype);
}

@When("Select the roomno {string}")
public void select_the_roomno(String roomno) {
    roomNo(roomno);
}

@When("Enter the Check In Date {string}")
public void enter_the_check_in_date(String checkindate) {
    checkIn(checkindate);
}

@When("Enter the Check Out Date {string}")
public void enter_the_check_out_date(String checkoutdate) {
    checkOut(checkoutdate);
}

@When("Select the adults {string}")
public void select_the_adults(String adult) {
   adult(adult);
}

@When("Select the children {string}")
public void select_the_children(String children) {
    children(children);
}



@When("Click the Search button")
public void click_the_search_button() {
    search();
}




}
