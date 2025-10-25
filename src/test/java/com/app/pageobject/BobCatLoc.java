package com.app.pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.app.base.BaseClass;

public class BobCatLoc extends BaseClass{
	

	public static void getLink(String url) {
		driver.get(url);
	}
	
	public static WebElement getCookies() {
		return driver.findElement(By.xpath("//button[@class='onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon']"));
	}
	public static WebElement getEquip() {
		return driver.findElement(By.xpath("(//button[@class='d-flex align-items-center p-3 h-100'])[1]"));
	}
	
	public static WebElement getLoad() {
		return driver.findElement(By.xpath("(//div[@class='h6 text-uppercase border-bottom pl-3 pb-2 mb-0'])[1]"));
	}
	
	public static List<WebElement> getLoads() {
		return driver.findElements(By.xpath("(//ul[@class='list-unstyled'])[1]//descendant::span"));
	}
	
	public static WebElement getExc() {
		return driver.findElement(By.xpath("(//div[@class='h6 text-uppercase border-bottom pl-3 pb-2 mb-0'])[2]"));
	}
	public static List<WebElement> getExcav() {
		return driver.findElements(By.xpath("(//ul[@class='list-unstyled'])[2]//descendant::span"));
	}
	
	public static WebElement getFork() {
		return driver.findElement(By.xpath("(//div[@class='h6 text-uppercase border-bottom pl-3 pb-2 mb-0'])[3]"));
	}
	public static List<WebElement> getForks() {
		return driver.findElements(By.xpath("(//ul[@class='list-unstyled'])[3]//descendant::span"));
	}
	
	public static WebElement getWare() {
		return driver.findElement(By.xpath("(//div[@class='h6 text-uppercase border-bottom pl-3 pb-2 mb-0'])[4]"));
	}
	public static List<WebElement> getWareHouse() {
		return driver.findElements(By.xpath("(//ul[@class='list-unstyled'])[4]//descendant::span"));
	}
	
}
