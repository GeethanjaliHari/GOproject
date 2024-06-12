package com.alphabet.gmail.testscripts;

import org.openqa.selenium.WebDriver;

public class MyClass {
	
		public static void genericMethod(WebDriver driver)
		{
			driver.get("https://www.google.com");
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			driver.close();
		}
}
