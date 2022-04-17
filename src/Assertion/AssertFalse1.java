package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFalse1 {

	@Test
	public void assertfalse()
	{
		boolean Actresult= false;
		Assert.assertFalse(Actresult, "Failed-Result is true");
	}
}
