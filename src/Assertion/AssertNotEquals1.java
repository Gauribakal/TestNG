package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotEquals1 {

	@Test
	public void asser()
	{
		String Actresult="hi";
		String expresult="hi";
		
		Assert.assertNotEquals(Actresult, expresult, "Failed-Result is same");
	}
}




