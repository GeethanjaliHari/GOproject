package com.alphabet.gmail.Robot;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class MouseScroll extends BasicSettings {
public static void main(String[] args) throws AWTException {
	WebDriver driver=setUp("chrome", "https://www.foundit.in/");
	Robot robot=new Robot();
	mySleepInSeconds(3);
	robot.mouseWheel(450);
	mySleepInSeconds(3);
	robot.mouseWheel(-100);
}
}
