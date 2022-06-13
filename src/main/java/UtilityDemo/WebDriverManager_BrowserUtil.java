package UtilityDemo;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManager_BrowserUtil {

	private WebDriver driver;						  // declared here as it can be used in all methods and its private so that nobody can access it directly. 	
	public WebDriver init_driver (String browser)     // return type is webdriver because we are returing driver
	{
		System.out.println("Browser name is : "+browser);
	
		if(browser.trim().equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browser.trim().equalsIgnoreCase("firefox"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("Please pass correct browser ");
		}
		return driver;
	}
	
	public void launchUrl(String url)
	{
		if(url==null)
		{
			System.out.println("Null Url Passed");
			return; 
		}
		else if(url.indexOf("http")==-1||url.indexOf("https")==-1)
		{
			System.out.println("Http/Https is missing in URL");
			try {
				throw new Exception("HTTP protocol is missing");	
				}
			catch (Exception e){
				System.out.println("HTTP is missing - printing from catch block");
			}
			
		}
		driver.get(url);
	}

//   We can override launchURL method with passing URL class object instead of String class object
//	which can be called via navigate.to method
	
	  public void launchUrl(URL url)
	  {
		  driver.navigate().to(url);    // Reference from NavigationPackage - NavigationCOmmands
	  }
	
	public String getTitle()
	{
		String title=driver.getTitle();
		return title;
	}
	
	public String getCurrentUrl()
	{
		String curr=driver.getCurrentUrl();
		return curr;
	}
	
	public void quit()
	{
		driver.quit();
	}
	
	public void close()
	{
		driver.close();
	}
}
