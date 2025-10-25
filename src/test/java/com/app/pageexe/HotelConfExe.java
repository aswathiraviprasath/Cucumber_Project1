package com.app.pageexe;

import com.app.base.BaseClass;
import com.app.pageobject.HotelConfLoc;


public class HotelConfExe extends HotelConfLoc{

	public static void firstName() {
		BaseClass.sendKey(HotelConfLoc.getFirstName(), excel_Reusable(4, 0));
	}
	public static void lastName() {
		BaseClass.sendKey(HotelConfLoc.getLastName(), excel_Reusable(4, 1));
	}
	public static void address() {
		BaseClass.sendKey(HotelConfLoc.getAddress(), excel_Reusable(4, 2));
	}
	public static void ccNum() {
		BaseClass.sendKey(HotelConfLoc.getccNum(), excel_Reusable(4, 3));
	}
	public static void ccType() {
		BaseClass.selectByValue(HotelConfLoc.getccType(), excel_Reusable(4, 4));
	}
	public static void expMonth() {
		BaseClass.selectByValue(HotelConfLoc.getExpMonth(), excel_Reusable(4, 5));
	}
	public static void expYear() {
		BaseClass.selectByText(HotelConfLoc.getExpYear(), excel_Reusable(4, 6));
	}
	public static void cvv() {
		BaseClass.sendKey(HotelConfLoc.getCvv(), excel_Reusable(4, 7));
	}
	public static void bookHotel() {
		BaseClass.click(HotelConfLoc.getBook());
	}
	
	public static void waitExplicit() {
		HotelConfLoc.waitElement();
	}
	
	public static void orderNo() {
		BaseClass.getAttr(HotelConfLoc.getOrderNo(), "value");
	}
	
	public static void logOut() {
		BaseClass.click(HotelConfLoc.getLogOut());
	}
}
