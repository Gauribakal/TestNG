package __Lecture_Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _assertEquals
{
	@Test
	public void assertEquals() 
	{
		String actResult="Hello";
		String expResult="Hello";
		
		Assert.assertEquals(actResult, expResult,"-Failed: both results are diff-");
		
		
	}
}
