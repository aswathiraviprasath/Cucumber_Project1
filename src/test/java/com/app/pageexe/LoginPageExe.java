package com.app.pageexe;

import com.app.base.Base;
import com.app.base.BaseClass;
import com.app.pageobject.LoginPagelocators;

public class LoginPageExe extends LoginPagelocators {
	
	public static void cdriver() {
		BaseClass.launchBrowser("chrome");
	}

	public static void max() {
		BaseClass.maxWin();
	}
	
	public static void loadUrl(String url) {
		BaseClass.link(url);
	}
	
	public static void username(String user) {
		BaseClass.sendKey(getUserName(), user);	
	}
	
	public static void password(String pass) {
		BaseClass.sendKey(getPassWord(), pass);	
	}
	
	public static void click() {
		BaseClass.click(getClick());
	}
		
	

}
