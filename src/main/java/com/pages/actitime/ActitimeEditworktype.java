package com.pages.actitime;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.actitime.Autocontant;
import com.generics.actitime.Basetest;
import com.generics.actitime.Excellibrary;

public class ActitimeEditworktype extends Basetest implements Autocontant
{
	
	@FindBy(xpath="//a[.='cda']")
	private WebElement worknamebutton;
	
	@FindBy(xpath="//input[@id='name']")
	private WebElement editworknameTextfield;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement savechangeButton;
	
	@FindBy(xpath="//input[@value='      Cancel      ']")
	private WebElement editcancellbutton;
	
	public ActitimeEditworktype(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void worknameMethod()
	{
		worknamebutton.click();
	}
	public void editworknameMethod() throws IOException
	{
		editworknameTextfield.clear();
		editworknameTextfield.sendKeys(Excellibrary.getcellvalue(excel_path, work_sheet, 1,1));
	}
	public void savechangesMethod()
	{
	savechangeButton.click();	
	}
	public void editcancelMethod()
	{
		editcancellbutton.click();
	}
	

}
