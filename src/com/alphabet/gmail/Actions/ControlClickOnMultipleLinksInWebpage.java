package com.alphabet.gmail.Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class ControlClickOnMultipleLinksInWebpage extends BasicSettings {
public static void main(String[] args) {
	WebDriver driver=setUp("chrome", "https://jqueryui.com/draggable/");
	List<WebElement> allLinks=driver.findElements(By.xpath("//ul[@id='menu-top']/li/a"));
	Actions action=new Actions(driver);
	action.keyDown(Keys.CONTROL);
	for(WebElement links:allLinks);
	{
	action.click();
	}
	action.keyUp(Keys.CONTROL);
	action.perform();
}
}
