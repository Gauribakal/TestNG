package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _AssertFalse {

	
	@Test
	public void Assertfalse()
	{
		boolean actresult= true;
		Assert.assertFalse(actresult, "Failed- result is true");
		
	}
}
