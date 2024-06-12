package com.alphabet.gmail.Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class DragAndDrop extends BasicSettings{
public static void main(String[] args) {
	WebDriver driver=setUp("chrome", "http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
	WebElement b1=driver.findElement(By.xpath("//h1[text()='Block 1']"));
	WebElement b4=driver.findElement(By.xpath("//h1[text()='Block 4']"));
	Actions action=new Actions(driver);
//	action.dragAndDrop(b1, b4).perform();
	action.clickAndHold(b1).moveToElement(b4).pause(Duration.ofSeconds(3)).release().perform();
	
	
}
}
