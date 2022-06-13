package WaitConcepts;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import LocatorStrategy_ID.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Explicity wait : for webelement as well as non webelements
		// not a global wait

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
//		driver.get("https://www.freshworks.com/ae/");
//		By customerlink=By.linkText("Customers");
		
		driver.get("https://www.amazon.com/");
//		By customerlink=By.linkText("Sell apps on Amazon");
		By customerlink=By.linkText("Sell apps on Amazon11");

		ElementUtil eu=new ElementUtil(driver);
		eu.waitForElementPresenseWithFluentWait(customerlink, 10, 1000, "Elem not found, Session Timed Out");
			
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
//		wait.pollingEvery(Duration.ofMillis(1000))
//			.ignoring(NoSuchElementException.class)
//			.withMessage("Not Found the element");
			
		
		
	}
	
	

}
