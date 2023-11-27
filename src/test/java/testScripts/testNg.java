package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;




public class testNg {
	
	WebDriver driver = new ChromeDriver();
	
	
  @Test()
  public void googletest() {
	  
	  
	  
	  driver.get("https://www.google.com/");
	  
	  SoftAssert softassert = new SoftAssert();
	  
	  softassert.assertEquals(driver.getTitle(),"GoogleTest" );
	  
	  System.out.println("pririty 3 api someting");
	  System.out.println("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");
	  
	  
	  driver.close();
	  
  }
  
	  
	  
	  @Test(alwaysRun = true,dependsOnMethods ="appiumtest")
	  public void seleniumtest() {
		  
		  
		  
		  driver.get("https://www.google.com/");
		  
		 SoftAssert softassert = new SoftAssert();
		  
		 softassert.assertEquals(driver.getTitle(),"GoogleTest" );
		  
		  System.out.println("seleniumtest");
		  
		  
	
		  
		  
	  }
		  
		  
		  @Test( )
		  public void appiumtest() {
			  
			  
			  	  driver.get("https://www.google.com/");
		  
			  SoftAssert softassert = new SoftAssert();
		  
			  softassert.assertEquals(driver.getTitle(),"GoogleTest" );			  
			  System.out.println(" appiumtest "); 
			  
			  
		  }
			  
			  @Test( )
			  public void prioritytest() {
				  
				  
				  
				 driver.get("https://www.google.com/");
				  
				  SoftAssert softassert = new SoftAssert();
				  
				  softassert.assertEquals(driver.getTitle(),"GoogleTest" );
				  
				  System.out.println("prioritytest");
				  Assert.assertEquals(driver.getTitle(), "GoogleTest");
				    
			  
	  
	  
  }
}
