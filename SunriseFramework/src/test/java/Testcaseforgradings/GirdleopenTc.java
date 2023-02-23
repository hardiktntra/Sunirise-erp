package Testcaseforgradings;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base;
import Gradingsmodule.Girdleopenpage;
import LoginObjects.Loginpage;

public class GirdleopenTc extends Base{
	Girdleopenpage gop;
	Loginpage lp;
	
	GirdleopenTc()
	{
		super();
	}
	
	@BeforeMethod
	public void settingup() throws InterruptedException
	{
		initialisation();
		gop = new Girdleopenpage();
		lp = new Loginpage();
		Thread.sleep(2000);
	}
	
	@Test
	public void navigateandcreate() throws InterruptedException
	{
		lp.ValidateLogin();
		Thread.sleep(4000);
		gop.navigate_to_module();
		
	}
}
