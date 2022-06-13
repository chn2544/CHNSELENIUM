package testNGSessions;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {
	
	// AAA Rule
    // Arrange Act Assert
	
	@Test
	public void loginTest()
	{
		System.out.println("Login to APP");
	//	int b=9/0;
	}
	
	@Test (dependsOnMethods = "loginTest")
	public void dashboardTest()
	{
		System.out.println("Checking Dashboard");
	}
	
	@Test (dependsOnMethods = "loginTest")
	public void searchTest()
	{
		System.out.println("Searching the Test");
	}

}
