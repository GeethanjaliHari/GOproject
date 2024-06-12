package com.alphabet.gmail.Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class PromptPopup extends BasicSettings{
public static void main(String[] args) {
	WebDriver driver=setUp("chrome", "file:///E:/GO%20project/Prompt.html");
	Alert alert=driver.switchTo().alert();
	mySleepInSeconds(4);
	System.out.println(alert.getText());
//	alert.sendKeys("geethanjali");
	alert.sendKeys("Geetha");
	
//	mySleepInSeconds(5);
	//alert.accept();
	
}
}
