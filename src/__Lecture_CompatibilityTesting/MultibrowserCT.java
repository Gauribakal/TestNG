package __Lecture_CompatibilityTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultibrowserCT {
	
	@Parameters("browerName")
	@Test
	public void TC1(String browerName) throws InterruptedException 
	{		
		WebDriver driver=null;
		if(browerName.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Testing\\Selenium\\ChromeDriver.exe");
			driver=new ChromeDriver();
		}
		else if (browerName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Desktop\\Testing\\Selenium\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if (browerName.equals("opera"))
		{
			System.setProperty("webdriver.opera.driver", "");
			driver=new OperaDriver();
		}
		
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(5000);
		
		driver.close();
		
	}
}
