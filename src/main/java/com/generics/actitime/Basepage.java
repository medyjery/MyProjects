package com.generics.actitime;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Basepage 
{public WebDriver driver;
public void selectbyvisibletext(WebElement element, String text)
{
	Select sel= new Select(element);
	sel.selectByVisibleText(text);
}
public void selectbyvalue(WebElement element, String value)
{
	Select sel =new Select(element);
	sel.selectByValue(value);
}
public void selectbyindex(WebElement element, int index)
{
	Select sel =new Select(element);
	sel.selectByIndex(index);
}
public void movetoelment(WebDriver driver,WebElement element)
{
	Actions act = new Actions(driver);
	act.moveToElement(element).perform();
}
public void fetchtitle()
{
	System.out.println(driver.getTitle());
}
public void robotenter() throws AWTException
{
	Robot r= new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
}
 public void alert(WebDriver driver)
 {
	 this.driver=driver;
	 Alert alt= driver.switchTo().alert();
	 alt.accept();
 }

}