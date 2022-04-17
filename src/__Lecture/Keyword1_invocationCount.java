package __Lecture;



import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword1_invocationCount
{

	@Test(invocationCount=5)
	public void TC1() 
	{
		Reporter.log("---running TC1---");
	}

}
