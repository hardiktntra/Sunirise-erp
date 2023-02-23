package Testcaseforgradings;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base;
import Gradingsmodule.Crownopenpage;
import LoginObjects.Loginpage;

public class CrownopenTc extends Base{
	Crownopenpage cop;
	Loginpage lp;
	
	CrownopenTc()
	{
		super();
	}
	
	@BeforeMethod
	public void settingup() throws InterruptedException
	{
		initialisation();
		cop = new Crownopenpage();
		lp = new Loginpage();
		Thread.sleep(2000);
	}
	
	@Test
	public void navigateandcreate() throws InterruptedException
	{
		lp.ValidateLogin();
		Thread.sleep(4000);
		cop.navigate_to_module();
		
	}

}
