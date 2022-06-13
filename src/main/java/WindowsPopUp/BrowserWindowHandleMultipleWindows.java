package WindowsPopUp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandleMultipleWindows {

	static WebDriver driver;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		String parwindow=driver.getWindowHandle();   // Storing Parent Window Id, we dont want to close it in while loop
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
		
		Set<String> handles=driver.getWindowHandles(); 
		Iterator<String> it=handles.iterator();  
		
		
		while(it.hasNext())
		{
			String winid=it.next();
			if(!parwindow.equals(winid))
			{
			driver.switchTo().window(winid);
			System.out.println("URL is : "+driver.getCurrentUrl());
			driver.close();
			}
		}
		
		driver.switchTo().window(parwindow);
		System.out.println("Parent URL is : "+driver.getCurrentUrl());
	}

}
