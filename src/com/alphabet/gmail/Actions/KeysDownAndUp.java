package com.alphabet.gmail.Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class KeysDownAndUp extends BasicSettings {
public static void main(String[] args) {
	WebDriver driver=setUp("chrome", "https://www.google.com");
	WebElement search= driver.findElements(By.name("q")).get(0);
	Actions action=new Actions(driver);
	action.keyDown(Keys.SHIFT);
	action.sendKeys(search, "i love java");
	action.perform();
	search.clear();
action.sendKeys(search, "i love selenium");
	action.perform();
	action.keyUp(Keys.SHIFT);
	action.sendKeys(search, "I like manual testing");
	action.perform();
	
	
}
}
