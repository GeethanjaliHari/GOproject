package com.alphabet.gmail.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//Parameterization --> Refer testng5.xml
public class TC008 {
	WebDriver driver;
	@BeforeTest
	public void openApp()
	{
		System.setProperty("WebDriver.chrome.driver", "./drivers/chromeDriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
	}
	@Parameters({"username", "password"})
	@Test
	public void LoginToApp(@Optional("trainee")String uName, @Optional("trainee") String pwd)
	{
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.id("loginButton")).click();
	}

	@AfterTest
	public void closeApp()
	{
		driver.close();
	}
}
