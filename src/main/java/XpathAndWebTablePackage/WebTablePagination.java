package XpathAndWebTablePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTablePagination {

	static int count=1;
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page");

		while(true)  // as we need to iterate till element is found , then we will break
		{
			if( driver.findElements(By.xpath("//td[text()='Pune']")).size()>0)   // condition to check if element is found  
			{																	// if we use findelement and city is not present on first page, it will throw nosuchelementexception
				selectCity("Pune");
				break;
			}
			else
			{
				WebElement web=driver.findElement(By.xpath("//a[text()='Next']"));
				
				if(web.getAttribute("class").contains("disabled"))   // next button on last page having class as - paginate_button next disabled
				{
					System.out.println("Last Page Reached But City Not Found ");
					break;
				}
				web.click();// Click on Next if element is not available
				count++;
				Thread.sleep(1500);
			}
		}
		
		
		
		
	}
	
	public static void selectCity(String city)
	{
		System.out.println(city+" found on Page -> "+count);
		driver.findElement(By.xpath("//td[text()='"+city+"']/ancestor::tr/td/input[@type='checkbox']")).click();
	}

}
