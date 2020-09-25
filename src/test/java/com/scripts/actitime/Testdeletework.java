package com.scripts.actitime;

import org.testng.annotations.Test;

import com.generics.actitime.Basetest;
import com.pages.actitime.ActitimeHomepage;
import com.pages.actitime.Actitimecreateaworkpage;



public class Testdeletework extends Basetest
{
	@Test
	public void deletework() throws InterruptedException
	{
		ActitimeHomepage home=new ActitimeHomepage(driver);
		home.settingsMethod();
		home.typesofworkMethod();
		
		Actitimecreateaworkpage delete= new Actitimecreateaworkpage(driver);
		
		delete.workdeleteMethod();
		
		
	
		
		
	}

		
	}		

