package com.alphabet.gmail.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class CodeWithOutPolymorphism extends BasicSettings {
	public static void main(String[] args) {
		String chromeKey="webdriver.chrome.driver";
		String chromePath="./drivers/chromeDriver.exe";
		System.setProperty(chromeKey, chromePath);
		
		
		String ffKey="webdriver.gecko.driver";
		String ffPath="./drivers/geckoDriver.exe";
		System.setProperty(ffKey, ffPath);
		
		WebDriver d1=new ChromeDriver();
		System.out.println(d1.getCurrentUrl());
		System.out.println(d1.getTitle());
		d1.close();
		mySleepInSeconds(3);
		
		WebDriver d2=new FirefoxDriver();
		System.out.println(d2.getCurrentUrl());
		System.out.println(d2.getTitle());
		d2.close();
	}
}
