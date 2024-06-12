package com.alphabet.gmail.javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class OptionalParameter extends BasicSettings {
public static void main(String[] args) {
	WebDriver driver=setUp("chrome", "https://www.google.com");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("console.log(arguments[0]);" +
			"console.log(arguments[1]);"+
			"console.log(arguments[2]);", 100, "Hello", true);
	
	
}
}
