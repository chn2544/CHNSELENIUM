package ActionsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import LocatorStrategy_ID.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopUp {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		ElementUtil eu=new ElementUtil(driver);
		driver.findElement(By.xpath("//form[@method='POST']/input[@name='upfile']")).sendKeys("C:\\Users\\C825661\\Documents\\CHIN\\Paragon\\Project Docs\\Other Help Docs\\Clarity for PI Planning.png");

//		File Not Found Exception  if path is incorrect
		driver.findElement(By.xpath("//form[@method='POST']/input[@name='upfile']")).sendKeys("C:\\Users\\C825661\\Documents\\CHIN\\Paragon\\Project Docs\\Other Help Docs\\Claritnning.png");

		
		
		
	}

}
