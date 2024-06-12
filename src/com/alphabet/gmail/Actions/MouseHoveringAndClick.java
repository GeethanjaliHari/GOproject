package com.alphabet.gmail.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class MouseHoveringAndClick extends BasicSettings {
public static void main(String[] args) {
	WebDriver driver=setUp("Chrome", "https://www.istqb.org/");
	WebElement te=driver.findElement(By.xpath("//nav[@class='Menustyles__StyledNav-sc-fo396c-0 gUfLbp']/..//span[text()='Training & Exams']"));
	Actions action=new Actions(driver);
	action.moveToElement(te).click().perform();
	WebElement linkTxt=driver.findElement(By.linkText("Find an Exam Provider"));
	linkTxt.click();
	
}
}
