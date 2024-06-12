package com.alphabet.gmail.Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BasicSettings1 {
	static {
		String chromeKey="webdriver.chrome.driver";
		String chromePath="./drivers/chromeDriver.exe";
		System.setProperty(chromeKey, chromePath);
		
		String ffKey="webDriver.gecko.driver";
		String ffPath="./drivers/geckoDriver.exe";
		System.setProperty(ffKey, ffPath);
		
		String ieKey="webDriver.ie.driver";
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
		catch(ArrayIndexOutOfBoundsException e)
		{
			browserName="chrome";
		}
		
		try {
			url=config[1];
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			url="https://deom.actitime.com";
		}
		
		try {
			ITO=Long.parseLong(config[2]);
		}
		catch(Exception e)
		{
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
		
		else if(browserName.equalsIgnoreCase("ie"))
		{
			driver=new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().window().
		return driver;
	}

}
