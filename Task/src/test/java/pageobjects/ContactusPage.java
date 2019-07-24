package pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import com.github.javafaker.Faker;

public class ContactusPage extends BaseClass{
	
	   Faker  faker 	 = new Faker();
	   String firstName  = faker.name().firstName();
	   String lastName	 = faker.name().lastName();
	   String email 	 = faker.internet().emailAddress();
	   String phone      = faker.phoneNumber().cellPhone();
	   String websiteURL = faker.company().url();
	   String companyName = faker.company().name();
	
	public ContactusPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(how=How.XPATH, using="//*[@id='menu-item-3367']/a")
	public static WebElement support;

	
	@FindBy(how=How.XPATH, using="//*[@id='menu-item-179']/a")
	public static WebElement contactus;
	
	
	@FindBy(how=How.NAME, using="first-name")
	public static WebElement firstname;
	
	@FindBy(how=How.NAME, using="last-name")
	public static WebElement lastname;
	
	@FindBy(how=How.NAME, using="email-address")
	public static WebElement emailAddress;
	
	@FindBy(how=How.NAME, using="phone-number")
	public static WebElement phoneNumber;

	@FindBy(how=How.NAME, using="website-url")
	public static WebElement website;
	
	@FindBy(how=How.NAME, using="business-name")
	public static WebElement company;
	
	@FindBy(how=How.NAME, using="reason-for-enquiry")
	public static WebElement reason;
	

	 public void navigatetoContactUS() {
		 support.click();
		 contactus.click();
   }
	

	 public void fillContactUS() {
		 firstname.sendKeys(firstName);
		 lastname.sendKeys(lastName);
		 emailAddress.sendKeys(email);
		 phoneNumber.sendKeys(phone);
		 website.sendKeys(websiteURL);
		 company.sendKeys(companyName);
		 Select dropdown = new Select(reason);
	     dropdown.selectByVisibleText("Accounts");

   }
	

}
