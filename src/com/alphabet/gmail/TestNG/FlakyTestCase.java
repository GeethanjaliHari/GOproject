package com.alphabet.gmail.TestNG;
/*Flacky Test case means if we want to run the same test case for same test data multiple 
 times we use a parameter called "invocationCount" in @Test method  */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class FlakyTestCase extends BasicSettings {
	final static int a=3;
	@Test(invocationCount=a, description="Flaky TC")
	public void testLogin()
	{
		WebDriver driver=setUp();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	}
	
/* Properties of invocationCount
 	1. If we want to execute the same test case with same test data multiple times
 		we use invocationCount in @test method
 	2. Default invocationCount =1
 	3. invocationCount cannot be 0 or -1, or decimal
 	4. Variables are not allowed but final variables are allowed
 		ex: int a=3;
 			@Test(invocationCount=a, description="--------") not allowed
 		
 		ex2: final static int a=3;
 		@Test(invocationCount=a, description="--------") is allowed
 */
}
