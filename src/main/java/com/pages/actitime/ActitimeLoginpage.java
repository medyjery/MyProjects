package com.pages.actitime;



import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.actitime.Autocontant;
import com.generics.actitime.Basepage;
import com.generics.actitime.Excellibrary;

public class ActitimeLoginpage extends Basepage implements Autocontant
{
	
	public WebDriver driver;
	
	@FindBy(id="username")
	private WebElement usernameTextfield;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordTextfield;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepmeLoggedinCheckbox;
	
	@FindBy(xpath="//a[.='Login ']")
	private WebElement loginButton;
	
	public ActitimeLoginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	public void loginmethod() throws IOException
	{
		usernameTextfield.sendKeys(Excellibrary.getcellvalue(excel_path,sheet_name,1,0));
		passwordTextfield.sendKeys(Excellibrary.getcellvalue(excel_path, sheet_name, 1, 1));
		keepmeLoggedinCheckbox.click();
		loginButton.click();	
		
	}

}
