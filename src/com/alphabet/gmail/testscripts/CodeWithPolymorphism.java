package com.alphabet.gmail.testscripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.alphabet.gmail.weddriverMethods.BasicSettings;
public class CodeWithPolymorphism extends BasicSettings
{
	    public static void main(String[] args) {
		MyClass.genericMethod(new ChromeDriver());
		mySleepInSeconds(5);
		MyClass.genericMethod(new FirefoxDriver());
	}
}

