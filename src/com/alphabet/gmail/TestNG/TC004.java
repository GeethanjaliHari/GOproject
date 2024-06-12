package com.alphabet.gmail.TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC004 {
	@Test(description="Dummy TC 2")
	public void test2()
	{
		Reporter.log("Running test2", true);
	}

}
