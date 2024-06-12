package com.alphabet.gmail.TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC003 {
	@Test(description="Dummy TC 1")
	public void test1()
	{
		Reporter.log("Running test1", true);
	}

}
