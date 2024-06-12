package com.alphabet.gmail.testscripts;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class ResizeTheWindow extends BasicSettings {
 public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	Dimension d1=driver.manage().window().getSize();
System.out.println("Height :"+d1.getHeight());
System.out.println("Width :"+d1.getWidth());

Dimension d2=new Dimension(300,400);
driver.manage().window().setSize(d2);

}
}
