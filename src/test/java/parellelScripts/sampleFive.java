package parellelScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//testScripts.sampleFourTest
public class sampleFive {
	
	
	WebDriver driver;
	@Parameters
	public void setup (String strBrowser)
	
	
	{
		
		if (strBrowser.equalsIgnoreCase("chrome")) {
			
			driver= new ChromeDriver();
			
		}
		else if (strBrowser.equals("edge"))
		{
			
			driver= new EdgeDriver();
			
		}
			
		
	}
	
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
		  
		  
	  }
	  @Test
	  public void testEight() {
		  
		  System.out.println("test eight printing");
		  
		  long d= Thread.currentThread().getId();
		  
		  System.out.println("thread id is  ..  .. . . . . "+ d);
	  }
	
	
}

