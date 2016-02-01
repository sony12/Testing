package SeleniumQTP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class CertificateERROR {

	

	public static void main(String[] args) {
		//FirefoxProfile prof = new FirefoxProfile ();
		//prof.setAcceptUntrustedCertificates(true);
		//prof.setAssumeUntrustedCertificateIssuer(true);
		//WebDriver driver= new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "/Users/SelfService/Downloads/chromedriver");
WebDriver driver= new ChromeDriver();

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get("https://onlineservices.tin.nsdl.com/etaxnew/tdsnontds.jsp");
	}
	
}
