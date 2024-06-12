package com.alphabet.gmail.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class MouseHovering1 extends BasicSettings{
public static void main(String[] args) {
	WebDriver driver=setUp("chrome", "https://www.actitime.com/");
	WebElement featureLink=driver.findElement(By.xpath("//ul[@class='header__menu']/..//span[text()='Clients']"));
	Actions action=new Actions(driver);
	action.moveToElement(featureLink).perform();
	
}
}
