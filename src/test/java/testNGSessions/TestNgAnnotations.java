package testNGSessions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {

	
	@BeforeSuite       				// Seq 1
	public void connectDB()
	{
		System.out.println("BS--Connecting to DataBase...");
	}
	
	@BeforeTest						// Seq 2
	public void createUser()
	{
		System.out.println("BT--Creating the User...");
	}
	
	@BeforeClass                    // Seq 3
	public void launchBrowser()
	{
		System.out.println("BC--Launching the Browser...");
	}
	
	@BeforeMethod                 // Seq 4 //  Seq 7 //  Seq 10 
	public void logintToApp()
	{
		System.out.println("BM--Login to Application...");
	}
	
	@Test
	public void getPageTitleTest()    // Seq 5
	{
		System.out.println("getPageTitleTest--Getting Title Of the Page...");
	}
	
	@Test
	public void userInfoTest()      // Seq 11
	{
		System.out.println("userInfoTest--Getting Information of the User...");
	}
	
	@Test 
	public void searchTest()      // Seq 8
	{
		System.out.println("searchTest--Searching the data...");
	}
	
	
	@AfterMethod                  // Seq 6 // Seq 9  // Seq 12
	public void logout()
	{
		System.out.println("AM--Logging Out of the Application...");
	}
	
	@AfterClass
	public void closingBrowser()        // Seq 13
	{
		System.out.println("AC--Closing the Browser...");
	}
	
	@AfterTest
	public void deleteUser()           // Seq 14
	{
		System.out.println("AT--Deleting the User...");
	}
	
	@AfterSuite                       // Seq 15
	public void disconnectDB()
	{
		System.out.println("AS--Disconnecting from DataBase...");
	}
	
	
}

// Note : Sequence is as Follows :  BS,BT,BC... BM,Test,AM... BM,Test,AM... BM,Test,AM... AC,AT,AS
//		  Before Method and After Method forms a pair around Test, and Tests are executed according to alphabetical order.