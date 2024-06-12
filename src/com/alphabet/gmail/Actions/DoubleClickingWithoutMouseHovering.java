package com.alphabet.gmail.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class DoubleClickingWithoutMouseHovering extends BasicSettings{
public static void main(String[] args) {
	WebDriver driver=setUp("chrome", "https://live.skillrary.com/");
	WebElement link=driver.findElement(By.linkText("Ongoing Classes"));
	WebElement popUp=driver.findElement(By.linkText("May be later"));
	popUp.click();
	mySleepInSeconds(2);
	Actions action=new Actions(driver);
	action.doubleClick(link).perform();
}
}
