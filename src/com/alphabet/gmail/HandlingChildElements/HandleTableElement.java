package com.alphabet.gmail.HandlingChildElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class HandleTableElement extends BasicSettings {
	public static void main(String[] args) {
		WebDriver driver=setUp("chrome", "file:///E:/GO%20project/StudentsData.html");
		//Number of rows
		List<WebElement> nRows=driver.findElements(By.tagName("tr"));
		System.out.println("nRows :"+nRows);
		//num of columns
		List<WebElement> nCol=driver.findElements(By.tagName("th"));
		System.out.println("nCol :"+nCol);
		//num of table data
		List<WebElement> nData=driver.findElements(By.tagName("td"));
		System.out.println("nData:"+nData);
		
		//print the data
		for(WebElement data:nData)
		{
			String s= data.getText();
			if(!s.isEmpty())
			{
				System.out.println(s);
			}
		}
	}

}
