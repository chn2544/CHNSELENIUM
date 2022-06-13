package LocatorStrategy_ID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementMethods {

static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		By email=By.id("input-email");
		
		ElementUtil eu=new ElementUtil(driver);
		if(eu.doisDisplayed(email))
		{
		System.out.println("Element is present");
		eu.dosendKeys(email, "ccc@999.com");	
		}
		else
		{
			System.out.println("Element not found");
		}

		//get attribute of the specific element
		
		String attribute=driver.findElement(By.id("input-password")).getAttribute("class");
		System.out.println("Attibute value of class is :"+attribute);
		
		// get text of the textfeild
		driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Fresher");
		String attribute2=driver.findElement(By.xpath("//*[@id=\"search\"]/input")).getAttribute("value");
		System.out.println("Attibute value of class is :"+attribute2);
		
		//Using Utility
		By searchbox=By.xpath("//*[@id=\"search\"]/input");
		String classname=eu.getAttributeValue(searchbox, "class");
		System.out.println("Class Attribute value is :"+classname);
		
//		driver.findElement(By.xpath("//asfregtrhy]/put")).sendKeys("Fresher");
		//InvalidSelectorException    - Invalid Syntax for Xpath/CSS Selector

//		driver.findElement(By.id("input-pas")).sendKeys("SetText");
		//NoSuchElementException   - selenium exception
		//ElementNotFound           - not selenium exception
		
	}

}
