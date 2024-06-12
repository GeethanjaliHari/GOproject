package com.alphabet.gmail.Robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class KBRelease {
	public static void main(String[] args) throws AWTException {
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_SHIFT);
	}

}
