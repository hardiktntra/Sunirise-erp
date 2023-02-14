package Employeemodule;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Base;

public class Designationpage extends Base{
	//Navigation to Designation page
	
	@FindBy(xpath= "//span[normalize-space()='Master']")
	WebElement master; 
	
	@FindBy(xpath= "(//span[@class='ant-menu-title-content'][normalize-space()='Employee'])[1]")
	WebElement employee;
	
	@FindBy(xpath= "(//span[contains(@class,'ant-menu-title-content')][normalize-space()='Designation'])[1]")
	WebElement designation;

	
	
	
	//Element for Add button 
	@FindBy(xpath="")
	WebElement createbutton;
	
	//Element for Create button 
	@FindBy(xpath="")
	WebElement Name;
	
	
	public Designationpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void navigate_to_module() throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.moveToElement(master).perform();
		Thread.sleep(2000);
		action.moveToElement(employee).perform();
		Thread.sleep(2000);
		action.moveToElement(designation).click().perform();
	}
	

}
