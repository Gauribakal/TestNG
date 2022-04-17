package __Lecture_Assertion;



import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Class7
{
	@Test
	public void TC()
	{
		String actResult="Hi";
		String expResult="Hello";
		Assert.assertEquals(actResult, expResult,"-Failed1: both results are diff-");
		
		
		boolean actResult1 = false;
		Assert.assertTrue(actResult1, "-Failed2: actresult is false-");
	}

}
