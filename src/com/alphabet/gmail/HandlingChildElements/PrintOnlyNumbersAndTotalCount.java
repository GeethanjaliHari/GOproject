package com.alphabet.gmail.HandlingChildElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class PrintOnlyNumbersAndTotalCount extends BasicSettings {
public static void main(String[] args) {
	WebDriver driver=setUp("chrome", "file:///E:/GO%20project/StudentsData.html");
	WebElement table=driver.findElement(By.tagName("table"));
	List<WebElement> tableElement=driver.findElements(By.tagName("td"));
	List<WebElement> rows = table.findElements(By.tagName("tr"));
	int numberCount=0;
	
	for(WebElement ele:tableElement)
	{
		String cellText=ele.getText();
		if(cellText.matches("\\d+"))
		{
			int number=Integer.parseInt(cellText);
			System.out.println("Number:" +number);
			numberCount+=number;
		}
	}
	System.out.println("Total Count:"+ numberCount);
	
  
 /*       // Initialize a variable to store the count of numbers
        int totalCount = 0;

        for (WebElement row : rows) {
            // Find all the table data (cells) within the row
            java.util.List<WebElement> cells = row.findElements(By.tagName("td"));

            // Iterate through each cell in the row
            for (WebElement cell : cells) {
                // Get the text from the cell
                String cellText = cell.getText();
                
                // Check if the cell text is a number (you can use regex for more robust number detection)
                if (cellText.matches("\\d+")) {
                    int number = Integer.parseInt(cellText);
                    System.out.println("Number: " + number);
                    totalCount += number;
                }
            }
        }

        // Print the total count of numbers
        System.out.println("Total Count of Numbers: " + totalCount);*/

}
}
