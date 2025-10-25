package com.app.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelSelectLoc extends HotelDetailsLoc{

	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement radioButton;

	@FindBy(id="continue")
	private WebElement continueButton;
	
	public WebElement getRadioButton() {
		return radioButton;
	}
	
	public WebElement getContinueButton() {
		return continueButton;
	}
	
}
