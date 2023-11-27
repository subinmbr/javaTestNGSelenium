package parellelScripts;

import org.testng.annotations.Test;
//testScripts.sampleFourTest
public class samplethree {
	
	 @Test
	  public void testfive() {
		  
		  System.out.println("test five printing");
		  
		  
	  }
	  @Test(groups="featureOne")
	  public void testsix() {
		  
		  System.out.println("test six printing");
		  
		  
	  }
	  @Test
	  public void testseven() {
		  
		  System.out.println("test seven printing");
long d= Thread.currentThread().getId();
		  
		  System.out.println("thread id is  ..  .. . . . . "+ d);
		  
		  
	  }
	  @Test
	  public void testEight() {
		  
		  System.out.println("test eight printing");
		  
		  
	  }
	
	
}

