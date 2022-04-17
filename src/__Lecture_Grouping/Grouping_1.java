package __Lecture_Grouping;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping_1 
{
	@Test(groups="Profile")
	public void TC1() 
	{
		Reporter.log("running TC1",true);
	}
	
	@Test(groups="Profile")
	public void TC2() 
	{
		Reporter.log("running TC2",true);
	}
	
	@Test(groups="Login")
	public void TC3() 
	{
		Reporter.log("running TC3",true);
	}
	
	@Test(groups="Fund")
	public void TC4() 
	{
		Reporter.log("running TC4",true);
	}
	
	@Test(groups="Fund")
	public void TC5() 
	{
		Reporter.log("running TC5",true);
	}
	
	@Test(groups="Wishlist")
	public void TC6() 
	{
		Reporter.log("running TC6",true);
	}

}
