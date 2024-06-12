package HandleListbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class SelectingDOBInFB extends BasicSettings {
public static void main(String[] args) {
	WebDriver driver=setUp("chrome", "https://www.facebook.com/");
	WebElement createAcc=driver.findElement(By.linkText("Create new account"));
	createAcc.click();
	WebElement day=driver.findElement(By.id("day"));
	WebElement month=driver.findElement(By.id("month"));
	WebElement year=driver.findElement(By.id("year"));
	Select s1=new Select(day);
	Select s2=new Select(month);
	Select s3=new Select(year);
	List<WebElement> days=s1.getOptions();
	List<WebElement> months=s2.getOptions();
	List<WebElement> years=s3.getOptions();
	s1.selectByIndex(25);
	s2.selectByValue("4");
	s3.selectByVisibleText("1992");
}
}
