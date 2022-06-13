package XpathAndWebTablePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXpath_1 {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
//		Xpath is an address of element in DOM
		
		// Syntax :   //htmltag[@attribute='value']
		// xpath :    //input[@id='input-email']
		// can add multiple attributes as well   ->   
		//input[@id='input-email' and @name='email']
		//input[@id='input-email' and @name='email' and @type='text']
		// if id,name,type is not available //input[@placeholder='E-Mail Address']
		
		// contains method : used for Dynamic Attributes 
		
		// Syntax :   //htmltag[contains(@attr,’value’)]
		// xpath :    //input[contains(@id,'firstname')]
		By fname=By.xpath("//input[contains(@id,'firstname')]");
		
		//	we can use contains in specifically in scenario where attribute value is changing constantly
		// input id = 'test_123'     ;  On first run
		//       id = 'test_456'     ; On Second Run
		//       id = 'test_567'     ; On Third Run
		// Use xpath as below
		//       //input[contains(@id,'test_')]   
		
		// we can have combination of attribute with and without contains as well
		// Syntax :   //htmltag[contains(@attr1,’value’) and @attr2='value']
		//            //htmltag[contains(@attr1,’value’) and contains(@attr2,'value')]
	
		//text()    - For Text Variables
		// Syntax :    //html[text()='value']
		//			   //h1[text()='Register Account']   //  Have to write whole text  	
		By registertext=By.xpath("//h1[text()='Register Account'] ");
		
		//we can use combination of text and attribue as well
		
		//a[text()='Forgotten Password' and @class='list-group-item']
		
        //p[text()='Freshworks makes it fast and easy for businesses to delight their customers and employees.']
		
		
		//   We can use combination of contains with text
		//  Syntax :   //htmltag[contains(text(),'value'] 
		//    		   //p[contains(text(),'businesses to delight')]
	
		// contains with text and attribute
		// Syntax :   //htmltag[contains(@attr1,'value') and text()='value' and @attr2='value']
		//a[contains(@href,'account/forgotten') and text()='Forgotten Password' and @class='list-group-item']
		//a[contains(@href,'account/forgotten') and contains(text(),'Password')]
		
		//starts-with             -- similarly we can use this for dynamic values
		// Syntax :   //htmltag[starts-with(@attr,'value')]
		//input[starts-with(@id,'input-first')]
		//input[starts-with(@id,'input') and starts-with(@name,'first')]
		
		//we can write starts-with with text as well
		//  //legend[starts-with(text(),'Your')]
		
		// Note : ends-with is deprecated in xpath
		
		
		// Indexing  -
		
		// when there are multiple webelements with same value for a attribute, we need to create group with surrounding xpath with () and then giving index with []
	 	// Eg - (//input[@class='form-control'])[1]
		By fstname=By.xpath("(//input[@class='form-control'])[1]");
		
		// last() function in indexing to capture last element of group
		
		//input[@class='form-control'])[last()]
		// we dont have first or second as a function
		
		
		
		//xpath axes:
		//parent and child:
		//parent tag / child tag - direct child elements
		//parent tag // child tag -- direct + indirect child elements
		
		// Parent to Child -
		//div[@id='content']//child::form       -- gives the indirect child elements having tag as form
		//div[@id='content']//form//input[@name='email']
		
		// Child to Parent - backward Traversing
		//input[@id='input-password']/../../../../../../../../../..                   use /../../.. to traverse to top of DOM
		//input[@name='email']/parent::div       -- gives immidiate parent
		//input[@name='email']/ancestor::form        -- gives grandparent
		
		// Sibling Data -----------------
		//preceding-sibling:
		//input[@name='email']/preceding-sibling::label[@for='input-email']
		//following-sibling:
		//label[@for='input-email']/following-sibling::input[@name='email']

		
		
		// Amazon Use Case to Validate if last element of footter is Help or not
		
		driver.get("https://www.amazon.in/ref=nav_logo");
		String taketext=driver.findElement(By.xpath("(((//div[contains(@class,'navFooterLinkCol')])[last()])//li)[last()]")).getText();       // Help  
		String taketext1=driver.findElement(By.xpath("(((//div[contains(@class,'navFooterLinkCol')])[last()])//li)[last()-1]")).getText();    //   Amazon Assistant Download
		if(taketext.equalsIgnoreCase("help"))
		{
			System.out.println("You have got correct xpath and Help is present here: " + taketext);
		}
		else
		{
			System.out.println("Sorry Help is not present as last element in app : "+ taketext);
		}
		
	}

}
