package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class TC001 extends BasicSettings {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com");
		LoginPage lp=new LoginPage(driver);
		HomePage hp=lp.login("admin", "manager");
		
		if(hp.verifyPageTitle("actiTIME -  Enter Time-Track"))
		{
			System.out.println("Homepage is displayed");
		}
		else
		{
			System.out.println("Homepage is not displayed");
		}
		driver.close();
	}

}
