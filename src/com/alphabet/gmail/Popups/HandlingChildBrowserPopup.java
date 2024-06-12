package com.alphabet.gmail.Popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class HandlingChildBrowserPopup extends BasicSettings {
public static void main(String[] args) {
	WebDriver driver=setUp();
	driver.findElement(By.linkText("actiTIME Inc.")).click();
	String expectedTitle="actiTIME - Time Tracking Software for Cost-Effective Projects";
	Set<String> windowIDs=driver.getWindowHandles();
	for(String windowID:windowIDs)
	{
		driver.switchTo().window(windowID);
		if(driver.getTitle().equals(expectedTitle))
		{
			break;
		}
	}
}
}
