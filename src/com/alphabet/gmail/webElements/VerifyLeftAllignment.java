package com.alphabet.gmail.webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class VerifyLeftAllignment extends BasicSettings{
public static void main(String[] args) {
	WebDriver driver=setUp();
	WebElement uName=driver.findElement(By.id("username"));
	WebElement pwd=driver.findElement(By.name("pwd"));
	int usernamestartX= uName.getLocation().getX();
	int pwdstartX=pwd.getLocation().getX();
	
	if(usernamestartX==pwdstartX) {
		System.out.println("Left allignment of Uname and Pwd TF is correct");
		
	}
	else
	{
		System.out.println("Left allignment of Uname and Pwd TF is incorrect");
	}
}
}
