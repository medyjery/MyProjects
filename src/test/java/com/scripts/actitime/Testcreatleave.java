package com.scripts.actitime;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.actitime.Basetest;
import com.pages.actitime.ActitimeHomepage;
import com.pages.actitime.Actitimecreateleavepage;



public class Testcreatleave extends Basetest
{
	@Test
	public void leave() throws InterruptedException, IOException
	{
		ActitimeHomepage home = new ActitimeHomepage(driver);
		home.settingsMethod();
		home.leavetypeMethod();
		
		Actitimecreateleavepage leave= new Actitimecreateleavepage(driver);
		leave.createleavetypeMethod();
		leave.leavenameMethod();
		leave.leavetypemethod();
		
	}
		

}
