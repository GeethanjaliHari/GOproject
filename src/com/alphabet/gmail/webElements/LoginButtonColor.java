package com.alphabet.gmail.webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class LoginButtonColor extends BasicSettings {
public static void main(String[] args) {
	WebDriver driver=setUp();
	WebElement login=driver.findElement(By.id("loginButton"));
	String expectedColor="rgb(255, 255, 255)";
	String actualColor=login.getCssValue("color");
	System.out.println(actualColor);
	if(actualColor.equals(expectedColor))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
}
}
