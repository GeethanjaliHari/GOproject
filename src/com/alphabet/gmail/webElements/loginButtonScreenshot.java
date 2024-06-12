package com.alphabet.gmail.webElements;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class loginButtonScreenshot extends BasicSettings{
	public static void main(String[] args) throws IOException {
		WebDriver driver=setUp();
		LocalDateTime ldt=LocalDateTime.now();
		String date=ldt.toString().replace(':','-');
		System.out.println(date);
		
		WebElement login=driver.findElement(By.id("loginButton"));
		File src=login.getScreenshotAs(OutputType.FILE);
		File dest=new File("./errorshots/img1"+date+".png");
		FileUtils.copyFile(src, dest);	
	}
}
