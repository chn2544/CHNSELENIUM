package WaitConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import LocatorStrategy_ID.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitlyWaitConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Explicity wait : for webelement as well as non webelements
		// not a global wait

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	    driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
	    
	    By fullname=By.xpath("//input[@id='Form_submitForm_Name']");
	    By phone=By.xpath("//input[@id='Form_submitForm_Contact']");
		By email=By.xpath("//input[@id='Form_submitForm_Email']");
		
		ElementUtil eu=new ElementUtil(driver);
		eu.WaitforElemPresence(fullname, 10).sendKeys("Chinmay G");
		eu.WaitforElemVisible(phone, 5).sendKeys("9672256970");
		//here wait is not being applied for email , wait has been applied to specifix web element
		// we can say its custom wait
		eu.getElement(email).sendKeys("crgogte99@gmail.com");
		
		
	
		
		
	}

	
}
