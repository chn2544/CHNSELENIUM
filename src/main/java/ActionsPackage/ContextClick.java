package ActionsPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import LocatorStrategy_ID.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ContextClick {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		By rightclickelem=By.xpath("//span[@class='context-menu-one btn btn-neutral']");
		By rightclickmenuitems=By.xpath("//ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-item context-menu-icon')]");
		By actualclick=By.xpath("//span[text()='Delete']");
		ElementUtil eu=new ElementUtil(driver);
		eu.selectRightClickMenu(rightclickelem, actualclick);
//		eu.listOfRightClickMenuItems(rightclickelem, rightclickmenuitems);
		

		
	}
	

	
	
	
}
