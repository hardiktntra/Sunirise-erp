package Testcaseforgradings;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base;
import Gradingsmodule.Tableblackpage;
import LoginObjects.Loginpage;

public class TableBlackTc extends Base {
	Tableblackpage tbp;
	Loginpage lp;
	
	TableBlackTc()
	{
		super();
	}
	
	@BeforeMethod
	public void settingup() throws InterruptedException
	{
		initialisation();
		tbp = new Tableblackpage();
		lp = new Loginpage();
		Thread.sleep(2000);
	}
	
	@Test
	public void navigateandcreate() throws InterruptedException
	{
		lp.ValidateLogin();
		Thread.sleep(4000);
		tbp.navigate_to_module();
		
	}
}
