package com.alphabet.gmail.Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class AlertPopUp extends BasicSettings {
public static void main(String[] args) {
	WebDriver driver=setUp("chrome", "file:///E:/GO%20project/alert.html");
	Alert alert=driver.switchTo().alert();
	mySleepInSeconds(2);
	alert.accept();
	mySleepInSeconds(2);
	driver.close();
}
}
