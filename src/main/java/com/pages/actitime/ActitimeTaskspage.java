package com.pages.actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeTaskspage {
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addnewButton;
	
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement newcustomerButton;
	
	
	public ActitimeTaskspage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void addnewMethod() throws InterruptedException
	{
		addnewButton.click();
	}
	public void newcustomerMethod()
	{
		newcustomerButton.click();
	}


}
