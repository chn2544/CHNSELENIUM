package WindowsPopUp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExerciseHandleMultipleWindows {

	static WebDriver driver;
	public static void main(String[] args) {
		//Exercise - Open HRM, click on linked in icon, get title, close it, then click on facebook and so on...
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		String parent=driver.getWindowHandle();
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		Set<String> handle=driver.getWindowHandles();
		Iterator<String> it=handle.iterator();
		it.next();
		String child=it.next();
		driver.switchTo().window(child);
		System.out.println("Title - "+driver.getTitle());
		driver.close();
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		Set<String> handle2=driver.getWindowHandles();
		Iterator<String> it2=handle2.iterator();
		it2.next();
		String child2=it2.next();
		driver.switchTo().window(child2);
		System.out.println("Title - "+driver.getTitle());
		driver.close();
		driver.switchTo().window(parent);
		
	}

}
