package Testcaseforgradings;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base;
import Gradingsmodule.Crownwhitepage;
import Gradingsmodule.Tablewhitepage;
import LoginObjects.Loginpage;

public class CrownWhite extends Base {
	Crownwhitepage cwp;
	Loginpage lp;
	
	CrownWhite()
	{
		super();
	}
	
	@BeforeMethod
	public void settingup() throws InterruptedException
	{
		initialisation();
		cwp = new Crownwhitepage();
		lp = new Loginpage();
		Thread.sleep(2000);
	}
	
	@Test
	public void navigateandcreate() throws InterruptedException
	{
		lp.ValidateLogin();
		Thread.sleep(4000);
		cwp.navigate_to_module();
		
	}

}
