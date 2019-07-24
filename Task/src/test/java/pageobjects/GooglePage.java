package pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class GooglePage extends BaseClass{
	
	
	public GooglePage(WebDriver driver){
		super(driver);
	}    

	
	
	@FindBy(how=How.NAME, using="q")
	public static WebElement search;
	
	@FindBy(how=How.XPATH, using="//*[@id='tsf']/div[2]/div/div[3]/center/input[1]")
	public static WebElement google_search;
	
	@FindBy(how=How.XPATH, using="//*[@id='rso']/div[1]/div/div/div/div/div[1]/a/h3")
	public static WebElement clickOnLink;
			
	 public void searchOnGoogle() {
		 search.sendKeys("securepay");
		 google_search.click();
		
   }
	
	 public void clickSecurePayLink() {
		 clickOnLink.click();
   }
		
	}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
