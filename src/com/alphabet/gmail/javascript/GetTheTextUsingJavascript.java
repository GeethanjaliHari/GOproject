package com.alphabet.gmail.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class GetTheTextUsingJavascript extends BasicSettings{
public static void main(String[] args) {
	WebDriver driver=setUp();
	WebElement header=driver.findElement(By.id("headerContainer"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	String s1=(String)js.executeScript("return arguments[0].innerText;", header);
	System.out.println(s1);
	String s2=(String) js.executeScript("return document.title;");
	System.out.println(s2);
	String s3=(String)js.executeScript("return document.URL;");
	System.out.println(s3);
	Object obj=js.executeScript("return document.body.scrollHeight;");
	System.out.println(obj);
}
}
