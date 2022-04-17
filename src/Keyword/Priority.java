package Keyword;

import org.testng.annotations.Test;

public class Priority {

	@Test(priority=1)
	public void m4()
	{
		System.out.println("Running m4");
	}
	
	@Test(priority=0)
	public void m3()
	{
		System.out.println("Running m3");
	}
	
	@Test(priority=-1)
	public void m1()
	{
		System.out.println("Running m1");
	}
	
	@Test(priority=-0)
	public void m2()
	{
		System.out.println("Running m2");
	}
}
