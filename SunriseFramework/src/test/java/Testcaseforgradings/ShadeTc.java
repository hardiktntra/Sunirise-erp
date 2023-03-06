package Testcaseforgradings;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base;
import Gradingsmodule.Shadepage;
import LoginObjects.Loginpage;

public class ShadeTc extends Base{
	
	Shadepage sp;
	Loginpage lp;
	
	ShadeTc()
	{
		super();
	}
	
	@BeforeMethod
	public void settingup() throws InterruptedException
	{
		initialisation();
		sp = new Shadepage();
		lp = new Loginpage();
		Thread.sleep(2000);
	}
	
	@Test
	public void navigateandcreate() throws InterruptedException
	{
		lp.ValidateLogin();
		Thread.sleep(4000);
		sp.navigate_to_module();
	}
 
}
