package com.alphabet.gmail.Robot;

import java.awt.AWTException;
import java.awt.Robot;

public class MouseMovement {
	public static void main(String[] args) throws AWTException {
		Robot robot=new Robot();
		robot.mouseMove(938, 890);
	}
}
