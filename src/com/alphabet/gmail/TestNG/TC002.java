package com.alphabet.gmail.TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC002 {
	@Test(description="Test case to test valid login using valid credentials")
	public void testValidLogin()
	{
		//Reporter.log("Running testValidLogin method");// to print on reporter output in index.html
		Reporter.log("Running testValidLogin method", true);// to print both on reporter output and console tab
		
	}

}
