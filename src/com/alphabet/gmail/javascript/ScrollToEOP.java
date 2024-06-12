package com.alphabet.gmail.javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class ScrollToEOP extends BasicSettings{
public static void main(String[] args) {
	WebDriver driver=setUp("chrome","https://www.foundit.in/");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
}
}
