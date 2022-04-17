package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNull2 {

	@Test
	public void assertnull()
	{
		String actresult="asd";
		Assert.assertNull(actresult, "Failed-result is not null");
	}
}
