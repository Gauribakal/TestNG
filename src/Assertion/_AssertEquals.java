package Assertion;

import org.testng.annotations.Test;


public class _AssertEquals {

	@Test
	
	public void assertEquals()
	{
		String exptext= "hii";
		String acttext= "hi";
		
		org.testng.Assert.assertEquals(acttext, exptext, "Failed:- Both text are not equal");
	}
}
