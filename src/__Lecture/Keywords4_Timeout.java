package __Lecture;



import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keywords4_Timeout
{

	@Test(timeOut=5000)
	public void TC1() throws InterruptedException 
	{
		Thread.sleep(3000);
		Reporter.log("---running TC1---");
	}

}
