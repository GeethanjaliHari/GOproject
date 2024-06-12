package com.alphabet.gmail.TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

//Handling Dependencies
public class TC009 {
	@Test
	public void login()
	{
		Reporter.log("login method", true);
	//	throw new IllegalAccessError(); //If there is an issue with login, then other two test methods will not execute
		
	}
	
	@Test(dependsOnMethods={"login"})
	public void createCustomer()
	{
		Reporter.log("createCustomer method", true);
	}
	
	@Test(dependsOnMethods= {"createCustomer"})
	public void deleteCustomer()
	{
		Reporter.log("deleteCustomer method", true);
	}
	@Test(dependsOnMethods= {"createCustomer"})
	public void addTask()
	{
		Reporter.log("addTask method", true);
	}
	

}
