package ActionsPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationPopUp {


	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		//// Driver .switchto . alert wont work here as pop up coming here is not JS pop up
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

		//Drawbacks of this -
//		Uname, Pwd is exposed, and passowrd cannot have @, as after first @ it considers domain name in front of it

	}

}
