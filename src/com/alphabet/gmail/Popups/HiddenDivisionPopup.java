package com.alphabet.gmail.Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class HiddenDivisionPopup extends BasicSettings{
public static void main(String[] args) {
	WebDriver driver=setUp("chrome", "https://en.wikipedia.org/wiki/Civilization");
	WebElement target=driver.findElement(By.linkText("nomadic pastoralists"));
	Actions action=new Actions(driver);
	action.moveToElement(target).perform();
	mySleepInSeconds(5);
	WebElement settings=driver.findElement(By.xpath("//span[@class='popups-icon popups-icon--size-small popups-icon--settings']"));
	settings.click();
	mySleepInSeconds(2);
	driver.findElement(By.xpath("//button[.='Save']")).click();
	
}
}
