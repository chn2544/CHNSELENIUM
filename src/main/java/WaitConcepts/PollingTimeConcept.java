package WaitConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import LocatorStrategy_ID.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PollingTimeConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
//		By contactsales=By.linkText("CONTACT11 SALES");
		By contactsales=By.linkText("CONTACT SALES");
		ElementUtil eu=new ElementUtil(driver);
		eu.clickElementWhenReadyWithPolling(contactsales, 10, 1500);
		
		

	}
	
	

}
