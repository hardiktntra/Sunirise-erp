package Testcaseforgradings;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base;
import Gradingsmodule.Tableopenpage;
import LoginObjects.Loginpage;

public class TableOpenTc extends Base{
	Tableopenpage top;
	Loginpage lp;
	
	TableOpenTc()
	{
		super();
	}
	
	@BeforeMethod
	public void settingup() throws InterruptedException
	{
		initialisation();
		top = new Tableopenpage();
		lp = new Loginpage();
		Thread.sleep(2000);
	}
	
	@Test
	public void navigateandcreate() throws InterruptedException
	{
		lp.ValidateLogin();
		Thread.sleep(4000);
		top.navigate_to_module();
		
	}
}
