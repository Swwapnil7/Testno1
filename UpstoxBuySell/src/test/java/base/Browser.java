package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser {
	
	public static WebDriver launchBrowserChrome() 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\velocity\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	public static WebDriver launchBrowserEdge() 
	{
		System.setProperty("webdriver.edge.driver", "G:\\velocity\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		return driver;
	}

}
