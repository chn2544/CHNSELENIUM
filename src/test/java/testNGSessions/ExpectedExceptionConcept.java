package testNGSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	
	String name;
	
	@Test (expectedExceptions = {NullPointerException.class, ArithmeticException.class})
	public void loginTest()
	{
		System.out.println("Login to APP");
		int a=9/3;
			
		ExpectedExceptionConcept obj=new ExpectedExceptionConcept();
		obj.name="Chinmay";
	//    obj=null;
		System.out.println("Name Given - "+obj.name);
	}
}
