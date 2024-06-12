package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	// Create WebElements

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText="Logout")
	private WebElement logoutLink;
	
	@FindBy(id="taskSearchControl_field")
	private WebElement searchTF;
	
	@FindBy(xpath="//div[.='Tasks']")
	private WebElement taskFeature;
	
	
	// Create Action methods
	public allCustomersPage clickTask()
	{
		taskFeature.click();
		return new allCustomersPage();
	}
	public void searchTF(String text)
	{
		searchTF.sendKeys(text);
	}
	
	public void logout()
	{
		logoutLink.click();
	}
	
	public boolean VerifyLogoutLink()
	{
		return logoutLink.isDisplayed();
	}
	
	public String VerifyURL()
	{
		return driver.getCurrentUrl();
	}

	
}
