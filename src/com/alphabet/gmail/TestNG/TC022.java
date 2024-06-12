package com.alphabet.gmail.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//SoftAssert
public class TC022 {
@Test
public void testValidLogin()
{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com/");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	SoftAssert sa=new SoftAssert();
	sa.assertEquals(driver.getTitle(), "actiTIME -   Enter Time-Track", "Incorrect tilte");
	Reporter.log(driver.getCurrentUrl(), true);
	sa.assertAll();// --> If you dont mention it will show TC is passed and it will not throw assertException if assert stmt is failed
}
}
