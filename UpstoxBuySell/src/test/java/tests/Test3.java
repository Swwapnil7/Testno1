package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test3 {
	
	
	@BeforeTest
	@Parameters("browser")
	public void beforeTest(String data) 
	{
		System.out.println(data);
		System.out.println("Before test 3");
	}
	
	@BeforeClass 
	public void beforeClass() 
	{
		System.out.println("Before class");
	} 
	@BeforeMethod 
	public void beforeMethod() 
	{
		System.out.println("before method");
	} 
	@Test 
	public void testD() 
	{
		System.out.println("testD method");
	} 
	@Test 
	public void testE() 
	{
		System.out.println("testE method");
	} 
	@Test
	public void testF() 
	{
		System.out.println("testF method ");
	} 
	@AfterMethod 
	public void afterMethod() 
	{
		System.out.println("after method");
	} 
	@AfterClass 
	public void afterClass() 
	{
		System.out.println("After class");
	} 
	@AfterTest 
	public void afterTest() 
	{
		System.out.println("After test 3");
	} 



}
