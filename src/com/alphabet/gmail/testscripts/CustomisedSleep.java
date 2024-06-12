package com.alphabet.gmail.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class CustomisedSleep extends BasicSettings{
public static void main(String[] args) {
	WebDriver driver=setUp();
	WebElement uName=driver.findElement(By.id("username"));
	WebElement pwd=driver.findElement(By.name("pwd"));
	WebElement login=driver.findElement(By.id("loginButton"));
	uName.sendKeys("admin");
	pwd.sendKeys("manager");
	login.click();
	for(int i=0; i<=20;i++)
	{
		try {
			driver.findElement(By.id("logoutLink")).click();
			break;
		}
		catch(NoSuchElementException e)
		{
			System.out.println("LogoutLink not present");
		}
	}
	
	//driver.close();
}
}
