package XpathAndWebTablePackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class W3SchoolsWebTable {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		int rows=driver.findElements(By.xpath("//table[@id='customers']//tr")).size()-1;
		int columns=driver.findElements(By.xpath("//table[@id='customers']//tr/th")).size();
		System.out.println("Total No of Rows = "+rows+"\n and Columns in Table = "+columns);
		List <WebElement> list=driver.findElements(By.xpath("//table[@id='customers']//tr/td"));
		for(WebElement e : list)
		{
			String text=e.getText();
			System.out.println(text);
		}
		
		// Xpath to get values only from a column
		List <WebElement> col1list=driver.findElements
				(By.xpath("//th[contains(text(),'Company')]/parent::tr/following-sibling::tr/td[1]"));
		System.out.println("Column values from first column\n");
		for(WebElement e : col1list)
		{
			String text=e.getText();
			System.out.println(text);
		}
	}
	
}
