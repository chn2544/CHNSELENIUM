package WaitConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import LocatorStrategy_ID.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitNonWebElem {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Explicity wait : for webelement as well as non webelements
		// not a global wait

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	    driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
	    ElementUtil eu=new ElementUtil(driver);
//	    
//	    //title - taking 5 sec
//	    System.out.println(driver.getTitle());

	    String title=eu.waitForTitleContains("Free HR Software",5);
	    System.out.println(title);
	    
	    String titlemain=eu.waitForTitleIs("Sign Up for a Free HR Software Trial | OrangeHRM",5);
	    System.out.println(titlemain);
	    
	    driver.findElement(By.linkText("CONTACT SALES")).click();
	    String fullurl=eu.waitForUrlContains("contact-sales",5);
	    System.out.println(fullurl);
	    
	    String fullurl2=eu.waitForUrlToBe("https://www.orangehrm.com/contact-sales/",4);
	    System.out.println(fullurl2);
	   
	}
	


}
