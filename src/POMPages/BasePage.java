package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	WebDriver driver;
	

	public BasePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
		public boolean verifyURL(String url)
		{
			WebDriverWait wait=new WebDriverWait(driver, 30);
			return wait.until(ExpectedConditions.urlToBe(url));
		}
	}


