package com.alphabet.gmail.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class CheckEditLabelsDisplayed extends BasicSettings{
public static void main(String[] args) {
	WebDriver driver=setUp("chrome", "https://www.trello.com/login");
	WebElement uName=driver.findElement(By.id("user"));
	WebElement continueButton=driver.findElement(By.id("login"));
	WebElement pwd=driver.findElement(By.id("password"));
	WebElement login=driver.findElement(By.id("login-submit"));
	uName.sendKeys("nameishemanth@gmail.com");
	continueButton.click();
	pwd.sendKeys("Testing@123");
	mySleepInSeconds(3);
	login.click();
}
}
