package testNGSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTestwithTestNG {

	WebDriver driver;
	
	@BeforeTest (description = "---Set Up Amazon Test -- launch browser and enter url---")
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com");
	}
	
	@Test (priority = 3, description = "---Checking Title of Page---")
	public void checkTitleTest()
	{
		String title=driver.getTitle();
		System.out.println("Title of Page is : - "+title);
		Assert.assertEquals(title, "Amazon.com. Spend less. Smile more1.","---- Page Title Didnt Matched---");
	}
	
	@Test (priority = 2, description = "---Checking URL of Page---")
	public void checkURLTest()
	{
		String url=driver.getCurrentUrl();
		System.out.println("URL of Page is : - "+url);
		Assert.assertTrue(url.contains("amazon"),"---- Page URL Didnt Matched with Amazon---");
	}
	
	@Test (priority = 1, description = "---Checking Search Box is Displayed or Not---")
	public void searchExistsTest()
	{
		boolean flag=driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@AfterTest (description = "---Closing the Browser---")
	public void tearDown()
	{
		driver.quit();
	}
	
	
}
