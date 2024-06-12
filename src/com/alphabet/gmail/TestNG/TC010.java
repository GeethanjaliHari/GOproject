package com.alphabet.gmail.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC010 {
	@Test
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actiTime.com");
		
	}

}
