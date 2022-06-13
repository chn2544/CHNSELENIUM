package WindowsPopUp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandler {
	static WebDriver driver;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		// A New Child window/tab is opened
		Set<String> handles=driver.getWindowHandles(); // Set Holds Unique values
													   // Set is not index based collection , it is orderless collection
		Iterator<String> it=handles.iterator();        // Iterator is interface, not class
		String parid=it.next();                        // it initially points to just above first element of set 
		System.out.println("Parent Window Id : "+parid);
		String chid=it.next();
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
