package com.pages.actitime;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.actitime.Autocontant;
import com.generics.actitime.Basepage;
import com.generics.actitime.Excellibrary;




public class Actitimecreateleavepage extends Basepage implements Autocontant
{
	
	public WebDriver driver;
	
	@FindBy(xpath="//span[contains(text(),'Create Leave Type')]")
	private WebElement createleavetypeLink;
	
	@FindBy(xpath="//input[@id='leaveTypeLightBox_nameField']")
	private WebElement nameTextfield;
	
	@FindBy(xpath="(//span[.='Create Leave Type'])[2]")
	private WebElement leavetypeButton;
	
	@FindBy(xpath="//div[@id='leaveTypeLightBox_cancelBtn']")
	private WebElement cancelButton;
	
	@FindBy(xpath="(//span[.='abc'])[1]/../../../../../..//td[@class='leaveTypeDeleteCell last']")
	private WebElement leavedeleteButton;

	
	
	public Actitimecreateleavepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void createleavetypeMethod()
	{
		createleavetypeLink.click();
	}
	public void leavenameMethod() throws IOException
	{
		nameTextfield.sendKeys(Excellibrary.getcellvalue(excel_path, leave_sheet, 1, 0));
	}
	public void leavetypemethod() 
	{
		leavetypeButton.click();		
	}
	public void cancelMethod()
	{
		cancelButton.click();
	}
	public void leavedeleteMethod() throws InterruptedException 
	{
		leavedeleteButton.click();
		alert(driver);
	
	}
}


