package com.alphabet.gmail.weddriverMethods;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class PageScreenshot extends BasicSettings{
public static void main(String[] args) throws IOException {
	WebDriver driver=setUp();
	LocalDateTime ldt=LocalDateTime.now();
	String date=ldt.toString().replace(":", "-");
	TakesScreenshot ts=(TakesScreenshot)driver;
	
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./errorshots/pagescreenshot"+date+".png");
	FileUtils.copyFile(src, dest);
	
}
}
