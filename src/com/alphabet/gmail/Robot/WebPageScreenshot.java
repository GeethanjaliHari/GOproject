package com.alphabet.gmail.Robot;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class WebPageScreenshot extends BasicSettings{
public static void main(String[] args) throws AWTException, IOException {
	WebDriver driver=setUp();
	
	Dimension d1=driver.manage().window().getSize();
	Robot robot=new Robot();
	Rectangle rect=new Rectangle(d1.getHeight(), d1.getWidth());
	BufferedImage img=robot.createScreenCapture(rect);
	File dest=new File("./errorshots/p2.jpeg");
	ImageIO.write(img, "jpeg", dest);
}
}
