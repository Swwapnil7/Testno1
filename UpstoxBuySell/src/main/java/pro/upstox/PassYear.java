package pro.upstox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PassYear {
	
	
	@FindBy (xpath = "//input[@name='yob']")
	private WebElement year;
	
	public PassYear(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public void year() 
	{
		year.sendKeys("1995");
	}

}
