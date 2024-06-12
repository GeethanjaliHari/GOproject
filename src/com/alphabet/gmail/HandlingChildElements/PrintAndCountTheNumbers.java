package com.alphabet.gmail.HandlingChildElements;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class PrintAndCountTheNumbers extends BasicSettings{
	public static void main(String[] args) {
		WebDriver driver=setUp("chrome", "file:///E:/GO%20project/StudentsData.html");
		WebElement table=driver.findElement(By.id("Student"));
		List<WebElement> rows= driver.findElements(By.tagName("tr"));
		int numberCount=0;
		
		for(WebElement row:rows)
		{
			java.util.List<WebElement> cells=row.findElements(By.tagName("td"));
			for(WebElement cell:cells)
			{
				String cellText=cell.getText();
				if(cellText.matches("\\d+"));
				{
					int number=Integer.parseInt(cellText);
					System.out.println("Number:"+ number);
					numberCount+=number;
				}
			}
		}
		System.out.println("TotalCount of Numbers:"+numberCount);
	}

}
