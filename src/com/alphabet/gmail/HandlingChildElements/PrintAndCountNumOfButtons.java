package com.alphabet.gmail.HandlingChildElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class PrintAndCountNumOfButtons extends BasicSettings{
	public static void main(String[] args) {
		WebDriver driver=setUp("chrome", "https://www.facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		mySleepInSeconds(3);
		List<WebElement> allButtons=driver.findElements(By.tagName("button"));
		int numCount=0;
		for(WebElement button:allButtons)
		{
			System.out.println("Button name:"+button.getText());
			numCount++;
		}
		System.out.println("Total count:" + numCount);
		
	}
}
