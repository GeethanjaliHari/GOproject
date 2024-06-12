package com.alphabet.gmail.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class EnterDataIntoTF extends BasicSettings{
public static void main(String[] args) {
	WebDriver driver=setUp();
	WebElement uName=driver.findElement(By.id("username"));
	WebElement login=driver.findElement(By.id("loginButton"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].value='admin';"+
					"arguments[1].click();", uName, login);
	mySleepInSeconds(4);
	driver.close();
}
}
