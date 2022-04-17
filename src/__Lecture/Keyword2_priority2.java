package __Lecture;



import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword2_priority2
{

	@Test               //by default priority=0     //duplicate priority 
	public void TC1() 
	{
		Reporter.log("---running TC1---",true);
	}
	
	@Test                //by default priority=0    //duplicate priority 
	public void TC2() 
	{
		Reporter.log("---running TC2---",true);
	}
	
	@Test(priority=1)              //duplicate priority           
	public void TC3() 
	{
		Reporter.log("---running TC3---",true);
	}
	
	@Test(priority=1)               //duplicate priority 
	public void TC5() 
	{
		Reporter.log("---running TC5---",true);
	}
	
	@Test(priority=-1)              
	public void TC4() 
	{
		Reporter.log("---running TC4---",true);
	}
	

}
