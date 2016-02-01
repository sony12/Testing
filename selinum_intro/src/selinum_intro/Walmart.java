package selinum_intro;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Walmart {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		driver.get("https://www.walmart.com"); 
driver.findElement(By.xpath(".//*[@id='top']/div[3]/div/div/div/div/div[3]/form/div/div[2]/span/input")).sendKeys("bicycle");
driver.findElement(By.id("content")).sendKeys(Keys.ENTER);

}
}