package CSSSelectorPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomCSSSelector {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		CSS Selector is not an attribute
// 		for id – use 		   #id  or tag#id
// 		for class – use        .class    or tag.class
		
		//////////      DIff forms of CSS Selector
		
//			#input-email    or input#input-email
//			#.form-control   or input.form-control
//			#id.class          #input-email.form-control
//			.class#id		   .class#input-email
//		    html#id.class		input#input-email.form-class
//			html.class#id		input.form-control#input-email
		
		////// in case of multiple classes

//		.c1.c2.c3.....cn           .form-control.private-form__control.login-email
//		tagname.c1.c2.c3......cn
		
		
//		if id and class name are not available so for using name -
//		htmltag[attr='value']
//		input[name='password']
//		input[name='password'][type='password'][placeholder='Password']		
		
		
		By.cssSelector("#input-email");
		
// 		Question - which of following is correct to use
//		By.className("form-control private-form__control login-email");//wrong         
		//When we are using classname, we cannot use multiple classes together, only 1 class name should be used
		// use cssselector in that case.
		By.xpath("//input[@class='form-control private-form__control login-email']");//right    // multiple classes can be used in xpath
		By.cssSelector("input.form-control.private-form__control.login-email");//right
		By.className("login-email");//right
		By.className("private-form__control");//right
		
		
		//Parent to Direct Child in CSS   -- Use > Symbol
		
//		div.private-form__input-wrapper > input#username

		//Parent to Direct?indirect Child in CSS   -- Use Space after parent
		
//		div.private-form__input-wrapper  input#username		
		
		// Child to Parent Traversing is not possible
		
		//   input[id*='name'][class*='login']        - Contains in CSS
		//   input[id^='user']                        - Startswith in CSS
		//	 input[id$='name']						  - EndsWith in CSS
		
//      Preceding Sibling -   Not Available as backward traversing is not available 
		
//		Following Sibling - Available but very limited use , as we can fetch only first sibling
		
//		.control-label + #input-email    // Use + icon
		
//		Multiple elements can be combined in 1 locator in CSS - with symbol ,
		
//		#username, #password, #loginBtn, #remember           Use , to seperate these		
		driver.get("https://app.hubspot.com/login");
		int total=driver.findElements(By.cssSelector("#username, #password, #loginBtn, #remember")).size();
		System.out.println("Mandatory Feilds Count :"+total);
	
//      Not In     --------- In  CSS	
//  	form-control private-form__control login-email                   -- Class for Uname
//		form-control private-form__control login-password m-bottom-3	  -- Class for Passowrd
// Eg - input.form-control.private-form__control:not(.m-bottom-3)
		
		
// 					Differences Between Xpath and CSS Selector
		
//					  Xpath				|				  CSS
		
//1. Syntax : 		  Hard				|                 Simple
//2. Backword :       Possible			|				  Not Possible
//3. Performance:     Same				|				  Same
//4. Comma,not:       Not Available     |				  Available
//5. Text:			  Available			|				  Not Available
//6. Sibling : 	      Better Support    |				  Only Direct Forward Sibling
//7. Dynamic Ele:     Available         |				  Available (*^ etc)
//8. Webtable supp:   Better Support    |				  Not Great Support	
		
	
	}

}


