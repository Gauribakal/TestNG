package Grouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grp1 {

	@Test(groups= "profile")
	public void m1()
	{
		Reporter.log("Running testcase 1", false);
	}
	
	@Test(groups="profile")
	public void m2()
	{
		Reporter.log("Running TC1", true);
	}
	
	@Test(groups="login")
	public void m3()
	{
		Reporter.log("Running TC2", false);
	}
	
	@Test(groups="Singup")
	public void m4()
	{
		Reporter.log("Running TC3", false);
	}
	
}