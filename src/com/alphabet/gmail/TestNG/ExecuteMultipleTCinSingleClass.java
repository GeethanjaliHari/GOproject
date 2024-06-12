package com.alphabet.gmail.TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ExecuteMultipleTCinSingleClass {
	@Test(priority=1)
	public void ghi()
	{
		Reporter.log("Running ghi() successfully", true);
	}
	@Test(priority=0)
	public void abc()
	{
		Reporter.log("Running abc() successfully", true);
	}
	
	@Test(priority=-1)
	public void xyz()
	{
		Reporter.log("Running xyz() successfully", true);
	}

}
/* If priority is not mentioned, then order of execution will be in alphabetical order
-->If we want to execute on user's wish we use priority.
--> Default priority =0
--> Priority can be -ve number
--> Priority cannot be decimal or variable
--> If all are having same priority, then order of execution will be in alphabetical order
--> Test case is executed in Ascending order */