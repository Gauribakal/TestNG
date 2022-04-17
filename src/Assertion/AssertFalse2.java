package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFalse2 {

	@Test
	public void assertfalse()
	{
		boolean actresult=false;
		Assert.assertFalse(false, "Failed- result is true");
	}
}
