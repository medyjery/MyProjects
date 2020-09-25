package com.scripts.actitime;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.actitime.Basetest;
import com.pages.actitime.ActitimeHomepage;
import com.pages.actitime.Actitimecreateaworkpage;



public class Testcreatwork extends Basetest
{
   @Test
   public void work() throws IOException, InterruptedException
   {
		
		ActitimeHomepage home = new ActitimeHomepage(driver);
		home.settingsMethod();
		home.typesofworkMethod();
		
		Actitimecreateaworkpage work = new Actitimecreateaworkpage(driver);
		work.createtypeMethod();
		work.nameMethod();
		work.createtypeofworkMethod();

		
   }
}
