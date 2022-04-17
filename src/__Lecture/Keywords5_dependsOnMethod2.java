package __Lecture;



import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class Keywords5_dependsOnMethod2{

	@Test
	public void login1()
	{
		Reporter.log("---running login1 to app TC---");
	}
	
	
	@Test
	public void login2()
	{
		Assert.fail();
		Reporter.log("---running login2 to app TC---");
	}
	
	
	@Test(dependsOnMethods= {"login1","login2"})
	public void logout()
	{
		Reporter.log("---running logout to app TC---");
	}

}
