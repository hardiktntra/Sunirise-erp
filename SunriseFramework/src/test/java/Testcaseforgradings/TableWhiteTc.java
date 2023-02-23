package Testcaseforgradings;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base;
import Gradingsmodule.Tablewhitepage;
import LoginObjects.Loginpage;

public class TableWhiteTc extends Base{
	Tablewhitepage twp;
	Loginpage lp;
	
	TableWhiteTc()
	{
		super();
	}
	
	@BeforeMethod
	public void settingup() throws InterruptedException
	{
		initialisation();
		twp = new Tablewhitepage();
		lp = new Loginpage();
		Thread.sleep(2000);
	}
	
	@Test
	public void navigateandcreate() throws InterruptedException
	{
		lp.ValidateLogin();
		Thread.sleep(4000);
		twp.navigate_to_module();
		
	}

}
