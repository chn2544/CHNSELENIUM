package QuitvsClosePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuitvsClose {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String title =driver.getTitle();
		System.out.println("Title :" +title);
		System.out.println("URL : "+driver.getCurrentUrl());
		driver.quit();    // Session id is cleared    // server is up and running, browser will be closed
		System.out.println(driver.getTitle());   // No SuchSession exception

	}

}
