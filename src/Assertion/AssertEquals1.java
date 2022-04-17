package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEquals1 {

	@Test
	
	public void Assertequals()
	{
		String exptext="Bye";
		String Acttext="Bye";
		
		Assert.assertEquals(Acttext, exptext, "Falied--Both text are diff");
	}
}
