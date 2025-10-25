package com.app.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.app.base.Base;
import com.app.base.BaseClass;

public class LoginPagelocators extends BaseClass {
	
	/*public LoginPagelocators() {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}*/
	
	public static void getLink(String url) {
		driver.get(url);
	}
	
	public static WebElement getUserName() {
		return driver.findElement(By.id("username"));
	}
	
	public static WebElement getPassWord() {
		return driver.findElement(By.name("password"));
	}
	
	public static WebElement getClick() {
		return driver.findElement((By.xpath("//input[@type='Submit']")));
	}

}
