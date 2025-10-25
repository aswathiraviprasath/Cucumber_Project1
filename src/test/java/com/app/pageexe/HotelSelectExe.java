package com.app.pageexe;

import com.app.base.BaseClass;
import com.app.pageobject.HotelSelectLoc;


public class HotelSelectExe extends HotelSelectLoc{
	
	public static void radioButton() {
		BaseClass.click(new HotelSelectLoc().getRadioButton());
	}

	public static void continueButton() {
		BaseClass.click(new HotelSelectLoc().getContinueButton());
	}

}
