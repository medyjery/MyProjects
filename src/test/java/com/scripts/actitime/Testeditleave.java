package com.scripts.actitime;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.actitime.Basetest;
import com.pages.actitime.ActitimeHomepage;
import com.pages.actitime.Actitimeeditleave;



public class Testeditleave extends Basetest
{
	@Test
	public void editleavetype() throws InterruptedException, IOException
	{
		ActitimeHomepage home= new ActitimeHomepage(driver);
		home.settingsMethod();
		home.leavetypeMethod();
		
		Actitimeeditleave editleave= new Actitimeeditleave(driver);
		editleave.editleaveMethod();
		editleave.tickbuttonMethod();
		
	}

}
