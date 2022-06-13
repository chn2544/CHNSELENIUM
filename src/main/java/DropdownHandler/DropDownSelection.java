package DropdownHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import LocatorStrategy_ID.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownSelection {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		//drop down - html tag (select) - select class in selenium
		
		By country = By.id("Form_submitForm_Country");
		By state = By.id("Form_submitForm_State");
//		Select sel=new Select(driver.findElement(country));
////		sel.selectByIndex(4);   // Index starts from 0   // good for static values eg. month of year
//		sel.selectByVisibleText("India");  // Better Option
////		sel.selectByValue("Barbados");
//	
//		Thread.sleep(8000);
//		Select statedrop=new Select(driver.findElement(state));
//		statedrop.selectByVisibleText("Maharashtra");
//		
//		
		ElementUtil eu=new ElementUtil(driver);
//		eu.selectDDByIndex(country, 5);
		eu.selectDDByVisibleText(country, "India");
//		eu.selectDDByValue(country, "Australia");
	}		

	
	


}

