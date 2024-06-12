package com.alphabet.gmail.HandleAutoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class ListOfAutoSuggestions extends BasicSettings{
public static void main(String[] args) {
	WebDriver driver=setUp("chrome", "https://www.google.com/");
	driver.findElement(By.id("input")).sendKeys("cucumber");
	String suggestionXpath="//cr-realbox-dropdown[@id='matches'or @role='listbox']";
	List<WebElement> suggestions=driver.findElements(By.xpath(suggestionXpath));
	for(WebElement suggestion:suggestions)
	{
		System.out.println(suggestion.getText());
	}
}
}
