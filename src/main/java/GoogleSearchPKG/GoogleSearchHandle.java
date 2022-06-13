package GoogleSearchPKG;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import LocatorStrategy_ID.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchHandle {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		ElementUtil eu=new ElementUtil(driver);
//		By searchbox=By.name("q");
//		eu.dosendKeys(searchbox, "Naveen Automation Labs");
		
		
		//  Enter naveen automation labs in google search and select naveen automation labs api testing
		
//		List <WebElement> results=driver.findElements(By.xpath("//ul[@role='listbox']//div[@class='wM6W7d']/span"));
//		for(WebElement e:results)
//		{
//			String text=e.getText();
//			if(text.contains("naveen automation labs api testing"))
//			{
//				e.click();
//				break;
//			}
//			
//		}
		
		
		By loc=By.xpath("//ul[@role='listbox']//div[@class='wM6W7d']/span");
		ElementUtil eu2=new ElementUtil(driver);
		
//		eu2.getGoogleSearchList(loc,"Selenium Testing");
		eu2.selectGoogleSuggesstion(loc, "selenium testing", "selenium testing framework");
				
	}	
	

}
