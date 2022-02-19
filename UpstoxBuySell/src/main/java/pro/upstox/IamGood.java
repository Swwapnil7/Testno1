package pro.upstox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IamGood {

	
	private Actions act;
	@FindBy (xpath = "//div[text()='No, I’m good']")
	private WebElement good;
	
	public IamGood (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		act = new Actions(driver);
	}
	public void ClickIamGood() 
	{
		act.moveToElement(good).click().build().perform();
	}
	
}
