package com.alphabet.gmail.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class ChangePlaceholderOfTF extends BasicSettings{
public static void main(String[] args) {
	WebDriver driver=setUp();
	WebElement uName=driver.findElement(By.id("username"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].placeholder='Enter username';", uName);
	mySleepInSeconds(2);
	driver.close();
}
}
