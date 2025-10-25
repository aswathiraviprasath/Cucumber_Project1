 package com.app.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void launchBrowser(String browser) {
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		
		default:
			System.out.println("The browser is not feasible");
		}
	}
	

	public static void maxWin() {
		driver.manage().window().maximize();
	}
	
	public static void link(String url) {
		driver.get(url);
	}
	
	public static String propReuse(String data) {
		String value=null;
		try {
			FileReader read=new FileReader(new File("src/test/resources/Resources/config.properties"));
			Properties prop = new Properties();
			prop.load(read);
			value = prop.getProperty(data);
			//System.out.println(value);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return value;
	}
	
	public static String excel_Reusable(int i,int j) {
		String value=null;
		try{
		File f=new File("C:\\Users\\aswat\\eclipse-workspace\\Sep_MavenPrac\\src\\test\\"
				+ "resources\\Resources\\Excel_SeleniumTestData_1.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheet=wb.getSheet("Sheet1");
		Row row=sheet.getRow(i);
		Cell cell=row.getCell(j);
		int cellType=cell.getCellType();
		
		if(cellType==1) {
			value=cell.getStringCellValue();
		}else if(cellType==0){
			if(DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue=cell.getDateCellValue();
				//format the system date
				SimpleDateFormat sm=new SimpleDateFormat("dd/mm/yy");
				value=sm.format(dateCellValue);
				//System.out.println(value);
			}else {
				double numericValue=cell.getNumericCellValue();
				long l=(long)numericValue;
				value=String.valueOf(l);
				//System.out.println(value);
			}
		}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return value;
		
	}
	
	public static void sendKey(WebElement element,String value) {
		element.sendKeys(value);
	}
	
	public static void click(WebElement element) {
		element.click();
	}
	
	public static void selectByText(WebElement element, String text) {
		Select s=new Select(element);
		s.selectByVisibleText(text);
		}
	public static void selectByValue(WebElement loc, String value) {
		Select s=new Select(loc);
		s.selectByValue(value);
		}
	public static void selectByIndex(WebElement element, int index) {
		Select s=new Select(element);
		s.selectByIndex(index);
		}
	
	public static void waits(int value) {
		WebDriverWait wait=new WebDriverWait(driver,value);
		
	}

	public static void getAttr(WebElement element,String data) {
		String value=null;
		value=element.getAttribute(data);
		System.out.println(value);
	}
	
	public static void getText(WebElement element) {
		String text=null;
		text=element.getText();
		System.out.println(text);
		}
	
	public static void getFindElements(List<WebElement> element) {
		List<WebElement> li=element;
		for(WebElement list:li) {
			System.out.println(list.getText());
		}
	}
}
