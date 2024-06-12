package com.alphabet.gmail.weddriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoVisibleOrNot extends BasicSettings {
public static void main(String[] args) {
	WebDriver driver=setUp("chrome","https://www.google.com");
//	Boolean logo=driver.findElement(By.id("hplogo")).isDisplayed();
	//System.out.println(logo);
	
	WebDriverWait wait=new WebDriverWait(driver, 20);
	WebElement logoImg=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hplogo")));
	String actuallogoText=logoImg.getText();
	String expectedText="Google";
	if(expectedText.contains(actuallogoText))
	{
		
		System.out.println("Image is visible");
	}
	else
	{
		System.out.println("Image is not visible");
	}
	

}
}
