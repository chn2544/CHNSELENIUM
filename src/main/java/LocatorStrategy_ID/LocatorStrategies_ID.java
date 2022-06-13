package LocatorStrategy_ID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorStrategies_ID {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/contact-sales/");

		// create a webelement (By using locators) + perform some action

//-----------------------------------------------------------------------------------------------------		
//		//1st Approach
//		driver.findElement(By.id("Form_submitForm_FullName")).sendKeys("Chinmay Gogte");
//		driver.findElement(By.id("Form_submitForm_CompanyName")).sendKeys("Allsc");
//		driver.findElement(By.id("Form_submitForm_JobTitle")).sendKeys("Sr.QA");
//		driver.findElement(By.id("Form_submitForm_Email")).sendKeys("crgogte99@gmail.com");
//		driver.findElement(By.id("Form_submitForm_Comment")).sendKeys("Hey, I am a new user");

//-----------------------------------------------------------------------------------------------------
//		//2nd Approach
//		WebElement fname=driver.findElement(By.id("Form_submitForm_FullName"));
//		WebElement cname=driver.findElement(By.id("Form_submitForm_CompanyName"));
//		WebElement jtitle=driver.findElement(By.id("Form_submitForm_JobTitle"));
//		
//		fname.sendKeys("Chinmay G");
//		cname.sendKeys("LNT");
//		jtitle.sendKeys("QA Eng");

//-----------------------------------------------------------------------------------------------------
//		//3rd Approach  - By Locator Approach   // OR - Object Repository 
//		By fname=By.id("Form_submitForm_FullName");       // Return type of id is By , so we will store in By variable
//		By cname=By.id("Form_submitForm_CompanyName");
//		By jtitle=By.id("Form_submitForm_JobTitle");
//		
//		WebElement fname_ele=driver.findElement(fname);
//		WebElement cname_ele=driver.findElement(cname);
//		WebElement jtitle_ele=driver.findElement(jtitle);
//		
//		fname_ele.sendKeys("Chinmay G");
//		cname_ele.sendKeys("BMC");
//		jtitle_ele.sendKeys("Manager");

////------------------------------------------------------------------------------------------------------------
//		//4th Approach  By Locator with Generic Function  of WebElement    //Writing a function -> getElement outside main method
//		By fname=By.id("Form_submitForm_FullName");       
//		By cname=By.id("Form_submitForm_CompanyName");
//		By jtitle=By.id("Form_submitForm_JobTitle");
//		
//		getElement(fname).sendKeys("Chin");
//		getElement(cname).sendKeys("TCS");
//		getElement(jtitle).sendKeys("Dev Manager");
//			

//------------------------------------------------------------------------------------------------------------
//		//5th Approach  By Locator with Generic Function  of WebElement and Action     //Writing a function -> getElement and Action outside main method
//		By fname=By.id("Form_submitForm_FullName");       
//		By cname=By.id("Form_submitForm_CompanyName");
//		By jtitle=By.id("Form_submitForm_JobTitle");		
//		
//		dosendKeys(fname, "Chinmay G");
//		dosendKeys(cname, "Infy");
//		dosendKeys(jtitle,"Fresher");
//		

//-----------------------------------------------------------------------------------------------------------------------
//		//6th Approach    -- By Locator  Element Utility Class   having generic methods as created for above approaches
//		
//		By fname=By.id("Form_submitForm_FullName");       
//		By cname=By.id("Form_submitForm_CompanyName");
//		By jtitle=By.id("Form_submitForm_JobTitle");		
//			
//		ElementUtil eu=new ElementUtil(driver);  // we need to pass main class driver so that it can take actions
//		eu.dosendKeys(fname, "Dhanu G");
//		eu.dosendKeys(cname, "Tech M");
//		eu.dosendKeys(jtitle, "Automation Engineer");

//-----------------------------------------------------------------------------------------------------------------------
//	    //7th Approach    -- String Locator with Element Utility Class   having generic methods as created for above approaches
//		
//		String fname_id="Form_submitForm_FullName";
//		String cname_id="Form_submitForm_CompanyName";
//		String jtitle_id="Form_submitForm_JobTitle";
//			
//		ElementUtil eu=new ElementUtil(driver);  // we need to pass main class driver so that it can take actions
//		eu.dosendKeys(getBy("id", fname_id), "Rupesh");
//		eu.dosendKeys(getBy("id", cname_id), "Aries");
//		eu.dosendKeys(getBy("id", jtitle_id), "Software Developer");

//-----------------------------------------------------------------------------------------------------------------------
//		//8th Approach   -- Mixture of String and By Locator  With Element Utility Class
//			
//		By fname=By.id("Form_submitForm_FullName");
//		String cname_id="Form_submitForm_CompanyName";
//		
//		ElementUtil eu=new ElementUtil(driver); 
//		eu.dosendKeys(fname, "Dhanu G");               // with By Locator
//		eu.dosendKeys("id",cname_id, "IBM");          // With String Locator  
//			
//-----------------------------------------------------------------------------------------------------------------------			

	}

	public static WebElement getElement(By locator) // Written for 4th Approach // This will take param as locator as
													// per line no 46 and will return WebELement
	{
		return driver.findElement(locator);
	}

	public static void dosendKeys(By locator, String value) // Written for 5th Approach
	{
		getElement(locator).sendKeys(value);
	}

	public static By getBy(String locatortype, String locatorvalue) // witten for 7th approach - return type is by
																	// because we are returning locator which is of type
																	// By
	{
		By locator = null;
		switch (locatortype.toLowerCase()) {
		case "id":
			locator = By.id(locatorvalue);
			break;
		default:
			break;
		}
		return locator;

	}
}
