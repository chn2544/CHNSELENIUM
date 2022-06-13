package SVG_Shadow_Pseudo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SVGElementConcept {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map#/");
		Thread.sleep(3000);
		// Xpath for getting List of 51 States
		List <WebElement> list=driver.findElements(By.xpath("//*[local-name()='svg' and@id='map-svg']//*[name()='g' and @id='states']//*[name()='path']"));
		System.out.println("Number of States : "+list.size());

		// When we mouse over, we should get state name.
		Actions act=new Actions(driver);
		for(WebElement e: list)
		{	
			act.moveToElement(e).perform();
			String state=e.getAttribute("name");
			System.out.println(state);
			if(state.equals("Maryland"))
			{
				e.click();
				break;
			}
			
		}
		
		List <WebElement> sublist=driver.findElements(By.xpath("//*[name()='g' and @id='maryland']//*[name()='g' and @class='counties']//*[name()='path']"));
		System.out.println("Number of Cities :"+sublist.size());
		
		for(WebElement e: sublist)
		{	
			act.moveToElement(e).perform();
//			Attribute name is not present, need to find other way			
//			String state=e.getAttribute("name");
//			System.out.println(state);
//						
		}
	}

}
