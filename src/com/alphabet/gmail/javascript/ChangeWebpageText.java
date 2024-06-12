package com.alphabet.gmail.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class ChangeWebpageText extends BasicSettings {
public static void main(String[] args) {
	WebDriver driver=setUp();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	WebElement title=driver.findElement(By.id("headerContainer"));
	js.executeScript("arguments[0].innerText='Enter the details';", title);
	
	//Redirect to another url
	js.executeScript("window.location='https://www.google.com';");
	
}
}
