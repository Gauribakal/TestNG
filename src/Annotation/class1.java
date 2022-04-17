package Annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class class1 {

	@Test
	public void t1()
	{
		System.out.println("Running test 2");
	}
	
	@BeforeMethod
	public void Login() 
	{
		System.out.println("Login Successful");
	}
	
	@AfterMethod
	public void Logout()
	{
		System.out.println("Logout Successful");
	}
	
	@AfterClass
	public void close()
	{
		System.out.println("Browser closed ");
	}
	
	@BeforeClass 
	public void open()
	{
		System.out.println("Browser open ");
	}
	
	@Test
	public void m1()
	{
		System.out.println("Running test 1");
	}
	
}
