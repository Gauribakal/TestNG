package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _AssertNotEquals {

	@Test
	public void asser() 
	{
		String actresult="hii";
		String expresult="hello";
		
		Assert.assertNotEquals(expresult, actresult, "Failed- result is same");
	}
}
