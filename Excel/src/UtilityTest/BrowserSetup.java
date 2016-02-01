package UtilityTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSetup {
	static WebDriver driver;
	public static WebDriver startBrowser(String browsername,String url)
	{
		if(browsername.equals("firefox")){
			driver=new FirefoxDriver();
		}
		else{
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		
		return driver;
		
	}

}



