package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import LoginPage.Scripting;
import UtilityTest.Browser;

public class Final {
	@Test
	public void LoginTest() throws InterruptedException
	{
		WebDriver driver = Browser.startBrowser("Firefox", "https://www.gmail.com");
	Thread.sleep(3000);
Writing Page=PageFactory.initElements(driver,Writing.class);

	Page.yougurt();
	Assert.assertNotNull(driver.findElement(By.tagName("title")));
driver.close();
	}

}


