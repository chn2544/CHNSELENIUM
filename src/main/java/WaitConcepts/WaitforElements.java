package WaitConcepts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import LocatorStrategy_ID.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitforElements {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Explicity wait : for webelement as well as non webelements
		// not a global wait

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		By footers=By.xpath("//div[@class='footer-main']//li//a");
		ElementUtil eu=new ElementUtil(driver);
		List<WebElement> footerlinks=eu.waitForVisibilityOfElements(footers, 10);
		for(WebElement e:footerlinks)
		{
			System.out.println(e.getText());
		}

	}
	


}
