package com.alphabet.gmail.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class SelectCheckbox extends BasicSettings {
public static void main(String[] args) {
	WebDriver driver=setUp();
	WebElement checkbox=driver.findElement(By.id("keepLoggedInCheckBox"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	mySleepInSeconds(4);
	js.executeScript("arguments[0].checked='true';", checkbox);
	mySleepInSeconds(2);
	js.executeScript("arguments[0].click();", checkbox);
	driver.close();
}
}
