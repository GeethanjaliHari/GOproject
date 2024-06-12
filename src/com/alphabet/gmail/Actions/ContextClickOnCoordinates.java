package com.alphabet.gmail.Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class ContextClickOnCoordinates extends BasicSettings {
public static void main(String[] args) {
	WebDriver driver=setUp();
	Actions action=new Actions(driver);
	action.moveByOffset(772, 443).contextClick().perform();
}
}
