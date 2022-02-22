package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	
	public static void main(String[] args) throws InterruptedException {
		
	  System.setProperty("webdriver.chrome.driver", "G:\\velocity\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	 
	  driver.get("https://www.amazon.in/");
	  
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
//	  driver.manage().window().minimize();
	  
	  Actions act = new Actions(driver);
	  
	  WebElement Sign = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
	  WebElement Sign_in = driver.findElement(By.xpath("(//span[text()='Sign in'])[1]"));
	  
	  act.moveToElement(Sign).click(Sign_in).build().perform();
	  
	  Thread.sleep(3000);
	  
	  WebElement Emailid = driver.findElement(By.xpath("//input[@type='email']"));
	  Emailid.sendKeys("Swapnil.patil757@rediffmail.com");
	  Thread.sleep(3000); 
	   
	    
	    WebElement Login = driver.findElement(By.xpath("//input[contains (@id,'continue')]"));
	    Login.click();
	    Thread.sleep(3000);
	    
	    WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	    password.sendKeys("7387077411");
		Thread.sleep(3000);
		
		 WebElement submit = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		 submit.click();
	     Thread.sleep(3000);
	     
	     WebElement searchtxt = driver.findElement(By.xpath("//input[@type='text']"));
		 searchtxt.sendKeys("watch");
	     Thread.sleep(3000);
	     
	     WebElement search = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		 search.click();
		 Thread.sleep(3000);
		 
		 
		 WebElement Model = driver.findElement(By.xpath("(//body//div//span//h2//a)[1]"));
		 Model.click();
		 Thread.sleep(3000);
		 
		 WebElement Add = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		 Add.click();
		 //Thread.sleep(3000);
	  
	
	}

}
