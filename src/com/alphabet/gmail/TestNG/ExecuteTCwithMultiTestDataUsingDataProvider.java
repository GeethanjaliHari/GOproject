package com.alphabet.gmail.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

/* DataProvider: --> Provides the data for the test case
 --> fetches the data from the array and injects the data subarray by 
 subarray to test data method
 No of exe=total number of subarrays
 --> If we want to execute the same test cases multiple times for different
 test dat, we use annotation called @DataProvider
 --> Return type of DataProvider==> 2dimensional array of any type.
*/
public class ExecuteTCwithMultiTestDataUsingDataProvider extends BasicSettings{
	@DataProvider(name="Credentials")
	public Object[][] getData()
	{
		Object[][] arr= { {"admin", "manager"}, 
							{"trainer", "trainee"},
							{ "geetha", "geetha@123"},
							{"Harish", "harish12345678"},
							{"ANJALIPRASAD","anju"}};
		return arr;
							
	}
	
	@Test(dataProvider="Credentials", description="execute same TC multiple times with different test data")
	public void testMultipleLogins(String uName, String pwd)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.id("loginButton")).click();
		mySleepInSeconds(5);
		
		
		
	}
}

