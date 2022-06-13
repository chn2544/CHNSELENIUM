package myTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginNegativeTest extends BaseTest{

	@DataProvider
	public Object[][] getLoginData()
	{
		return new Object[][] {
			{"abc@gmail.com","Wrong1 PWD"},
			{"xyz@gmail.com"," "},
			{"pqr@gmail.com","Wrong3 PWD"},
			{"test@gmail.com","Wrong4 PWD"},
			{"     ","Wrong4 PWD"},
			{"    ","       "}
		};
	}
	
	@Test (dataProvider = "getLoginData")
	public void loginTest(String user,String pass)
	{
		
		Assert.assertTrue(doLogin(user, pass));
	}
	
	public boolean doLogin(String uname, String pwd)
	{
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(uname);
		driver.findElement(By.id("input-password")).sendKeys(pwd);
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//Get error message for wrong username and password
		String errMsg=driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();
		if(errMsg.contains("No match"))
		{
			return true;
		}
		return false;
				
	}
}
