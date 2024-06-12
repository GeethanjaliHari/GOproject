package com.alphabet.gmail.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class ContextClickOnWebEle extends BasicSettings{
public static void main(String[] args) {
	WebDriver driver=setUp("chrome", "https://www.google.com");
	WebElement searchBox=driver.findElement(By.name("q"));
	Actions action=new Actions(driver);
	action.contextClick(searchBox).perform();
	
}
}
