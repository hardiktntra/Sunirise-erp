package Testcaseforgradings;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base;
import Gradingsmodule.Pavillionopenpage;
import LoginObjects.Loginpage;

public class PavillionopenTc extends Base{
	Pavillionopenpage pop;
	Loginpage lp;
	
	
	
	PavillionopenTc()
	{
		super();
	}
	
	@BeforeMethod
	public void settingup() throws InterruptedException
	{
		initialisation();
		pop = new Pavillionopenpage();
		lp = new Loginpage();
		Thread.sleep(2000);
	}
	
	@Test
	public void navigateandcreate() throws InterruptedException
	{
		lp.ValidateLogin();
		Thread.sleep(4000);
		pop.navigate_to_module();
		
	}
}
