package com.alphabet.gmail.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class ClickOnDisabledElement extends BasicSettings{
public static void main(String[] args) {
	WebDriver driver=setUp("chrome", "https://www.oracle.com/in/java/technologies/downloads/#jdk20-linux");
	WebElement linuxTab=driver.findElement(By.id("rt01tab6-java8-linux"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	WebElement link=driver.findElement(By.linkText("jdk-8u381-linux-i586.tar.gz"));
	js.executeScript("arguments[0].click();",link);
	WebElement disabledEle=driver.findElement(By.linkText("Download jdk-8u381-linux-i586.tar.gz"));
	js.executeScript("arguments[0].click();", disabledEle);
	
	
}
}
