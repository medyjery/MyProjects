package com.pages.actitime;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.actitime.Autocontant;
import com.generics.actitime.Basepage;



public class ActitimeHomepage extends Basepage implements Autocontant
{
	
	private WebDriver driver;

	
	@FindBy (id="container_tasks")
	private WebElement tasksLink;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[2]")
	private WebElement settingsLink;
	
	@FindBy(xpath="//a[.='Types of Work']")
	private WebElement typesofworkLink;
	
	@FindBy(xpath="//a[contains(text(),'Leave Types')]")
	private WebElement leavetypeLink;
	
	@FindBy(id="logoutLink")
	private WebElement logoutbutton;
	
	
	public ActitimeHomepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void tasksMethod() 
	{
		tasksLink.click();
	}
	public void settingsMethod() throws InterruptedException  
	{
		Thread.sleep(3000);
		settingsLink.click();
	}
	public void typesofworkMethod() throws InterruptedException
	{
		Thread.sleep(5000);
		typesofworkLink.click();
	}
	public void leavetypeMethod() throws InterruptedException
	{
		Thread.sleep(5000);
		leavetypeLink.click();
	}
	public void logoutMethod() throws InterruptedException
	{
		Thread.sleep(3000);
		logoutbutton.click();
	}

}
