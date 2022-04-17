package __Lecture_Assertion;



import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Null
{
	@Test
	public void assertNull() 
	{
		String actResult="abc";
		Assert.assertNull(actResult,"-Failed: act result is not null-");
		
	}

}
