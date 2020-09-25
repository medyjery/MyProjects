package com.scripts.actitime;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.actitime.Basetest;
import com.pages.actitime.ActitimeLoginpage;

public class TestActitimelogin extends Basetest 
{
	@Test
	public void login() throws IOException
	{
		ActitimeLoginpage login= new ActitimeLoginpage(driver);
		login.loginmethod();
	}

}
