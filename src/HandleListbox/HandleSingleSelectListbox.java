package HandleListbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class HandleSingleSelectListbox extends BasicSettings {
public static void main(String[] args) {
	WebDriver driver=setUp("chrome", "file:///E:/GO%20project/Listbox.html");
	WebElement subjectList=driver.findElement(By.id("single"));
	Select s=new Select(subjectList);
	List<WebElement> options=s.getOptions();
	for(WebElement option:options)
	System.out.println(option.getText());
}
}
