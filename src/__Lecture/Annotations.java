package __Lecture;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeClass
	public void openBrowser() 
	{
		Reporter.log("-------open browser--------",true);
	}

	
	@BeforeMethod
	public void loginToApp() 
	{
		Reporter.log("--login to app--",true);
	}

	@Test
	public void verifyUserID1()
	{
		Reporter.log("running verify userid1 TC",true);
	}
	
	@Test
	public void verifyUserID2()
	{
		Reporter.log("running verify userid2 TC",true);
	}
	

	@AfterMethod
	public void logoutFromApp() 
	{
		Reporter.log("--logout from app--",true);
	}
	
	
	@AfterClass
	public void closeBrowser() 
	{
		Reporter.log("--------close browser-------",true);
	}
	
}
