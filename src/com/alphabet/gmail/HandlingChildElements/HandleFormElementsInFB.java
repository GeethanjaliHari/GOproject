package com.alphabet.gmail.HandlingChildElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class HandleFormElementsInFB extends BasicSettings{
public static void main(String[] args) {
	WebDriver driver=setUp("chrome", "https://www.facebook.com/");
	driver.findElement(By.linkText("Create new account")).click();
	//Identify child elements
	List<WebElement> ele=driver.findElements(By.tagName("input"));
	System.out.println("Total input elements:" +ele.size());
	for(WebElement inputEle:ele)
	{
		System.out.println(inputEle.getAttribute("name"));
	}
}
}
