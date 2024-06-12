package com.alphabet.gmail.weddriverMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicSettings {
	static {
		String chromeKey="webdriver.chrome.driver";
		String chromePath="./drivers/chromedriver.exe";
		System.setProperty(chromeKey, chromePath);
		
		String ffKey="webdriver.gecko.driver";
		String ffPath="./driver/geckodriver.exe";
		System.setProperty(ffKey, ffPath);
		
		String ieKey="webdriver.ie.driver";
		String iePath="./drivers/IEDriverServer.exe";
		System.setProperty(ieKey, iePath);
		
	}
	public static void mySleepInSeconds(long seconds)
	{
		long milliseconds=seconds*1000;
		try {
			Thread.sleep(milliseconds);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	public static WebDriver setUp(String...config)
	{
		String browserName=null;
		String url=null;
		long ITO=0;
		try {
			browserName=config[0];
		}
		catch(ArrayIndexOutOfBoundsException e){
			browserName="chrome";
		}
		
		try {
			url=config[1];
		}
		catch(Exception e){
			url="http://demo.actitime.com";
		}

		try {
			ITO=Long.parseLong(config[2]);
		}
		catch(Exception e){
			ITO=20;
		}
		WebDriver driver=null;
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.get(url);
		return driver;
		
	}

}
