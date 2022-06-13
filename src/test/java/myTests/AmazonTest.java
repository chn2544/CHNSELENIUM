package myTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest{

	@Test (priority = 1, description = "---Checking Title of Page for Amazon---")
	public void checkTitleTest()
	{
		String title=driver.getTitle();
		System.out.println("Title of Page is : - "+title);
		Assert.assertEquals(title, "Amazon.com. Spend less. Smile more1.","---- Amazon Page Title Didnt Matched---");
	}
	
	@Test (priority = 2, description = "---Checking URL of Page for Amazon---")
	public void checkURLTest()
	{
		String url=driver.getCurrentUrl();
		System.out.println("URL of Page is : - "+url);
		Assert.assertTrue(url.contains("amazon"),"---- Page URL Didnt Matched with Amazon---");
	}
	
	@Test (priority = 3, description = "---Checking Amazon Search Box is Displayed or Not---")
	public void searchExistsTest()
	{
		boolean flag=driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	
}
