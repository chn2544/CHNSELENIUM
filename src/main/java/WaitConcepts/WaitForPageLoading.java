package WaitConcepts;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import LocatorStrategy_ID.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForPageLoading {

	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

//		Alternative for custom wait for page load	(below method)	
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		driver.get("https://www.amazon.com/");
		ElementUtil eu=new ElementUtil(driver);
		eu.waitForPageLoad(10);
		System.out.println("Back to Main");

	}
	
	

}
