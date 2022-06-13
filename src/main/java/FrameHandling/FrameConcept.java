package FrameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
//		driver.switchTo().frame(2);   //frame index starts from 0 		
//		driver.switchTo().frame("main");
		driver.switchTo().frame(driver.findElement(By.name("main")));
		String header=driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);
		driver.switchTo().defaultContent();   // to go back to main page
		
		// From Sel 4.x
		driver.switchTo().parentFrame();
		
	}

}
