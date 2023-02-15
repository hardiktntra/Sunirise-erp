package Employeemodule;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Base;

public class Qualificationpage extends Base{
	
	
	
	@FindBy(xpath= "//span[normalize-space()='Master']")
	WebElement master; 
	
	@FindBy(xpath= "(//span[@class='ant-menu-title-content'][normalize-space()='Employee'])[1]")
	WebElement employee;
	
	@FindBy(xpath= "(//span[contains(@class,'ant-menu-title-content')][normalize-space()='Qualification'])[1]")
	WebElement qualification;

	
	
	
	//Element for Add button 
	@FindBy(xpath="//button[@type='button' and @class='ant-btn ant-btn-primary']")
	WebElement createbutton;
	
	//Element for Input Field 
	@FindBy(xpath="//input[@name='name']")
	WebElement Name;
	
	//Save Button
	@FindBy(xpath="//span[normalize-space()='Save']")
	WebElement Save;
	
	public Qualificationpage()
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
		action.moveToElement(qualification).click().perform();
		
	}
	
	public void CreatingQualification() throws InterruptedException
	{
		Thread.sleep(2000);
		createbutton.click();
		Name.sendKeys(prop.getProperty("Name"));
		Save.click();
	}

}
