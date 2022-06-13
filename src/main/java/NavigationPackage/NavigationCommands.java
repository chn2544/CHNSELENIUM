package NavigationPackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws MalformedURLException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\C825661\\Documents\\CHIN\\JC\\NAL\\CHNWC\\Browserexecutable\\chromedriver.exe");
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
		
		driver.navigate().to(new URL("https://facebook.com"));
		System.out.println("Title of Page :"+driver.getTitle());
		
		driver.navigate().refresh();
		System.out.println("Title of Page :"+driver.getTitle());
	}
	

}
