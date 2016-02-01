package SeleniumQTP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Chitti {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.amazon.com");
		driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[2]")).click();
		//driver.findElement(By.className("nav-text")).click();
		driver.findElement(By.xpath(".//*[@id='ap_email']")).sendKeys("cr27f@mail.umkc.edu");
		driver.findElement(By.id("ap_password")).sendKeys("raju457");
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("camera");
		driver.findElement(By.className("nav-input")).click();
		driver.findElement(By.xpath(".//*[@id='result_0']/div/div/div/div[2]/div[1]/a/h2")).click();
	driver.findElement(By.id("add-to-cart-button")).click();
	driver.findElement(By.id("siNoCoverage-announce")).click();
	driver.findElement(By.id("hlb-ptc-btn-native")).click();
	
	
	}
	
	
	
}
