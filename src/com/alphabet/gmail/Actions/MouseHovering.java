package com.alphabet.gmail.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class MouseHovering extends BasicSettings {
public static void main(String[] args) {
	WebDriver driver=setUp("chrome", "https://skillrary.com/");
	WebElement liveCourse=driver.findElement(By.id("latrecorded_tab"));
	Actions action=new Actions(driver);
	action.moveToElement(liveCourse).click();
}
}
