package com.app.stepdefinition;

import com.app.pageexe.BobCatExe;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BobCatSteps extends BobCatExe{

	@Given("Load the chromebrowser")
	public void load_the_chromebrowser() {
		cdriver();
	}
	
	@Given("Load the newURL {string}")
	public void load_the_newURL(String url) {
		loadUrl(url);  
	}
	
	@Given("Maximize the chromewindow")
	public void maximize_the_chromewindow() {
	   max();
	}
	
	@Given("Close the Cookies window")
	public void close_the_cookies_window() {
	    clickCookies();
	}

	@When("Select the Equipment dropdown")
	public void select_the_equipment_dropdown() {
	    clickEquip();
	}

	@When("Select the Loaders option")
	public void select_the_loaders_option() {
	    textLoad();
	}

	@When("Show the available Loaders")
	public void show_the_available_loaders() {
	    textLoads();
	}

	@When("Select the Mini Excavators")
	public void select_the_mini_excavators() {
	    textExca();
	}

	@When("Show the available Mini Excavators")
	public void show_the_available_mini_excavators() {
	    textExcavators();
	}

	@When("Select the Forklifts")
	public void select_the_forklifts() {
	    textFork();
	}

	@When("Show the available Forklifts")
	public void show_the_available_forklifts() {
	    textForks();
	}

	@Then("Select the Warehouse Equipment")
	public void select_the_warehouse_equipment() {
	   textWare();
	}

	@Then("Show the available Warehouse Equipment")
	public void show_the_available_warehouse_equipment() {
	    textWares();
	}
	
	
}
