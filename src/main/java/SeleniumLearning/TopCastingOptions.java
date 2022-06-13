package SeleniumLearning;

import java.net.URL;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {

	public static void main(String[] args) {
		
//		1st Approach		
		WebDriver driver=new ChromeDriver();
//		driver.     // can be accessed all remotewebdriver method which were declared in webdriver interface

//		2nd Approach
//		SearchContext newdriver=new ChromeDriver();
//		This is valid top casting, but only 2 methods of SearchContext will be accissible
		
		
//		WebDriver driver=new WebDriver();   As We cannot create object of interface 

//		3rd Approach
//		ChromeDriver newdriver2=new ChromeDriver();   This is allowed but this will be limited to chrome
//		This will work only for chromedriver
		
//		4th Approach		
//		RemoteWebDriver rweb=new ChromeDriver();
//		This is valid top casting and valid as well just substitute for first approach
//		Here we will also get some seperate methods written in RemoteWebDriver		

//		5th Approach - recommendded for remote execution on selenium grid :cloud, remote, AWS
//		WebDriver webd=new RemoteWebDriver(new URL("192.189.90.99: 4444"), capabilities);

//		6th Approach
//		ChromiumDriver cd=new ChromeDriver();
//		This will work only for chromedriver and edge driver
		
//		Selenium 4 has deprecated support for Opera Driver
//		ChromiumDriver cd=new OperaDriver();  
//		When this line is uncommented, OperaDriver word is crossed out		
		
	}

}
