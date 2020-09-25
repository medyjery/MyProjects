package com.scripts.actitime;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.actitime.Basetest;
import com.pages.actitime.ActitimeCreatnewCustomerpage;
import com.pages.actitime.ActitimeHomepage;
import com.pages.actitime.ActitimeTaskspage;



public class Testcreatcustomer extends Basetest
{
       @Test
       public void customer() throws IOException, InterruptedException
       {
    	   
    	   ActitimeHomepage home = new ActitimeHomepage(driver);
    	   home.tasksMethod();
    	   
    	   ActitimeTaskspage task =new ActitimeTaskspage(driver);
    	   task.addnewMethod();
    	   task.newcustomerMethod();
    	   
    	   ActitimeCreatnewCustomerpage customer= new ActitimeCreatnewCustomerpage(driver);
   		   customer.customernameMethod();
   		   customer.creatcustomer();
   		
   		
       }

}
