package com.app.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HotelConfLoc extends HotelSelectLoc{

	public static WebElement getFirstName() {
		return driver.findElement(By.xpath("//input[@name='first_name']"));
	}
	public static WebElement getLastName() {
		return driver.findElement(By.xpath("//input[@name='last_name']"));
	}
	public static WebElement getAddress() {
		return driver.findElement(By.name("address"));
	}
	public static WebElement getccNum() {
		return driver.findElement(By.name("cc_num"));
	}
	public static WebElement getccType() {
		return driver.findElement(By.name("cc_type"));
	}
	public static WebElement getExpMonth() {
		return driver.findElement(By.name("cc_exp_month"));
	}
	public static WebElement getExpYear() {
		return driver.findElement(By.name("cc_exp_year"));
	}
	public static WebElement getCvv() {
		return driver.findElement(By.name("cc_cvv"));
	}
	public static WebElement getBook() {
		return driver.findElement(By.xpath("(//input[@type='button'])[1]"));
	}
	
	public  static void waitElement() {
		WebDriverWait wait=new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='order_no']")));
	}
	
	public static WebElement getOrderNo() {
		return driver.findElement(By.xpath("//input[@name='order_no']"));
	}
	
	public static WebElement getLogOut() {
		return driver.findElement(By.id("logout"));
	}
	
}
