package UtilityTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	static WebDriver driver;
	public static WebDriver startBrowser(String browsername,String url)
	{
		if(browsername.equals("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		 
		driver.manage().window().maximize();
		driver.get(url);
		
		return driver;
		
	}

}
