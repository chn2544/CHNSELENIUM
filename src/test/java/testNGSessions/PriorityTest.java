package testNGSessions;

import org.testng.annotations.Test;

public class PriorityTest {
	
	// If Priority is not given, tests will be executed alphabetically.
	// If Priority is given, accoring to ascending order, tests will be executed.
	// Execution will be based on Priority in sequence ->  eg.  -23, 0, 32, 45, 22
	// If there is same priority to multiple test, alphabetical order will be considered.
	// If there is combo of prio and non prio test cases, first non prio will be executed based on sequence
	// and then prio will be executed as per sequence.
	// If priority is given as char eg . 'a' , according to prio-  abcde, tests will get executed
	// If there is combo of numeric and char priority, numeric prio will be executed first

	
	@Test
	public void a_test()
	{
		System.out.println("a - test");
	}
	
	@Test (priority = 'd')
	public void b_test()
	{
		System.out.println("b - test");
	}
	
	@Test (priority = 1)
	public void c_test()
	{
		System.out.println("c - test");
	}
	
	@Test 
	public void d_test()
	{
		System.out.println("d - test");
	}
	
	@Test (priority = 0)
	public void e_test()
	{
		System.out.println("e - test");
	}
	
}
