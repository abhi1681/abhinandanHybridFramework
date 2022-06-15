package Testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag7 {
	
	 @Test(groups = "functional")
	  public void ft1() 
	  {
		  Reporter.log("ft1",true);
	  }
	  
	  @Test(groups="SMOKE")
	  public void st1() 
	  {
		  Reporter.log("st1",true);
	  }
	  
	  @Test(groups= "Integresstion")
	  public void it1() 
	  {
		  Reporter.log("it1",true);
		  
	  }
	  //------------------------------------------------------------------------------
	
	  @Test(groups = "functional")
	  public void ft2() 
	  {
		  Reporter.log("ft2",true);
	  }
	  
	  @Test(groups="SMOKE")
	  public void st2() 
	  {
		  Reporter.log("st2",true);
	  }
	  
	  @Test(groups= "Integresstion")
	  public void it2() 
	  {
		  Reporter.log("it2",true);
		  
		  
	  }
	//---------------------------------------------------------------------------------
	  
}
