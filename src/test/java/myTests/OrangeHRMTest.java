package myTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMTest extends BaseTest{


	
	
	
	@Test (priority = 1, description = "---Checking Title of Page for Orange HRM---")
	public void checkTitleTest()
	{ 
		String title=driver.getTitle();
		System.out.println("Title of Page is : - "+title);
		Assert.assertEquals(title, "Sign Up for a Free HR Software Trial | OrangeHRM","---- Orange HRM Page Title Didnt Matched---");
	}
	
	@Test (priority = 2, description = "---Checking URL of Page for Orange HRM---")
	public void checkURLTest()
	{
		String url=driver.getCurrentUrl();
		System.out.println("URL of Page is : - "+url);
		Assert.assertTrue(url.contains("orangehrm-30-day-trial"),"---- Page URL Didnt Matched with orangehrm-30-day-trial---");
	}
	

}
