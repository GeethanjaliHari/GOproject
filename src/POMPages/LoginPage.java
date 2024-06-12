package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//Create WebElements
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(id="loginButton")
	private WebElement login;
	
	@FindBy(id="keepLoggedInLabel")
	private WebElement rememberCheckbox;
	
	@FindBy(linkText="Forgot your password?")
	private WebElement forgotPwd;
	
	// Action methods
	public HomePage login(String uName, String pwd)
	{
		username.sendKeys(uName);
		password.sendKeys(pwd);
		login.click();
		return new HomePage(driver);
	}
	
	public void clickCheckbox()
	{
		rememberCheckbox.click();
	}
	
	public void forgotPwd()
	{
		forgotPwd.click();
	}

}
