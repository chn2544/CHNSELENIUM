package SeleniumLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		

//		Start the Server
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\C825661\\Documents\\CHIN\\JC\\NAL\\CHNWC\\Browserexecutable\\chromedriver.exe");
				
//      We are doing top casting here, create object of chromedriver and refer it with parent interface reference variable
//		Launch the browser
		WebDriver driver=new ChromeDriver();
		
//		WebDriver driver=new WebDriver();   As We cannot create object of interface 
//		ChromeDriver newdriver=new ChromeDriver();   This is allowed but this will be limited to chrome

//		Launch particular URL		
		driver.get("https://www.google.com");   // we need to give https else we will get invalid argument exception
		
//		Get and Print title of WebPage
		String title=driver.getTitle();
		System.out.println("Title of Page is :"+title);
		
//		Checkpoint/Verification of title is correct
		if(title.equals("Google"))
		{
			System.out.println("Title is correct");
		}
		else
		{
			System.out.println("Title is incorrect");
		}
		
		String url=driver.getCurrentUrl();
		System.out.println("URL is : "+url);
		
//		To Close the browser
//		driver.quit();
		
		
	}

}
