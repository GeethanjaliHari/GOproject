package com.alphabet.gmail.HandlingChildElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class NoOFButtonsInFB extends BasicSettings{
public static void main(String[] args) {
	WebDriver driver=setUp("chrome", "https://www.facebook.com/");
	driver.findElement(By.linkText("Create new account")).click();
	WebElement regForm=driver.findElement(By.id("reg_box"));
	List<WebElement> buttons=regForm.findElements(By.tagName("button"));
	System.out.println("NoOFButtons:"+buttons.size());
	for(WebElement button:buttons)
	{
		System.out.println(button.getText());
	}
	driver.close();
	
}
}
