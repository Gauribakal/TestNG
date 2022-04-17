package __Lecture_Assertion;




import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert
{
	@Test
	public void TC()
	{
		SoftAssert soft=new SoftAssert();
		
		String actResult="Hi";
		String expResult="Hello";
		soft.assertEquals(actResult, expResult,"-Failed1: both results are diff-");
		
		boolean actResult1 = true;
		soft.assertTrue(actResult1, "-Failed2: actresult is false-");
		
		soft.assertAll();
	}
}
