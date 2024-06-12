package com.alphabet.gmail.javascript;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class ScrollUpDown extends BasicSettings{
public static void main(String[] args) {
	WebDriver driver=setUp("chrome","https://www.foundit.in/");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 800);");
	mySleepInSeconds(2);
	js.executeScript("window.scrollBy(0, -500);");
	mySleepInSeconds(2);
	// to scroll left right
	
	Dimension d1=new Dimension(400, 500);
	driver.manage().window().setSize(d1);
	js.executeScript("window.scrollBy(300,0);");
	mySleepInSeconds(2);
	js.executeScript("window.scrollBy(-500,0);");
	mySleepInSeconds(2);
	driver.close();
	
	int pixel=1000;
	js.executeScript("window.scrollBy(0, "+pixel+");");
	mySleepInSeconds(2);
	driver.close();
}
}
