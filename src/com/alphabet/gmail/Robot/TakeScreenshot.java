package com.alphabet.gmail.Robot;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class TakeScreenshot  {
public static void main(String[] args) throws AWTException, IOException {
	Robot robot=new Robot();
	Rectangle rect=new Rectangle(300,200);
	BufferedImage img=robot.createScreenCapture(rect);
	File dest=new File("./errorshots/p1.png");
	ImageIO.write(img, "png", dest);
	
}
}
