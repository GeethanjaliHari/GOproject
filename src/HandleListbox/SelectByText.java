package HandleListbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class SelectByText extends BasicSettings{
public static void main(String[] args) {
	WebDriver driver=setUp("chrome", "file:///E:/GO%20project/Listbox.html");
	WebElement subjectList=driver.findElement(By.id("single"));
	Select s=new Select(subjectList);
	List<WebElement> allOptions=s.getOptions();
	for(WebElement option:allOptions)
	{
		s.selectByVisibleText(option.getText());
		mySleepInSeconds(2);
		
	}
	driver.close();
}
}
