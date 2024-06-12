package com.alphabet.gmail.javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class ScrollUsingVariable extends BasicSettings {
public static void main(String[] args) {
	WebDriver driver=setUp("chrome","https://www.foundit.in/" );
	JavascriptExecutor js=(JavascriptExecutor)driver;
	int pixel=1000;
	js.executeScript("window.scrollBy(0, "+pixel+");");
	mySleepInSeconds(2);
	driver.close();
}
}
