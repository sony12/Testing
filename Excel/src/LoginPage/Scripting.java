package LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Scripting {
	
	WebDriver driver;
	
	public Scripting(WebDriver driver)//construter
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
	
	
	public Scripting allways() throws InterruptedException 
	
	{
		System.out.println("clicking on the login page");
		Username.sendKeys("alluri.amounika@gmail.com");
		Next.click();
		Thread.sleep(1000);
		Password.sendKeys("mouni1203");
		SignInning.click();
		
		return this;
	}

	
		
	}
	
	
	
	
	
	
	
	
	
	
	


