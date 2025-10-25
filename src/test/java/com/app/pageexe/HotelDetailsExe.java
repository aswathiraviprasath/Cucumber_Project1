package com.app.pageexe;

import org.openqa.selenium.support.PageFactory;

import com.app.base.BaseClass;
import com.app.pageobject.HotelDetailsLoc;

public class HotelDetailsExe extends HotelDetailsLoc {


	public static void loc(String location) {
		BaseClass.selectByValue( new HotelDetailsLoc().getLoc(), location);
  }
	
  public static void hotel(String hotel) {
	BaseClass.selectByValue( new HotelDetailsLoc().getHotels(), hotel);
}
  public static void roomType(String roomType) {
		BaseClass.selectByValue( new HotelDetailsLoc().getRoomType(), roomType);
	}
  public static void roomNo(String roomNo) {
		BaseClass.selectByText( new HotelDetailsLoc().getRoomNo(), roomNo);
	}
  public static void checkIn(String checkIn) {
		BaseClass.sendKey( new HotelDetailsLoc().getCheckIn(), checkIn);
	}
  public static void checkOut(String checkOut) {
		BaseClass.sendKey( new HotelDetailsLoc().getCheckOut(), checkOut);
	}
  public static void adult(String adult) {
		BaseClass.selectByText( new HotelDetailsLoc().getAdult(), adult);
	}
  public static void children(String children) {
		BaseClass.selectByText( new HotelDetailsLoc().getChildren(), children);
	}
 public static void search() {
	 BaseClass.click(new HotelDetailsLoc().getSearch());
 }
  

  
	
}
