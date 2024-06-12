package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{
	
	//Creating WebElements
		@FindBy(id="logoutLink"	)
		private WebElement logoutLink;
		
		@FindBy(className="switcherBackground")
		private WebElement switchBG;
		
		@FindBy(id="taskSearchControl_field")
		private WebElement searchTF;
		
	//Constructor
		 public HomePage(WebDriver driver)
		 {
			 super(driver);
		 }
		 
	//Create ActionMethods
		 public void clickLogout()
		 {
			 logoutLink.click();
		 }
		 
		 public void clickSwitchBG()
		 {
			 switchBG.click();
		 }
		 
		 public void enterSearchTF(String search)
		 {
			 searchTF.sendKeys(search);
		 }
		 
		 public boolean VerifyHomePage()
		 {
			 return logoutLink.isDisplayed();
		 }

		
}

