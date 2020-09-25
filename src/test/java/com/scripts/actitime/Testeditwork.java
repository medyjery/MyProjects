package com.scripts.actitime;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.actitime.Basetest;
import com.pages.actitime.ActitimeEditworktype;
import com.pages.actitime.ActitimeHomepage;


public class Testeditwork extends Basetest
{
@Test
	
	public void editworktype() throws InterruptedException, IOException
	{
		
		ActitimeHomepage home= new ActitimeHomepage(driver);
		home.settingsMethod();
		home.typesofworkMethod();
		
		ActitimeEditworktype editwork =new ActitimeEditworktype(driver);
		editwork.worknameMethod();
		editwork.editworknameMethod();
		editwork.savechangesMethod();
		
	}
		
}
