package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import base.Browser;
import pro.upstox.LoginPage;
import pro.upstox.PassYear;
import utilies.Utility;

public class ToVerifyLoginPage extends Browser{
	
	private WebDriver driver;
	private LoginPage login;
	private PassYear passYear;
	private int testID;
	
	static ExtentTest test;
	static ExtentHtmlReporter reporter;
	
	@BeforeTest
	@Parameters("browsers")
	public void launchBrowser(String browser) 
	{
		reporter = new ExtentHtmlReporter("test-output"+File.separator+"ExtendReport"+File.separator+"extendReport.html");
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(reporter);
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver = launchBrowserChrome();
		}
		if(browser.equalsIgnoreCase("msedge"))
		{
			driver = launchBrowserEdge();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@BeforeClass
	public void objectOfPOM() 
	{
		System.out.println("before class");
		login = new LoginPage(driver);
		passYear = new PassYear(driver);
	}
	
	@BeforeMethod
	public void loginToUpstox() throws EncryptedDocumentException, IOException 
	{
	
		System.out.println("Before Method");
		driver.get("https://login-v2.upstox.com/");	
	}

	@Test
	public void testDetails1() throws EncryptedDocumentException, IOException 
	{ 
		
	    testID=100;
		System.out.println("test method 1");
		login = new LoginPage(driver);
		String userN = Utility.getDataFromExcel( 0, 0);
		login.sendUserId(userN);
		String password = Utility.getDataFromExcel( 0, 1);
		login.sendPassword(password);
		login.signIn();
//		String title = driver.getTitle();
//		softAssert.assertEquals(title, "Upstox login");
//		softAssert.assertAll();	
//		Assert.fail();
		
	}
	@Test
	public void testDetails2() throws EncryptedDocumentException, IOException 
	{ 
		
	    testID=101;
		System.out.println("test method 2");
		login = new LoginPage(driver);
		String userN = Utility.getDataFromExcel( 1, 0);
		login.sendUserId(userN);
		String password = Utility.getDataFromExcel( 1, 1);
		login.sendPassword(password);
		login.signIn();
//		String title = driver.getTitle();
//		softAssert.assertEquals(title, "Upstox login");
//		softAssert.assertAll();	
		Assert.fail();
		
	}


	@AfterMethod
	public void reverse(ITestResult result) throws IOException 
	{
		
		if(ITestResult.FAILURE==result.getStatus()) 
		{
			Utility.getScreenShot(driver,testID);
		}
		
		System.out.println("After method");
	//	driver.navigate().back();
	}
	@AfterClass
	public void clearPOMOObjects() 
	{
		login = null;
		passYear = null;
	}
	@AfterTest
	public void garageCleaner() 
	{
	//	driver.quit();
		driver = null;
		passYear = null;
		System.gc();
	}
	
}
