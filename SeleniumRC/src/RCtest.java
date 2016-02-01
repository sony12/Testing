import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;


public class RCtest {

	public static void main(String[] args) {
	 //Selenium 
		//selenium=new DefaultSelenium("localhost",4444,"*firefox*","http://w3schools.com");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.get("http://www.facebook.com");
driver.findElement(By.id("username"));
	}

}
