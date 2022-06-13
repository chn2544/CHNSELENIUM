package ActionsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import LocatorStrategy_ID.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MenuHandling {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://bigbasket.com/");
		
		//1 parent to child menu item
		//2 multi level menu items
		
		By parent=By.xpath("//a[@class='dropdown-toggle meganav-shop']");
		By child=By.linkText("Beverages");
		
		
		ElementUtil eu=new ElementUtil(driver);
		eu.levelTwoMenuHandling(parent, child);
		
		
}
	
	

}
