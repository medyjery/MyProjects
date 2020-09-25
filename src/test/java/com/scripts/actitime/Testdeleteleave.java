package com.scripts.actitime;

import org.testng.annotations.Test;

import com.generics.actitime.Basetest;
import com.pages.actitime.ActitimeHomepage;
import com.pages.actitime.Actitimecreateleavepage;



public class Testdeleteleave extends Basetest
{
	@Test
	public void deleteleave() throws InterruptedException
	{
				
		ActitimeHomepage home = new ActitimeHomepage(driver);
		home.settingsMethod();
		home.leavetypeMethod();
		
		Actitimecreateleavepage delete= new Actitimecreateleavepage(driver);
		delete.leavedeleteMethod();
	
	}
}


	

