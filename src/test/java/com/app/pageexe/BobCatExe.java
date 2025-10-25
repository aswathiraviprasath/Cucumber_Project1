package com.app.pageexe;

import com.app.base.BaseClass;
import com.app.pageobject.BobCatLoc;

public class BobCatExe extends BobCatLoc{

	public static void cdriver() {
		BaseClass.launchBrowser("chrome");
	}

	public static void max() {
		BaseClass.maxWin();
	}
	
	public static void loadUrl(String url) {
		BaseClass.link(url);
	}
	
	public static void clickCookies() {
		BaseClass.click(getCookies());
	}
	public static void clickEquip() {
		BaseClass.click(getEquip());
	}
	public void textLoad() {
		BaseClass.getText(getLoad());
	}
	public void textLoads() {
		BaseClass.getFindElements(getLoads());
	}
	public void textExca() {
		BaseClass.getText(getExc());
	}
	public void textExcavators() {
		BaseClass.getFindElements(getExcav());
	}
	public void textFork() {
		BaseClass.getText(getFork());
	}
	public void textForks() {
		BaseClass.getFindElements(getForks());
	}
	public void textWare() {
		BaseClass.getText(getWare());
	}
	public void textWares() {
		BaseClass.getFindElements(getWareHouse());
	}
	
}
