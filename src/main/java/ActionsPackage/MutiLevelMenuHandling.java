package ActionsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import LocatorStrategy_ID.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MutiLevelMenuHandling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		

			// TODO Auto-generated method stub
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://bigbasket.com/");
			

			//1 parent to child menu item
			//2 multi level menu items
			
			By parent=By.xpath("//a[@class='dropdown-toggle meganav-shop']");
			By level1=By.linkText("Beverages");
			By level2=By.linkText("Tea");
			By level3=By.linkText("Exotic & Flavoured Tea");
			By level4=By.linkText("Red Label");
			ElementUtil eu=new ElementUtil(driver);
			eu.multilevelMenuFunction(parent,level1,level2,level3,level4);
			
	
	}
	
	

}
