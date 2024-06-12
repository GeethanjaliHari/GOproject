package HandleListbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class HandleMultiSelect extends BasicSettings{
public static void main(String[] args) {
	WebDriver driver=setUp("chrome", "file:///E:/GO%20project/Listbox.html");
	WebElement subjectList=driver.findElement(By.id("multi"));
	Select s=new Select(subjectList);
	if(s.isMultiple())
	{
		System.out.println("Multi select list box");
	}
	else
	{
		System.out.println("Single select list box");
	}
	List<WebElement> options=s.getOptions();
	for(WebElement opt:options)
	{
		s.selectByVisibleText(opt.getText());
		mySleepInSeconds(2);
	}
	for(WebElement opt:options)
	{
		s.deselectByVisibleText(opt.getText());
	}
	driver.close();
}
}
