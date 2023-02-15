package Testcaseforemployee;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.Base;
import LoginObjects.Loginpage;
import Employeemodule.Qualificationpage;

public class QualificationTC extends Base{
	Loginpage lp;
	Qualificationpage qp;
	
	QualificationTC()
	{
		super();
	}
	
	
  @BeforeTest
  public void settingup() throws InterruptedException
  {
	  initialisation();
	  lp = new Loginpage();
	  qp = new Qualificationpage();
	  Thread.sleep(2000);
  }
  @Test
  public void NavigateandcreateQualification() throws InterruptedException {
	  lp.ValidateLogin();
	  qp.navigate_to_module();
	  qp.CreatingQualification();
  }
}
