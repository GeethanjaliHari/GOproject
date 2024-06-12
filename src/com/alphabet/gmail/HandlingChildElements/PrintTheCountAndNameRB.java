package com.alphabet.gmail.HandlingChildElements;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class PrintTheCountAndNameRB extends BasicSettings {
public static void main(String[] args) {
	WebDriver driver=setUp("chrome", "https://www.facebook.com/");
	driver.findElement(By.linkText("Create new account")).click();
	mySleepInSeconds(3);
	List<WebElement> radioButtons=driver.findElements(By.xpath("//input[@type='radio']"));
	int numCount=0;
	for(WebElement RB:radioButtons)
	{
		System.out.println(RB.getText());
		numCount++;
	}
	System.out.println("Number of RB:" +numCount);
}
}
