package searchHandle_Footer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FooterList {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		
		List <WebElement> mylist=driver.findElements(By.xpath("//div[@class='footer-main']//ul//a"));
//		Printing via Stream				
//		mylist.stream().forEach(e -> System.out.println(e.getText()));		
//		mylist.stream().filter(e->!e.getText().isEmpty()).forEach(e->System.out.println(e.getText()));    // Remove Blank Text Links
	}

}
