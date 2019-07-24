package stepDefinition;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.ContactusPage;
import pageobjects.GooglePage;



public class selenium {
	
	public WebDriver driver;
	GooglePage 		objGooglePage;
	ContactusPage   objContactusPage;

    
    public selenium()
    {
    	driver = Hooks.driver;
    }

    	@Given("^user search for securepay on www\\.google\\.com\\.au$")
	public void userSearchForSecurepayOnWwwGoogleComAu() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com.au");
        PageFactory.initElements(driver, GooglePage.class);
        objGooglePage = new GooglePage(driver);	
        objGooglePage.searchOnGoogle();
		
	}
	@When("^user navigates to securepay website from serach results$")
	public void userNavigatesToSecurepayWebsiteFromSerachResults() throws Throwable {
		objGooglePage.clickSecurePayLink();
	}
	@And("^user navigates to contact-us$")
	public void userNavigatesToContactUs() throws Throwable {
		 PageFactory.initElements(driver, ContactusPage.class);
		 objContactusPage = new ContactusPage(driver);
		 objContactusPage.navigatetoContactUS();
	}
	@Then("^fill contact us form without submitting$")
	public void fillContactUsFormWithoutSubmitting() throws Throwable {
		objContactusPage.fillContactUS();
	}

	   

}
