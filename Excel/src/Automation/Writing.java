package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import LoginPage.Coding;
import LoginPage.Scripting;
import UtilityTest.Browser;

public class Writing {
	
WebDriver driver;
	
	public Writing(WebDriver driver)//construter
	{
		this.driver=driver;
	}
	
	
	@FindBy(id="Email")
	WebElement Username;
	
	@FindBy(id="next")
	WebElement Next;
	
	@FindBy(id="Passwd")
	WebElement Password;
	
	
	@FindBy(id="signIn")
	WebElement SignInning;
	
	
	public Writing yougurt() throws InterruptedException 
	{
	
		System.out.println("clicking on the login page");
		Username.sendKeys("sony.dimple1991@gmail.com");
		Next.click();
		Thread.sleep(1000);
		Password.sendKeys("downtoground");
		SignInning.click();
		
		return this;
	}


	
		
	}
	
	
	
	
	

