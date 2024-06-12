package com.alphabet.gmail.HandleAutoSuggestions;

import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class ClickOnCurrentlyFocusedEle extends BasicSettings
{
	public static void main(String[] args) 
	{
	WebDriver driver=setUp("chrome","https://www.google.com/");
	driver.switchTo().activeElement().click();
	}

}
