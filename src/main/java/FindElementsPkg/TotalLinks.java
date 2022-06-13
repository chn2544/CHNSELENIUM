package FindElementsPkg;



import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import LocatorStrategy_ID.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {

static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com");

		// As all links are associated with a tag
		//findElements returns a List of Web Elements
		List<WebElement> listoflinks=driver.findElements(By.tagName("a"));
		
		System.out.println("Total Number of Links :"+listoflinks.size());
		
//		for(int i=0;i<listoflinks.size();i++)
//		{
//			String text=listoflinks.get(i).getText();
//			if(!text.isEmpty())
//			{
//			System.out.println(text);
//			}
//		}
////		
//		for(WebElement e : listoflinks)
//		{
//			String text=e.getText();
//			if(!text.isEmpty())
//			{
//			System.out.println(e.getText());
//			}
//		}
//		
		
//		listoflinks.stream().forEach(ele -> System.out.println(ele.getText()));
//	    listoflinks.stream().filter(ele -> !ele.getText().isEmpty()).forEach(ele -> System.out.println(ele.getText()));	
		
		
		// to get href values of links
//		for(WebElement e : listoflinks)
//			{
//				String text=e.getAttribute("href");
//				System.out.println(text);
//				
//			}
		
		// Using Generic Function
		
//		By list=By.tagName("a");
//		ElementUtil eu=new ElementUtil(driver);
//		List<String> hreflist=eu.getElementsAttributeList(list, "href");
//		for(String e :hreflist)
//		{
//			System.out.println(e);
//		}
		
//		By list2=By.tagName("a");
//		ElementUtil eu=new ElementUtil(driver);
//		List<String> hreflist2=eu.getElementsTest(list2);
//		for(String e :hreflist2)
//		{
//			if(e.contains("book"))
//			{
//			System.out.println(e);
//			}
//		}
//		
		
//		// count total number of links
//		By list3=By.tagName("a");
//		ElementUtil eu=new ElementUtil(driver);
//		int count=eu.getElementCount(list3);
//		System.out.println("Total Count of Links :"+count);
//		
//		// count total number of images
//		By list4=By.tagName("img");
//		ElementUtil eu=new ElementUtil(driver);
//		int imgcount=eu.getElementCount(list4);
//		System.out.println("Total Count of Images :"+imgcount);
//		
		
	}
	
	
}
