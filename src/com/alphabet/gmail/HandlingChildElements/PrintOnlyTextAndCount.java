package com.alphabet.gmail.HandlingChildElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class PrintOnlyTextAndCount extends BasicSettings{
public static void main(String[] args) {
	WebDriver driver=setUp("chrome", "file:///E:/GO%20project/StudentsData.html");
	WebElement table=driver.findElement(By.tagName("table"));
	List<WebElement> rows=driver.findElements(By.tagName("tr"));
	int textCount=0;
	for(WebElement row:rows)
	{
		List<WebElement> cells=row.findElements(By.tagName("td"));
		
		for(WebElement cell:cells)
		{
			String celltext=cell.getText();
			//if (celltext.matches("^[A-Za-z\\s]+$"))
			if(!celltext.matches("\\d+"))
			  {
				System.out.println(celltext);
				textCount++;
			  }
			
		}
	}
	System.out.println("total text count:" +textCount);
}
}
