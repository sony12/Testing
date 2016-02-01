package LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Coding {
	
WebDriver driver;
	
	public Coding(WebDriver driver){
		
this.driver=driver;

		} 

		@FindBy(id="loginLink") 

		WebElement loginLink;

		@FindBy(id="username") 

		WebElement userNameTextbox;

		@FindBy(id="passwordId") 

		WebElement passwordTextBox; 

		@FindBy(id="loginBtn") 

		WebElement loginButton; 

		@FindBy(id="netAffxNav") 

		WebElement menuBrand; 

		@FindBy(id="logo") 

		WebElement affyHomePageLogo; 

	

		public Coding clickOnLoginLink() 

		{ 

		System.out.println("clicking on the login link"); 

		loginLink.click(); 

		return this; 

		} 

		public Coding logintoAffy() throws InterruptedException 

		{ 

		System.out.println("Logging in to Affymetrix website"); 

		userNameTextbox.sendKeys("nuittester2@gmail.com"); 

		Thread.sleep(1000); 

		passwordTextBox.sendKeys("affy1234"); 

		loginButton.click(); 

		return this; 

		} 

		public boolean isAffyLogoDisplayed() 

		{ 

		boolean flag; 

		System.out.println("Verifying if the affy logo is displayed"); 

		if(affyHomePageLogo.isDisplayed()) 

		{ 

		flag=false; 

		} 

		else 

		{ 

		flag=true; 

		} 

		return flag; 

		} 

		public Coding mouseOverBrand() 

		{ 

		Actions action=new Actions(driver); 

		action.moveToElement(menuBrand).build().perform(); 

		return this; 

		} 

		}