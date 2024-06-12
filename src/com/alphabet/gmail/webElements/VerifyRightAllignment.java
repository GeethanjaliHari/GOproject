package com.alphabet.gmail.webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class VerifyRightAllignment extends BasicSettings{
	public static void main(String[] args) {
		WebDriver driver=setUp();
		WebElement username=driver.findElement(By.id("username"));
		WebElement pwd=driver.findElement(By.name("pwd"));
		Rectangle rect1=username.getRect();
		Rectangle rect2=pwd.getRect();
		int uStartX=rect1.getX();
		int uWidth=rect1.getWidth();
		int uEndX=uStartX+uWidth;
		System.out.println("uEndX: "+ uEndX);
		int pStartX=rect2.getX();
		int pWidth=rect2.getWidth();
		int pEndX=pStartX+pWidth;
		System.out.println("pEndX: "+ pEndX);
		
		if(uEndX==pEndX)
		{
			System.out.println("RightAllignment is correct");
		}
		else
		{
			System.out.println("RightAllignment is incorrect");
		}
		
	}

}
