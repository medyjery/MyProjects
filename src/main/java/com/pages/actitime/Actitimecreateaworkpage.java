package com.pages.actitime;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.actitime.Autocontant;
import com.generics.actitime.Basepage;
import com.generics.actitime.Excellibrary;



public class Actitimecreateaworkpage extends Basepage implements Autocontant 
{
public WebDriver driver;
	
	@FindBy(xpath="//span[.='Create Type of Work']")
	private WebElement createtypeLink;
	
	@FindBy(xpath="//input[@name='name']")
	private WebElement nameTextfielde;
	
	@FindBy(xpath="//input[@value='   Create Type of Work   ']")
	private WebElement createtypeofworkButton;
	
	@FindBy(xpath="//input[@value='      Cancel      ']")
	private WebElement cancelButton;
	
	@FindBy(xpath="//a[.='abc']/../..//a[contains(text(),'delete')]")
	private WebElement workdeleteButton;
	
	public Actitimecreateaworkpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void createtypeMethod() 
	{		
		createtypeLink.click();
		
	}
	public void nameMethod() throws IOException
	{
		nameTextfielde.sendKeys(Excellibrary.getcellvalue(excel_path, work_sheet, 1,0));
	}
	public void createtypeofworkMethod()
	{
		createtypeofworkButton.click();
	}
	public void cancelMethod()
	{
		cancelButton.click();
	}
	public void workdeleteMethod()
	{
		workdeleteButton.click();
		alert(driver);	
	}
	
	}
				
	
	
	


