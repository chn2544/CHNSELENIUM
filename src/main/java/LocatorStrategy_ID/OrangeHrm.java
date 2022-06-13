package LocatorStrategy_ID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import UtilityDemo.BrowserUtil;

public class OrangeHrm {

	public static void main(String[] args) {
		
		BrowserUtil bu=new BrowserUtil();
		WebDriver driver=bu.init_driver("chrome");
		
		bu.launchUrl("https://www.orangehrm.com/contact-sales/");
		System.out.println("Title of the page is : "+bu.getTitle());
		System.out.println("URL of the page is : "+bu.getCurrentUrl());
		
		By fname=By.id("Form_submitForm_FullName");       // Return type of id is By , so we will store in By variable
		By cname=By.id("Form_submitForm_CompanyName");
		By jtitle=By.id("Form_submitForm_JobTitle");
		
		ElementUtil eu=new ElementUtil(driver);    // we will be passing same driver we received from line 13 and got from init_driver method
		eu.dosendKeys(fname, "Final Name");
		eu.dosendKeys(cname, "Dream Job - Microsoft");
		eu.dosendKeys(jtitle, "CEO of Company");
	}

}
