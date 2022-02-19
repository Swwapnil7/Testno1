package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pro.upstox.IamGood;
import pro.upstox.LoginPage;
import pro.upstox.PassYear;

public class Test1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "G:\\velocity\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
		driver.get("https://login-v2.upstox.com/");
		
		
		LoginPage loginPage = new LoginPage(driver);
//		loginPage.LogintoUpstox();
//		
		PassYear passYear = new PassYear(driver);
		passYear.year();
		
		IamGood clickIamGood = new IamGood(driver);
		clickIamGood.ClickIamGood();
	}

}
