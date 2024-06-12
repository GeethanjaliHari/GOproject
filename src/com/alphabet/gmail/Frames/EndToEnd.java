package com.alphabet.gmail.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class EndToEnd extends BasicSettings{
public static void main(String[] args) {
	WebDriver driver=setUp("chrome", "https://www.rediff.com/");
	WebElement signIn=driver.findElement(By.linkText("Sign in"));
	signIn.click();
	mySleepInSeconds(3);
	WebElement uName=driver.findElement(By.id("login1"));
	uName.sendKeys("nameishemanth@rediffmail.com");
	WebElement pwd=driver.findElement(By.id("password"));
	pwd.sendKeys("Testing@123");
	WebElement login=driver.findElement(By.name("proceed"));
	login.submit();
	WebElement writeMail=driver.findElement(By.xpath("//li[@class='rd_write']"));
	writeMail.click();
	driver.findElement(By.id("TO_IDcmp2")).sendKeys("nameishemanth@rediffmail.com");
	driver.findElement(By.xpath("//input[@class='rd_inp_sub rd_subject_datacmp2']")).sendKeys("Test frame");
	WebElement frame=driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
	driver.switchTo().frame(frame);
	String bodyXpath="//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']";
	driver.findElement(By.xpath(bodyXpath)).sendKeys("Testing on embedded webpage");
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Send")).click();
	driver.findElement(By.linkText("Sent")).click();
	driver.findElement(By.xpath("//ul[@class='rd_ml']/li")).click();
	driver.findElement(By.linkText("Logout")).click();
	
	
}
}
