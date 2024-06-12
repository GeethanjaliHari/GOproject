package com.alphabet.gmail.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class DragAndDropInFrame extends BasicSettings{
public static void main(String[] args) {
	WebDriver driver=setUp("chrome", "https://www.jqueryui.com/draggable/");
	driver.switchTo().frame(0);
	WebElement block=driver.findElement(By.id("draggable"));
	Actions action=new Actions(driver);
	action.dragAndDropBy(block, 334,74);
	action.perform();
	
}
}
