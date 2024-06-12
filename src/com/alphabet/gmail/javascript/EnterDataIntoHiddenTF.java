package com.alphabet.gmail.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class EnterDataIntoHiddenTF extends BasicSettings{
public static void main(String[] args) {
	WebDriver driver=setUp("chrome", "https://www.facebook.com/");
	WebElement createAcc=driver.findElement(By.linkText("Create new account"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", createAcc);
	WebElement hidden=driver.findElement(By.xpath("//label[text()='Custom']"));
	
	js.executeScript("arguments[0].click();", hidden);
	WebElement hiddenTF=driver.findElement(By.name("custom_gender"));
	hiddenTF.sendKeys("abcd");
	mySleepInSeconds(2);
	driver.close();

}
}
