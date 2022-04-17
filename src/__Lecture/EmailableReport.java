package __Lecture;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class EmailableReport
{
	@Test
	public void TC1()            //test case or test method
	{
		Reporter.log("--running TC1--",true );
	}
	
	@Test 
	public void TC2()           //test case or test method
	{
		Reporter.log("--running TC2--",true);
	}
	
	@Test 
	public void TC3()           //test case or test method
	{
		Reporter.log("--running TC3--",true);
	}
}
