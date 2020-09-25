package com.generics.actitime;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.pages.actitime.ActitimeHomepage;
import com.pages.actitime.ActitimeLoginpage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basetest implements Autocontant
{
public WebDriver driver;

    @BeforeClass
    
	public void openbrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	
	}
		@AfterClass
		public void closebrowser()
		{
			driver.quit();
		
		}
		@BeforeMethod
		public void login() throws IOException
		{
			ActitimeLoginpage login1=new ActitimeLoginpage(driver);
			login1.loginmethod();
			}
		@AfterMethod
		public void logout() throws InterruptedException
		{
			ActitimeHomepage home=new ActitimeHomepage(driver);
			home.logoutMethod();
		}
	}


		
	
	


