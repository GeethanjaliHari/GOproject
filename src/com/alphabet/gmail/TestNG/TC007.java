package com.alphabet.gmail.TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC007 {
	@BeforeMethod(alwaysRun=true)
	public void login()
	{
		Reporter.log("Login", true);
	}
	@Test(groups= {"customer", "smoke"})
	public void createCustomer()
	{
		Reporter.log("TC to createCustomer", true);
	}

	@Test(groups= {"customer"})
	public void deleteCustomer()
	{
		Reporter.log("TC to deleteCustomer", true);
	}
	
	@Test(groups= {"customer", "smoke"})
	public void createProject()
	{
		Reporter.log("TC to createProject", true);
	}

	@Test(groups= {"customer"})
	public void deleteProject()
	{
		Reporter.log("TC to deleteProject", true);
	}
	
	@AfterMethod(alwaysRun=true)
	public void logOut()
	{
		Reporter.log("Logout", true);
	}

}
