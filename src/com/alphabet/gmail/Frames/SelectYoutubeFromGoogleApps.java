package com.alphabet.gmail.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class SelectYoutubeFromGoogleApps extends BasicSettings{
public static void main(String[] args) {
	WebDriver driver=setUp("chrome", "https://www.google.com");
	String xpath="//a[@href='https://www.google.co.in/intl/en/about/products?tab=rh']";
	driver.findElement(By.xpath(xpath)).click();
	
}
}
