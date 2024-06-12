package com.alphabet.gmail.webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class VerifyTFisEmptyOrNot extends BasicSettings{
public static void main(String[] args) {
	WebDriver driver=setUp();
	WebElement username=driver.findElement(By.id("username"));
	String attriValue=username.getAttribute("value");
	if(attriValue!=null)
	{
		if(attriValue.isEmpty())
		{
			System.out.println("username TF is empty");
		}
		else
		{
			System.out.println("TF is not empty");
			System.out.println(attriValue);
		}
	}
}
}
