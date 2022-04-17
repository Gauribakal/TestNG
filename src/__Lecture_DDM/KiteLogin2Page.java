package __Lecture_DDM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class KiteLogin2Page {

	@FindBy(xpath="//input[@id='pin']")	private  WebElement pin;
	@FindBy(xpath="//button[text()='Continue ']")	private WebElement cntBtn;
		
		
		public	KiteLogin2Page(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
			
		
		public void inpKiteLogin2PagePin(String userpin)
		{
			pin.sendKeys(userpin);
		}
		
		public void clickKiteLogin2PageContinueBtn() 
		{
			cntBtn.click();
		}
}
