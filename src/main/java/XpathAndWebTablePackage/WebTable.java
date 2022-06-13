package XpathAndWebTablePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page");
		clickCheckBox("Joe.Root");
		clickCheckBox("Kevin.Mathews");
		

	}

	public static void clickCheckBox(String name)
	{
		driver.findElement(By.xpath("//a[text()='"+name+"']/../preceding-sibling::td/input[@type='checkbox']")).click();
		
	}
}
