package com.pages.actitime;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.actitime.Autocontant;
import com.generics.actitime.Basetest;
import com.generics.actitime.Excellibrary;


public class Actitimeeditleave extends Basetest implements Autocontant 
{
	
	
	@FindBy(xpath="//input[@id='inputDiv']")
	private WebElement editleaveTextfield;
	
	@FindBy(xpath="//span[.='cba']")
	private WebElement editleavelink;
	
	@FindBy(xpath="(//div[@class='applyButton'])[2]")
	private WebElement tickbutton;
	
	@FindBy(xpath="(//div[@class='cancelButton'])[3]")
	private WebElement Xbutton;
	
	public Actitimeeditleave(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void editleaveMethod() throws IOException 
	{
		editleavelink.click();
		editleaveTextfield.clear();
		editleaveTextfield.sendKeys(Excellibrary.getcellvalue(excel_path, leave_sheet, 1, 1));
		
	}
	
	public void tickbuttonMethod()
	{
		tickbutton.click();
	}

}
