package Annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class class2 {

	@AfterMethod 
	public void logout()
	{
		System.out.println("Logout Application ");
	}
	
	@AfterClass
	public void close()
	{
		System.out.println("Closing browser");
	}
	
	@Test
	public void m1()
	{
		System.out.println("Running Test Case 1");
	}
	
	@BeforeClass
	public void open()
	{
		System.out.println("opening browser");
	}
	
	@BeforeMethod
	public void login()
	{
		System.out.println("Logout Application");
	}
	
	@Test
	public void m2()
	{
		System.out.println("Running test case 2");
	}
}
