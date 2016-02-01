package selinum_intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class dash {

	public static void main(String[] args) throws InterruptedException {
		//WebDriver abc=new FirefoxDriver();
	//	abc.get("http://www.bbc.com");
		//WebDriver xyz=new FirefoxDriver();
		//xyz.get("http://www.yahoo.com");
		//WebDriver ieDriver=new InternetExplorerDriver();
		//ieDriver.get("http://www.eenadu.net");
		//WebDriver driver = new RemoteWebDriver("http://localhost:9515", DesiredCapabilities.chrome());
		//driver.get("http://www.google.com");
		
		System.setProperty("webdriver.chrome.driver", "/Users/SelfService/Downloads/chromedriver");
		WebDriver bcd=new ChromeDriver();
		bcd.get("https://www.facebook.com");
		
		//WebDriver safariDrive=new SafariDriver();
		//safariDrive.get("https://mail.google.com");
		
		
		//System.out.println(abc.getTitle());
		//System.out.println(xyz.getTitle());
		//Thread.sleep(5000);
		
		//abc.quit();
		//xyz.quit();
		
		
	}

}
