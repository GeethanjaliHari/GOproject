
package com.alphabet.gmail.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC011 {
	@Test
	public void test2()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}

}
