package WindowsPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel4NewWindowPopup {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		String parwindow=driver.getWindowHandle();
		// Opening a new tab, hit url and coming back to main application
		driver.switchTo().newWindow(WindowType.TAB);            // Sel 4.x Feature
		driver.navigate().to("https://www.google.com");
		System.out.println("Title - "+driver.getTitle());
		driver.close();
		driver.switchTo().window(parwindow);
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Hello Chinmay");
		System.out.println("Title - "+driver.getTitle());
		driver.switchTo().newWindow(WindowType.WINDOW);        // Sel 4.x Feature  
		driver.navigate().to("https://www.amazon.com");
		System.out.println("Title - "+driver.getTitle());
		driver.close();
		driver.switchTo().window(parwindow);
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hello Chinmay");
		Thread.sleep(5000);
		driver.quit();
		
}

}