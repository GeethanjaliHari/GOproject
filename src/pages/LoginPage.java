package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	

	// Creating WebElements
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(id="KeepLoggedInCheckbox")
	private WebElement rememberCheckbox;
	
	@FindBy(linkText="forgot your password")
	private WebElement forgotPwdLink;
	
	// Constructor
	public LoginPage(WebDriver driver)
	{
		super(driver);
		
	}
	// Creating Action methods
	public HomePage login(String uName, String pwd)
	{
		username.sendKeys(uName);
		password.sendKeys(pwd);
		loginButton.click();
		return new HomePage(driver);
	}
	
	public void clickCheckbox()
	{
		rememberCheckbox.click();
	}

	public void clickForgotPwd()
	{
		forgotPwdLink.click();
	}
}
