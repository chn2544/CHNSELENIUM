package ActionsPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import LocatorStrategy_ID.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementIsDisplayed {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		ElementUtil eu=new ElementUtil(driver);
		
		By uid = By.id("input-email");
		Boolean val=eu.isElemDisplayed(uid);
		System.out.println("Element Displayed :"+val);
	
	}
	

	
	
}
