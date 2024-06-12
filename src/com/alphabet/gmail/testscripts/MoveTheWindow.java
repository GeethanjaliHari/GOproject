package com.alphabet.gmail.testscripts;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class MoveTheWindow extends BasicSettings	 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		Dimension d1=new Dimension(300,400);
		driver.manage().window().setSize(d1);
		Point p1=driver.manage().window().getPosition();
		
		System.out.println("X :"+ p1.getX());
		System.out.println("Y :"+ p1.getY());
		
		Point p2=new Point(100, 500);
		driver.manage().window().setPosition(p2);
	}
}
