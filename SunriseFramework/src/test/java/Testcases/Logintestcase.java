package Testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.Base;
import LoginObjects.Loginpage;

public class Logintestcase extends Base{
  Loginpage lp;
	

  public Logintestcase()
  {
	  super();
  }
  
  @BeforeMethod
  public void browsersetup() throws InterruptedException
  {
	initialisation();  
	lp = new Loginpage();
	Thread.sleep(3000);
  }
	
  @Test
  public void login() {
	  lp.ValidateLogin();
  }
}
