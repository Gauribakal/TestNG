package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNull1 {

	@Test
	public void assertnull()
	{
		String actresult=null;
		
		Assert.assertNull(actresult, "Failed- Result is not null");
	}
}
