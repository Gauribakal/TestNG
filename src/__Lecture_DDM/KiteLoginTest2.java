package __Lecture_DDM;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteLoginTest2
{
	int a;     //declare globally
	KiteLogin1Page login1;
	KiteLogin2Page login2;
	KiteHomePage home;
	WebDriver driver;
	Sheet sh;
	
	
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException
	{
		Reporter.log("--Open browser--",true);
		FileInputStream file=new FileInputStream("C:\\Users\\HP\\Desktop\\Testing\\Excel Fetching\\Excel_Data\\Boolen, String & Numeric Data.xlsx");
		sh = WorkbookFactory.create(file).getSheet("DDF");
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Testing\\Selenium\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);		
		 driver.get("https://kite.zerodha.com/");
		
		 login1=new KiteLogin1Page(driver);
	 	 login2=new KiteLogin2Page(driver);
		 home=new KiteHomePage(driver);
		 a=10;              //initialize with method/locally
	

	}
	
	@BeforeMethod
	public void loginToApp()
	{
		System.out.println(a);
		Reporter.log("--Login To App--",true);
		login1.inpKiteLogin1PageUsername(sh.getRow(0).getCell(0).getStringCellValue());
		login1.inpKiteLogin1PagePassword(sh.getRow(0).getCell(1).getStringCellValue());
		login1.clickKiteLogin1PageLoginBtn();
		login2.inpKiteLogin2PagePin(sh.getRow(0).getCell(2).getStringCellValue());
		login2.clickKiteLogin2PageContinueBtn();
	
	}
	
	
	@Test
	public void verifyUserID()
	{
		Reporter.log("running verify User ID TC",true);
		
		String actUserID = home.getKiteHomePageUsrID();
		String expUserId = sh.getRow(0).getCell(3).getStringCellValue();
		Assert.assertEquals(actUserID, expUserId,"--Failed: both results are diff--");
		
		
		//home.verifyKiteHomePageUserID(sh.getRow(0).getCell(3).getStringCellValue());
	}
	
	@AfterMethod
	public void logoutFromApp()
	{
		Reporter.log("--Logout From App--",true);
	}
	
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("--Open browser--",true);
		driver.close();
	}

}
