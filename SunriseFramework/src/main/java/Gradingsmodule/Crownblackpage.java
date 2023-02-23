package Gradingsmodule;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Base;

public class Crownblackpage extends Base{
	
	
	@FindBy(xpath= "//span[normalize-space()='Master']")
	WebElement master; 
	
	@FindBy(xpath= "//span[text()='Gradings']")
	WebElement Gradings;
	
	@FindBy(xpath= "//span[text()='Crown Black']")
	WebElement Crownblack;
	
	public Crownblackpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void navigate_to_module() throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.moveToElement(master).perform();
		Thread.sleep(2000);
		action.moveToElement(Gradings).perform();
		Thread.sleep(2000);
		action.moveToElement(Crownblack).click().perform();
		
	}

}
