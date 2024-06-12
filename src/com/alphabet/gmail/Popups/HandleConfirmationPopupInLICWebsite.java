package com.alphabet.gmail.Popups;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class HandleConfirmationPopupInLICWebsite extends BasicSettings {
public static void main(String[] args) {
	String url="https://licindia.in/tech-term?gclid=CjwKCAjw9-6oBhBaEiwAHv1QvAvoXni-JrzyNiR20cxUEeXoPiJap9u5eGpbnQsGNhATcKKelFzYThoCiGIQAvD_BwE";
	WebDriver driver =setUp("chrome", url);
	Actions action=new Actions(driver);
	WebElement target=driver.findElement(By.className("login1"));
	action.moveToElement(target).perform();
	WebElement customerPort=driver.findElement(By.linkText("Customer Portal"));
	action.click(customerPort).perform();;
	Alert alert=driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();
	String expectedURL="https://ebiz.licindia.in/D2CPM/?_ga=2.72703123.1272923387.1677050657-120722208.1677050657#Login";
	String actualURL=driver.getCurrentUrl();
	if(actualURL.equals(expectedURL))
	{
		System.out.println("Login page is displayed");
	}
	else
	{
		System.out.println("Login page is not displayed");
	}
}
}
