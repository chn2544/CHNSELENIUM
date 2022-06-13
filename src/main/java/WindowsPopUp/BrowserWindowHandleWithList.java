package WindowsPopUp;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandleWithList {

	static WebDriver driver;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		Set<String> handles=driver.getWindowHandles(); 
		
		List<String> handlelist=new ArrayList<String>(handles);  // we are passing handles to constructor 
		//and making orderless collection of set to order basec collection

		String parid=handlelist.get(0);
		System.out.println("Parent Window Id : "+parid);
		String chid=handlelist.get(1);
		System.out.println("Child Window Id : "+chid);
		driver.switchTo().window(chid);
		System.out.println("\nURL Of Child Page :"+driver.getCurrentUrl());
		System.out.println("Title Of Child Page :"+driver.getTitle());
		driver.close();                  // This will close child window, never use Quit
		driver.switchTo().window(parid);
		System.out.println("\nURL Of Parent Page :"+driver.getCurrentUrl());
		System.out.println("Title Of Parent Page :"+driver.getTitle());
		driver.quit();
		

	}

}
