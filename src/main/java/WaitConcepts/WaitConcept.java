package WaitConcepts;

public class WaitConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Types of Wait
		
		//1. Static Wait : Thread.sleep(5000);  - elem found within 2 sec -> wait will continue for rest 3 sec
		//2. Dynamic Wait : - time out (10 sec) - elem found in 2sec -> rest 8 sec will be ingnored
			//2.a : Implicit Wait  : 	
			//2.b : Explicit Wait :
				  //2.b.1 : WebDriverWait :
				  //2.b.2 : FluentWait : 
	
		// WebDriverWait(Class) -> Extending -> FluentWait (Class) -> Implements -> Wait (I) ->  until(method)
	}

}
