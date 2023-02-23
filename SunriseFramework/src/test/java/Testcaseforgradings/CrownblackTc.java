package Testcaseforgradings;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base;
import Gradingsmodule.Crownblackpage;
import Gradingsmodule.Crownwhitepage;
import LoginObjects.Loginpage;

public class CrownblackTc extends Base{
  
	Crownblackpage cbp;
	Loginpage lp;
	
	CrownblackTc()
	{
		super();
	}
	
	@BeforeMethod
	public void settingup() throws InterruptedException
	{
		initialisation();
		cbp = new Crownblackpage();
		lp = new Loginpage();
		Thread.sleep(2000);
	}
	
	@Test
	public void navigateandcreate() throws InterruptedException
	{
		lp.ValidateLogin();
		Thread.sleep(4000);
		cbp.navigate_to_module();
		
	}

	
}
