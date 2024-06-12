package com.alphabet.gmail.javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class javascriptCode1 extends BasicSettings{
public static void main(String[] args) {
	WebDriver driver=setUp("chrome", "https://www.google.com");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript("alert('This is an alert');");
	js.executeScript("console.log('Hello world');");
	
}
}
