package LocatorStrategy_ID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Other_Locators {

	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");

//------------------------------------------------------------------------------------------------------------------
//		1 : id  - always a unique attribute...    -- Done in previous Class
//------------------------------------------------------------------------------------------------------------------		
//		2 : name - (in case id is not available)   - name can be duplicate

//		driver.findElement(By.name("email")).sendKeys("crgogte99@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("Pune@123");
		
//		Using Utilities
//		By email=By.name("email");
//		By pwd=By.name("password");
//		
//		ElementUtil eu=new ElementUtil(driver);
//		eu.dosendKeys(email,"crgogte99@gmail.com");
//		eu.dosendKeys(pwd, "Covid19");

//------------------------------------------------------------------------------------------------------------------
//		3 : class name   - not a unique attribute - can be duplicate 
		// used only when we have uniqure class name 
//		driver.findElement(By.className("form-control")).sendKeys("Test@gmail.com");     // This will enter the data in the first box of page where it will find class name

		
//------------------------------------------------------------------------------------------------------------------
//		4 : xPath  : it is not a attribute ,  its address of web element in HTML DOM
//	     driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/a")).click();
		
//		//Using Utilities
//	     By continue_btn=By.xpath("//*[@id=\"content\"]/div/div[1]/div/a");
//	     ElementUtil eu=new ElementUtil(driver);
//	     eu.doClick(continue_btn);

//		//Using String locators
//		String  continue_btn="//*[@id=\"content\"]/div/div[1]/div/a";
//		ElementUtil eu=new ElementUtil(driver);
//		eu.dosendKeys("xpath", continue_btn);
//		
//------------------------------------------------------------------------------------------------------------------
//		5 : cssSelector  : it is also not a attribute 
//		driver.findElement(By.cssSelector("#logo > h1 > a")).click();
		
//------------------------------------------------------------------------------------------------------------------
//		6 : linktext : only for links (will work if text of link is available)
//		driver.findElement(By.linkText("Forgotten Password")).click();
//		String str=driver.findElement(By.linkText("Forgotten Password")).getText();
//		System.out.println("Text of Link is "+str);
		
		//Using Utilities
//		By link=By.linkText("Forgotten Password");
//		ElementUtil eu=new ElementUtil(driver);
//		String text_of_link=eu.checkText(link);
//		System.out.println("Text of Link is : "+text_of_link);
//		eu.doClick(link);

//------------------------------------------------------------------------------------------------------------------
//		7 : partiallinktext : For long length links 
//		driver.findElement(By.partialLinkText("Regi")).click();

//------------------------------------------------------------------------------------------------------------------
//		8 : tagname : HTML Tag which is present in DOM 
		String tag_text=driver.findElement(By.tagName("h2")).getText();
		System.out.println("Text in p tag is : "+tag_text);
	}

}
