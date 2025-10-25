package com.app.stepdefinition;

import com.app.pageexe.LoginPageExe;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends LoginPageExe {
	@Given("Load the browser")
	public void load_the_browser() {
		cdriver();
	    //System.out.println("Chrome");
	}
	@Given("Load the URL {string}")
	public void load_the_url(String url) {
		loadUrl(url);
	   //System.out.println(url);
	}
	@Given("Maximize the window")
	public void maximize_the_window() {
	   max();
	}
	@When("Enter the username {string}")
	public void enter_the_username(String user) {
	   username(user);
	}
	
	@When("Enter the password {string}")
	public void enter_the_password(String pass) {
		password(pass);
	   // System.out.println(pass);
	}
	@When("Click the login button")
	public void click_the_login_button() {
		click();
		//System.out.println("login Button");
	}
	@Then("Validate the home page")
	public void validate_the_home_page() {
	  // System.out.println("homepage");
	}

	

}
