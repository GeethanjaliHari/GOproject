package POMPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.alphabet.gmail.weddriverMethods.BasicSettings;

public class TC001 extends BasicSettings{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actiTime.com");
		
		LoginPage lp=new LoginPage(driver);
		HomePage hp=lp.login("admin", "manager");
	
		
		String currentURL=hp.VerifyURL();
		System.out.println(currentURL);
		if(hp.VerifyURL().equals("https://demo.actitime.com/user/submit_tt.do"))
		{
			System.out.println("HomePage is displayed");
		}
		else
		{
			System.out.println("Homepage is not displayed");
		}
		driver.close();
	}
}
