package DropdownHandler;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import LocatorStrategy_ID.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownAllOptions {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
//		By country = By.id("Form_submitForm_Country");
//		By state = By.id("Form_submitForm_State");
		
		//Get All options available in country dropdown
		//Another way of handling dropdown
		
//		Select country_all=new Select(driver.findElement(country));
//		List <WebElement> allopt=country_all.getOptions();    //getOptions returns list of all available options in dropdown
//		
//		for(WebElement e:allopt)
//		{
//			String text=e.getText();
//			System.out.println(text);
//			if(text.equals("India"))
//			{
//				e.click();
//				break;
//			}
//			
//		}
//
//		//With Utility method
//		ElementUtil eu=new ElementUtil(driver);
//		eu.selectdropdownwithgetOptions(country,"India");
//		Thread.sleep(6000);
//		eu.selectdropdownwithgetOptions(state,"Goa");
		
		
		By country = By.id("Form_submitForm_Country");
		By state = By.id("Form_submitForm_State");
		
		// not allowed to use select class 
		
//		List <WebElement> mylist=driver.findElements(By.xpath("//select[@id='Form_submitForm_Country']/option"));
//		
//			
//		for(WebElement e: mylist)
//		{
//			String text= e.getText();
//			System.out.println(text);
//			if(text.equals("Switzerland"))
//			{
//				e.click();
//				break;
//			}
//		}
		
//		
		
		//With Utility method
		ElementUtil eu=new ElementUtil(driver);
//		By countrynew = By.xpath("//select[@id='Form_submitForm_Country']/option");
//		eu.getDropdownValueswithoutSelect(countrynew,"Mexico");
		By countrylist = By.id("Form_submitForm_Country"); 
//		System.out.println("Total Dropdown count: "+eu.getdropdownValuesCount(countrylist));
	
		//Assignment to print via List<String>
		List<String> freshlist=eu.getDropdownListByString(countrylist);
		System.out.println("Printing Now: "+freshlist.toString());
		
		
	}	
	

			

	

}
