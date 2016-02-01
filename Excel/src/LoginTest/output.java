package LoginTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import LoginPage.Coding;
import UtilityTest.Browser;

public class output {
	
	public void loginTest() throws InterruptedException 

	{ 

	WebDriver driver=Browser.startBrowser("firefox", "https://www.affymetrix.com");

	Thread.sleep(3000); 

	Coding loginPage=PageFactory.initElements(driver, Coding.class); 

	loginPage.clickOnLoginLink(); 

	Thread.sleep(3000);

	loginPage.logintoAffy(); 

	Thread.sleep(30000);

	Assert.assertEquals(loginPage.isAffyLogoDisplayed(), true); 

	loginPage.mouseOverBrand(); 

	Thread.sleep(1000);

	driver.close(); 

	}

}
