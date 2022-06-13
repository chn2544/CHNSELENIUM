package ActionsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import LocatorStrategy_ID.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClickandSendKeys {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		ElementUtil eu=new ElementUtil(driver);
		
		By uid = By.id("input-email");
		By pwd=By.id("input-password");
		By loginbtn=By.xpath("//input[@class='btn btn-primary']");
		
		eu.actionsSendKeys(uid, "crgogte99@gmail.com");
		eu.actionsSendKeys(pwd, "Crossref#!@!");
		eu.actionsClick(loginbtn);
		
	}
	
	
}
