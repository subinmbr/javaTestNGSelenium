package parellelScripts;

import org.testng.annotations.Test;
//testScripts.sampleFourTest
public class sampleFourTest {
	
	 @Test
	  public void testfive() {
		  
		  System.out.println("test five printing");
		  
		  
	  }
	  @Test(groups="featureOne")
	  public void testsix() {
		  
		  System.out.println("test six printing");
		  
		  
	  }
	  @Test(invocationCount = 5,threadPoolSize= 2,timeOut= 5000 )
	  public void testseven() {
		  
		  System.out.println("test seven printing");
		  
		  
	  }
	  @Test
	  public void testEight() {
		  
		  System.out.println("test eight printing");
		  
 long d= Thread.currentThread().getId();
		  
		  System.out.println("thread id is  ..  .. . . . . "+ d);
	  }
	
	
}

