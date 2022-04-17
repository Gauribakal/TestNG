package Keyword;

import org.testng.annotations.Test;

public class Enable {

	@Test(enabled=false)
	public void m1()
	{
		System.out.println("Running Application 1");
	}
	
	@Test
	public void m2()
	{
		System.out.println("Running test case 2");
	}
}
