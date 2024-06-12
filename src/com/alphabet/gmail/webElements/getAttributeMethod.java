package com.alphabet.gmail.webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class getAttributeMethod extends BasicSettings {
	public static void main(String[] args) {
		WebDriver driver=setUp();
		
		WebElement uName=driver.findElement(By.id("username"));
		String attriValue=uName.getAttribute("Value");
		if(attriValue!=null)
		{
			if(attriValue.isEmpty())
			{
				System.out.println("Username TF is empty");
			}
			else
			{
				System.out.println("Username TF is not empty");
				System.out.println(attriValue);
			}
		}
		else
		{
			System.out.println("Invalid attribute");
		}
		
		driver.close();
	}
}
