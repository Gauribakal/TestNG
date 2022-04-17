package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _AssertNull {

	@Test
	public void isnull()
	{
		String actresult="asd";
		Assert.assertNull(actresult, "Failed- Result is not null");
	}
}
