package myTests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	WebDriver driver;
	
	@BeforeTest (description = "---Set Up Amazon Test -- launch browser and enter url---")
	@Parameters({"Browser","Url"})
	public void setup(String browsername,String appurl)
	{
		System.out.println("Running Test Cases on : "+browsername);
		if(browsername.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("Please pass valid browser : "+browsername+ " is Invalid Browser");
		}
		
		driver.get(appurl);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@AfterTest (description = "---Closing the Browser---")
	public void tearDown()
	{
		driver.quit();
	}
	
}
