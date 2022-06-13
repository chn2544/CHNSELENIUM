package XpathAndWebTablePackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import LocatorStrategy_ID.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableCricBuzz {


	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		
		

		By parent=By.xpath("//a[text()='Series']");
		By child=By.xpath("//a[text()='Indian Premier League 2022']");
		By Results=By.xpath("//a[text()='Schedule & Results']");
		By Match=By.xpath("//a/span[contains(text(),'59th Match')]");
		By scores=By.xpath("//a[text()='Scorecard']");
		
		ElementUtil eu=new ElementUtil(driver);
		eu.levelTwoMenuHandling(parent, child);
		eu.doClick(Results);
		eu.doClick(Match);
		eu.doClick(scores);
		System.out.println(eu.getScore("Dhoni"));
		System.out.println(eu.getScore("Moeen"));
		System.out.println(eu.getScore("Conway"));
		
	}

	
}
