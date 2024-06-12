package HandleListbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class GetAllSelectedOptions extends BasicSettings{
public static void main(String[] args) {
	WebDriver driver=setUp("chrome", "file:///E:/GO%20project/Listbox.html");
	WebElement subjectList=driver.findElement(By.id("multi"));
	Select s=new Select(subjectList);
	List<WebElement>allOptions=s.getOptions();
	for(int i=0; i<=allOptions.size()-1; i+=2)
	{
		s.selectByIndex(i);
		mySleepInSeconds(2);
	}
	List<WebElement> allSelectedOpt=s.getAllSelectedOptions();
	System.out.println("List of all selected options");
	System.out.println("============================");
	for(WebElement selectedOpt:allSelectedOpt)
	{
		System.out.println(selectedOpt.getText());
	}
	driver.close();
}
}
