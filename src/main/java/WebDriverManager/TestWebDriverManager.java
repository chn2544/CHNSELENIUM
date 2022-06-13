package WebDriverManager;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWebDriverManager {

	public static void main(String[] args) {

		// Replacement for SetProperty
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("Title of Page :"+driver.getTitle());
		
		// To Navigate to some other webpage
		driver.navigate().to("https://amazon.com");
		System.out.println("Title of Page :"+driver.getTitle());
		
		//to come back
		driver.navigate().back();
		System.out.println("Title of Page :"+driver.getTitle());
		
		//to go forward again
		driver.navigate().forward();
		System.out.println("Title of Page :"+driver.getTitle());
		
		//to come back
		driver.navigate().back();
		System.out.println("Title of Page :"+driver.getTitle());
		
		
		
		driver.navigate().refresh();
		System.out.println("Title of Page :"+driver.getTitle());
		
	}

}
