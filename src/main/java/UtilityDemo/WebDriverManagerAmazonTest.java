package UtilityDemo;

import java.net.MalformedURLException;
import java.net.URL;

public class WebDriverManagerAmazonTest {

	public static void main(String[] args) throws MalformedURLException {   // throws because of new URL
		
		WebDriverManager_BrowserUtil bu=new WebDriverManager_BrowserUtil();
		
		bu.init_driver("chrome");
		bu.launchUrl("https://www.amazon.com");
		System.out.println("Title : "+bu.getTitle());
		System.out.println("Currnet URL : "+bu.getCurrentUrl());
		if(bu.getCurrentUrl().contains("amazon"))
		{
			System.out.println("Amazon is launched");
		}
		
		bu.launchUrl(new URL("https://facebook.com"));
		System.out.println("Title : "+bu.getTitle());
//		bu.close();
		
//		bu.init_driver("fireFox");
//		bu.launchUrl("https://www.amazon.com");
//		System.out.println("Title : "+bu.getTitle());
//		System.out.println("Currnet URL : "+bu.getCurrentUrl());
//		if(bu.getCurrentUrl().contains("amazon"))
//		{
//			System.out.println("Amazon is launched");
//		}
//		bu.close();

	}

}
