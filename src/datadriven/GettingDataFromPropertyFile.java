package datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class GettingDataFromPropertyFile extends BasicSettings {
	public static void main(String[] args) throws IOException {
	//To retrieve data from property file, 1. Create an object of FileInputStream
		String filePath="E:\\GO project\\Datadriven property file\\config.properties";
		FileInputStream propertyFile=new FileInputStream(filePath);
		// 2. Create an object of Properties Class
		Properties prop=new Properties();
		//3. Call load() method
		
		prop.load(propertyFile);
		String appUrl=prop.getProperty("appUrl");
		String uName=prop.getProperty("username");
		String pwd=prop.getProperty("password");
		
		WebDriver driver=new ChromeDriver();
		driver.get(appUrl);
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.id("loginButton")).click();
		mySleepInSeconds(2);
		driver.close();
		
		
	}

}
