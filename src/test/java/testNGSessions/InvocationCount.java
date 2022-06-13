package testNGSessions;

import org.testng.annotations.Test;

public class InvocationCount {
	
	//Can be used in API Automation, lets say to create user
	//This is sequential Execution
	
	@Test (invocationCount = 10)
	public void createUserTest()
	{
		System.out.println("Create new user");
					
	}

}
