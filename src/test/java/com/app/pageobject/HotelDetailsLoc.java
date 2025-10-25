package com.app.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelDetailsLoc extends LoginPagelocators  {
	
	public HotelDetailsLoc() {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//select[@id='location']")
	private  WebElement location;
	
	@FindBy(xpath="//select[@name='hotels']")
	private WebElement hotels;
	
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement roomType;
	
	@FindBy(xpath="//select[@id='room_nos']")
	private WebElement roomNo;
	
	@FindBy(xpath="(//input[@class='date_pick'])[1]")
	private WebElement checkIn;
	
	@FindBy(xpath="(//input[@class='date_pick'])[2]")
	private WebElement checkOut;
	
	@FindBy(xpath="//select[@id='adult_room']")
	private WebElement adult;
	
	@FindBy(id="child_room")
	private WebElement children;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement search;
	
	public WebElement getLoc() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getRoomNo() {
		return roomNo;
	}
	public WebElement getCheckIn() {
		return checkIn;
	}
	public WebElement getCheckOut() {
		return checkOut;
	}
	public WebElement getAdult() {
		return adult;
	}
	public WebElement getChildren() {
		return children;
	}
	public WebElement getSearch() {
		return search;
	}

}
