package searchHandle_Footer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchHandle {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com");
		
		//try to search Dress Results
		driver.findElement(By.id("search_query_top")).sendKeys("Dress");
		Thread.sleep(10000);
		// Search and select a value 
		
		//Approach 1 : Get List and select 1
		
//		List <WebElement> suglist=driver.findElements(By.xpath("//div[@class='ac_results']//li"));
//		
//		for(WebElement e:suglist)
//		{
//			String text=e.getText();
//			if(e.getText().contains("Casual Dress"))
//			{
//				e.click();
//				break;
//			}
//		}
		
		//Approach 2 : create single webelement - on basis of text written
		// lines 22 and 23 are required for following code
		driver.findElement(By.xpath("//li[contains(text(),'Casual Dresses > Printed ')]")).click();
		
		
		
	}

}
