package com.alphabet.gmail.webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class TopAllignment extends BasicSettings{
	public static void main(String[] args) {
		final int STANDARD_SPACE=5;
		WebDriver driver=setUp();
		WebElement username=driver.findElement(By.id("username"));
		WebElement pwd=driver.findElement(By.name("pwd"));
		Rectangle rect1=username.getRect();
		Rectangle rect2=pwd.getRect();
		int uStartY=rect1.getY();
		int uHeight=rect1.getHeight();
		int uEndY=uStartY+uHeight;
		int pStartY=rect2.getY();
		int space=pStartY-uEndY;
		int uEndYwithSpace=uEndY+space;
		System.out.println("uEndYwithSpace:"+uEndYwithSpace);
		System.out.println("pStartY:"+pStartY);
		if(pStartY>=uEndYwithSpace)
		{
			System.out.println("Top allignment is correct");
		}
		else
		{
			System.out.println("Top allignment is incorrect");
		}
		
	}

}
