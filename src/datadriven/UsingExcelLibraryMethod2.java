package datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class UsingExcelLibraryMethod2 extends BasicSettings{
public static void main(String[] args) {
	String username=ExcelLibrary.getCellData("./resources/multipleTestData.xlsx", "TC001", 1, 0);
	String password=ExcelLibrary.getCellData("./resources/multipleTestData.xlsx", "TC001", 1, 1);
	
	WebDriver driver=setUp();
	driver.findElement(By.id("username")).sendKeys(username);
	driver.findElement(By.name("pwd")).sendKeys(password);
	driver.findElement(By.id("loginButton")).click();
}
}
