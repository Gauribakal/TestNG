package __Lecture_Assertion;



import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_False
{
	@Test
	public void assertFalse() 
	{
		boolean actResult=true;
		Assert.assertFalse(actResult,"-Failed: actResult is true-");
		
	}

}
