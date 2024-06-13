package com.alphabet.gmail.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Parameterisation {
	WebDriver driver;
	@BeforeTest
	public void OpenApp()
	{
		System.setProperty("webdriver.chrome.driver",  "./drivers/chromeDriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actiTime.com");
	}
	@Test
	public void loginApp(String uName, String pwd)
	{
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.id("loginButton")).click();
	}
	
	@AfterMethod
	public void closeApp()
	{
		driver.close();
	}

}
