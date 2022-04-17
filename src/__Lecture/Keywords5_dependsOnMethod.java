package __Lecture;



import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class Keywords5_dependsOnMethod
{

	@Test
	public void login()
	{
		Assert.fail();
		Reporter.log("---running login to app TC---");
	}
	
	@Test(dependsOnMethods= {"login"})
	public void logout()
	{
		Reporter.log("---running logout to app TC---");
	}

}
