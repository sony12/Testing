package SeleniumQTP;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmail_CSSselectors {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver ();
		driver.get("http://www.gmail.com");
		
		driver.findElement(By.cssSelector("input[id^='Ema']")).sendKeys("alluri.amounika@gmail.com"); 
		driver.findElement(By.xpath(".//*[@id='next']")).click();
		//in css selectors
		//^-satrts with
		//$- ends with
		//*-contains
		driver.findElement(By.cssSelector("#passwd")).sendKeys("mouni1203");
		driver.findElement(By.cssSelector("div[class='banner'] h1")).getText();
		
		driver.findElement(By.xpath(".//*[@id='signIn']")).sendKeys(Keys.ENTER);
		
driver.close();
driver.quit();
	}

}
