package SeleniumQTP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovements {

	public static void main(String[] args) {
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
driver.get("http://www.mirraw.com");
//driver.findElement(By.xpath("html/body/div[2]/div/ul/li[2]/div/span[1]/ul/li[2]/a")).click();
WebElement jwelery=driver.findElement(By.xpath("html/body/div[2]/div/ul/li[2]/a"));
Actions act = new Actions(driver);
act.moveToElement(jwelery).build().perform();
driver.findElement(By.xpath("html/body/div[2]/div/ul/li[2]/div/span[1]/ul/li[2]/a")).click();
	}

}
