package SVG_Shadow_Pseudo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PseduoElementConcept {


	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String script=js.executeScript("return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"), \"::before\").getPropertyValue('content')").toString();
		System.out.println(script);
		if(script.contains("*"))
		{
			System.out.println("This is mandatory Feild");
		}
		else
		{
			System.out.println("This is not a mandatory feild");
		}
		
		driver.navigate().to("https://www.orangehrm.com/contact-sales/");
		String scriptnew=js.executeScript("return window.getComputedStyle(document.querySelector(\"label[for='Form_submitForm_FullName']\"), \"::after\").getPropertyValue('content')").toString();
		System.out.println(scriptnew);
		if(scriptnew.contains("*"))
		{
			System.out.println("This is mandatory Feild");
		}
		else
		{
			System.out.println("This is not a mandatory feild");
		}
	}

}
