package __Lecture_Assertion;



import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_True
{
	@Test
	public void assertTrue() 
	{
		boolean actResult=false;
		Assert.assertTrue(actResult,"-Failed: actResult is false-");
		
	}
}
