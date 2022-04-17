package __Lecture_Assertion;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_NotEquals
{
	@Test
	public void assertNotEquals() 
	{
		String actResult="Hello";
		String expResult="Hello";
		
		Assert.assertNotEquals(actResult, expResult,"-Failed: both results are same-");
		
		
	}
}
