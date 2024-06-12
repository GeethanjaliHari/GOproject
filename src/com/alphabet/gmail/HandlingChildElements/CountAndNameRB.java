package com.alphabet.gmail.HandlingChildElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class CountAndNameRB extends BasicSettings{
	public static void main(String[] args) {
	WebDriver driver=setUp("chrome", "https://www.facebook.com/");
	driver.findElement(By.linkText("Create new account")).click();
	WebElement regForm=driver.findElement(By.id("reg_box"));
	List<WebElement> radioButtons=driver.findElements(By.tagName("label"));
	System.out.println("NumberoFRB:"+radioButtons.size());
	for(WebElement RB: radioButtons)
	{
		System.out.println(RB.getText());
	}
	}
}
