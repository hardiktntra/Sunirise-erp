package Testcaseforemployee;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base;
import Employeemodule.Designationpage;
import LoginObjects.Loginpage;
import Testcases.Logintestcase;

public class Navigatetodesignation extends Base{
	Designationpage dp;
	Loginpage lp;
	
	Navigatetodesignation()
	{
		super();
	}
	
	@BeforeMethod
	public void settingup() throws InterruptedException
	{
		initialisation();
		dp = new Designationpage();
		lp = new Loginpage();
		Thread.sleep(2000);
	}
	
	@Test
	public void navigate() throws InterruptedException
	{
		lp.ValidateLogin();
		Thread.sleep(4000);
		dp.navigate_to_module();
		dp.CreatingDesignation();
	}

}

