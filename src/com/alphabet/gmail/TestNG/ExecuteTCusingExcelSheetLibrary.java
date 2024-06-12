package com.alphabet.gmail.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import datadriven.ExcelLibrary;

public class ExecuteTCusingExcelSheetLibrary {
	@DataProvider(parallel=true)
	public Object[][] getData()
	{
		String filePath="./resources/multipleTestData.xlsx";
		String sheetName="TC001";
		return ExcelLibrary.getExcelSheetData(filePath, sheetName);
	}
	
	@Test(dataProvider="getData", description="getting data from excel sheet file")
	public void multipleLogins(String uName, String pass)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.name("pwd")).sendKeys(pass);
		driver.findElement(By.id("loginButton")).click();
	}
}
