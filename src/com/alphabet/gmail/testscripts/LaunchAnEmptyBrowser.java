package com.alphabet.gmail.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchAnEmptyBrowser {
	public static void main(String[] args) {
		String chromeKey="webdriver.chrome.driver";
		String chromePath="./drivers/chromedriver.exe";
		System.setProperty(chromeKey, chromePath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.close();
		
	}

}
