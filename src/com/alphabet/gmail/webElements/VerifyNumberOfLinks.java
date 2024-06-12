package com.alphabet.gmail.webElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class VerifyNumberOfLinks extends BasicSettings{
public static void main(String[] args) {
	WebDriver driver=setUp();
	List<WebElement> links=driver.findElements(By.tagName("a"));
	int expectedLink=7;
	int actualLinks=links.size();
	if(actualLinks==expectedLink)
	{
		System.out.println("TC passed");
	}
	else
	{
		System.out.println("TC failed");
	}
	
	for(WebElement link:links)
	{
		if(link.isDisplayed()) {
		System.out.println(link.getText());
		}
	}
}
}
