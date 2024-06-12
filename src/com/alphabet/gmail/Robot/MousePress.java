package com.alphabet.gmail.Robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class MousePress extends BasicSettings {
@SuppressWarnings("deprecation")
public static void main(String[] args) throws AWTException {
	mySleepInSeconds(2);
	Robot robot=new Robot();
	robot.mousePress(InputEvent.BUTTON1_MASK);
	robot.mouseRelease(InputEvent.BUTTON1_MASK);
	
}
}
