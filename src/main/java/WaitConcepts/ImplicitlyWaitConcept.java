package WaitConcepts;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWaitConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Global Wait 
		// 2. Applied for all webelements by default
		// 3. Not a custom wait for specific element. (for login 10 sec and for register 15 sec) not possible
		// 4. Not applicable for non webelements (eg. Title,URL, Alert etc)
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);      // sel 3.x
		
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));    // sel 4.x
			  
		//	  For all webelements, implicitly wait will be applied
			  
			  driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
			  
			  //above implicitly wait is applied for all following web elements if not immidieately present
			  
			  //1st page : home page
//			  By fullname=By.xpath("//input[@id='Form_submitForm_Name11']");
//			  driver.findElement(fullname).sendKeys("Chinmay");
//            As we have given wrong xpath locator, selenium will wait for 10 sec before throwing exception			  
			  
			  By fullname=By.xpath("//input[@id='Form_submitForm_Name']");
			  driver.findElement(fullname).sendKeys("Chinmay");
			  By email=By.xpath("//input[@id='Form_submitForm_Email']");
			  driver.findElement(email).sendKeys("crg@gmail.com");
			  By phone=By.xpath("//input[@id='Form_submitForm_Contact']");
			  driver.findElement(phone).sendKeys("9850046562");
			  
			  // Though elements are visible quickly and rest seconds will be ingored
			  // but call is made to implicit wait method unnecessaryly
			  
			  //2nd page : Contact Page
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			  //element e4                     // for e4 and e5 , 5 seconds will be applied.
			  //element e5
			  
			  // land on home page again
			  // now wait of 5 second will be applied.
			  // if 10 seconds are req, again override is required
			  
			  //3rd page : Cart Page   - no wait is required
			  //-- nullify the wait
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
	}

}
