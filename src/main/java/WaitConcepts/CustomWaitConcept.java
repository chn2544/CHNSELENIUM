package WaitConcepts;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import LocatorStrategy_ID.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomWaitConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		

		// use static wait to achieve dynamic wait 
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
//		By customerlink=By.linkText("Amazon Science");
		
		By customerlink=By.linkText("Amazon Science15");
		ElementUtil eu= new ElementUtil(driver);
		eu.customWaitretryingElement(driver,customerlink, 10, 1000);
	
	}
	
}
