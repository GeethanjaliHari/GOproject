package HandleListbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class SelectMonthInFB extends BasicSettings{
	public static void main(String[] args) {
		WebDriver driver=setUp("chrome", "https://www.facebook.com/");
		WebElement createAcc=driver.findElement(By.linkText("Create new account"));
		createAcc.click();
		WebElement month=driver.findElement(By.id("month"));
		Select s=new Select(month);
		List<WebElement> allOptions=s.getOptions();
		for(WebElement opt:allOptions)
		{
			s.selectByValue(opt.getAttribute("value"));
			System.out.println(opt.getText());
			mySleepInSeconds(2);
			
		}
		driver.close();
	}

}
