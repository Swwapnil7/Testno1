package pro.upstox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	@FindBy (xpath = "//input[@name='userId']")
	private WebElement UserId;
	
	@FindBy (xpath = "//input[@name='password']")
	private WebElement Password;
	
	@FindBy (xpath = "//div[text()='Sign into Upstox']")
	private WebElement SigninToUpstox;
	
	public LoginPage (WebDriver driver1)
	{
		PageFactory.initElements(driver1, this);
	}
	
	public void sendUserId(String username) 
	{
		UserId.sendKeys(username);
	}
	public void sendPassword(String pass) 
	{
		Password.sendKeys(pass);
	}
	public void signIn() 
	{
		SigninToUpstox.click();
	}
//	
//	public void LogintoUpstox() 
//	{
//		UserId.sendKeys("CK9428");
//		Password.sendKeys("Patil@777");
//		SigninToUpstox.click();
//	}

}
