package com.alphabet.gmail.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class ScrollToElement extends BasicSettings {
public static void main(String[] args) {
	WebDriver driver=setUp("chrome","https://www.foundit.in/");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	WebElement emailID=driver.findElement(By.linkText("info@foundit.in"));
	js.executeScript("arguments[0].scrollIntoView();", emailID);
	
}
}
