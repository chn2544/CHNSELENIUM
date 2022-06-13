package DropdownHandler;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import LocatorStrategy_ID.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithoutSelectTag {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox")).click();
		By dd=By.xpath("(//div[contains(@id,'DropDownContainer')])[1]/ul//span[@class='comboTreeItemTitle']");
		ElementUtil eu=new ElementUtil(driver);
//		eu.getDDValuesSelectClassNotAval(dd,"choice 1");
//		eu.getDDValuesSelectClassNotAval(dd,"choice 1","choice 6 2 2","choice 7");
//		eu.getDDValuesSelectClassNotAval(dd, "selectall");
		
		

	}
	
	

}
