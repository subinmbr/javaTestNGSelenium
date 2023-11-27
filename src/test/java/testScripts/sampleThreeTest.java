package testScripts;

import org.testng.annotations.Test;

public class sampleThreeTest {
  @Test
  public void testOne() {
	  
	  System.out.println("test one printing");
	  
	  
  }
  @Test(groups="featureOne")
  public void testTwo() {
	
	  
	  long d= Thread.currentThread().getId();
	  
	  System.out.println("thread id is  ..  .. . . . . "+ d);
	  
	  
  }
  
  
  @Test
  public void testThree() {
	  
	  System.out.println("test three printing");
	  
	  
  }
  @Test(groups="featureOne")
  public void testFour() {
	  
 long d2= Thread.currentThread().getId();
	  
	  System.out.println("thread id is  ..  .. . . . . "+ d2);
	  
	  
	  
	  System.out.println("test four printing");
	  
	  
  }
  
}
