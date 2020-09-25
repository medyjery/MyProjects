package com.pages.actitime;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.actitime.Autocontant;
import com.generics.actitime.Basepage;
import com.generics.actitime.Excellibrary;


public class ActitimeCreatnewCustomerpage extends Basepage implements Autocontant
{
	
	public WebDriver driver;
	
	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
	private WebElement customernameTextfield;
	
	@FindBy(xpath="//div[contains(text(),'Create Customer')]")
	private WebElement creatcustomerButton;
	
	@FindBy(xpath="//div[@class='greyButton cancelBtn']")
	private WebElement cancelButton;
	
	public ActitimeCreatnewCustomerpage(WebDriver driver)
	{
		this.driver=driver;
				
		PageFactory.initElements(driver, this);
	}
	
	public void customernameMethod() throws IOException, InterruptedException 
	{
		Thread.sleep(3000);
		customernameTextfield.sendKeys(Excellibrary.getcellvalue(excel_path, customer_sheet, 1, 0));	
	}

	public void creatcustomer() 
	{
		creatcustomerButton.click();
		
		
	}

		
	}
	
	
	
	
	


