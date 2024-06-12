package com.alphabet.gmail.Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class ConfirmationPopup extends BasicSettings{
public static void main(String[] args) {
	WebDriver driver=setUp("chrome", "file:///E:/GO%20project/Confirmation.html");
	Alert alert=driver.switchTo().alert();
	mySleepInSeconds(4);
	alert.dismiss();
	
}
}
