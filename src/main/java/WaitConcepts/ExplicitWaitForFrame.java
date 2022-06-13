package WaitConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import LocatorStrategy_ID.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

		
public class ExplicitWaitForFrame {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		By framelocator=By.name("main");
		
		 ElementUtil eu=new ElementUtil(driver);
		 eu.waitForFrameByLocator(framelocator, 10);
		
		String header=driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);

		driver.switchTo().defaultContent();
	}
	
	

}
