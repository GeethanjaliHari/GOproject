package datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class ReadFromPropertyFileLibrary extends BasicSettings{
	public static void main(String[] args) {
		String url=PropertyFileLibrary.getData("./resources/config.properties", "appUrl");
		String uName=PropertyFileLibrary.getData("./resources/config.properties", "username");
		String pwd=PropertyFileLibrary.getData("./resources/config.properties", "password");
		
		System.out.println(url);
		System.out.println(uName);
		System.out.println(pwd);
		System.out.println("====================");
		
		/*Properties p=PropertyFileLibrary.getValuesFromPropFile("./resources/config.properties");
		System.out.println(p);*/
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.id("loginButton")).click(); 
		
	}

}
