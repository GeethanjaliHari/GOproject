package com.alphabet.gmail.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class MouseHoveringOnPageCoordinates extends BasicSettings {
public static void main(String[] args) {
	WebDriver driver=setUp("chrome", "https://www.trello.com/login");
	WebElement username=driver.findElement(By.id("user"));
	WebElement login=driver.findElement(By.id("login"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].value='nameishemanth@gmail.com';"+
					"arguments[1].click();", username, login);
	mySleepInSeconds(2);
	
	WebElement pwd=driver.findElement(By.id("password"));
	pwd.sendKeys("Testing@123");
	WebElement login1=driver.findElement(By.id("login-submit"));
	login1.click();
	
	String xpath="//h3[text()='Starred boards']/../..//div[@title='My Java Sessions']";
	driver.findElement(By.xpath(xpath)).click();
	Actions action=new Actions(driver);
	action.moveByOffset(772, 442).doubleClick().perform();
	
	
	
	
}
}
