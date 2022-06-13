package SVG_Shadow_Pseudo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowDOMElementConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// html page  DOM elements -->
				// -------> Shadow DOM
					  // 	-----> Element

		
		// html page  DOM elements -->
			// -----> iframe
				// -------> Shadow DOM
						  // 	-----> Element
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(5000);
		
		// We cannot interact with elements in shadow directly with locators.
		//Here element is in shadow and that shadow is in iframe
		
		driver.switchTo().frame("pact");
			
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement elem=(WebElement) js.executeScript("return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")");
		elem.sendKeys("Masala Chai");
		
		

		
		
	
	
	}
	
	

}
