package __Lecture_Assertion;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_NotNull
{
	@Test
	public void assertNotNull() 
	{
		String actResult=null;
		Assert.assertNotNull(actResult,"-Failed: actResult is null-");
		
	}

}
