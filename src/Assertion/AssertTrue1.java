package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrue1 {

	@Test
	
	public void asserttrue()
	{
		boolean actresult=false;
		Assert.assertTrue(actresult, "Failed result is not true");
	}
}
