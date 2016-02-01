package selinum_intro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class facebook {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		EventFiringWebDriver driver1=new EventFiringWebDriver(driver);
		driver1.get("https://www.facebook.com");
		driver1.findElement(By.xpath(".//*[@id='email']")).sendKeys("alluri.amounika@gmail.com");
		driver1.findElement(By.xpath(".//*[@id='pass']")).sendKeys("mouni1203");
	
		driver1.findElement(By.xpath(".//*[@id='u_0_n']")).sendKeys(Keys.ENTER);

		//driver1.findElement(By.xpath(".//*[@id='pagelet_timeline_app_collection_100002588777396:2356318349:2']/ul[2]/li[18]/div/div/div[2]/div/div[2]/div/a")).click();
		
		//driver1.findElement(By.id("fbTimelineHeadline")).click();
		//driver.findElement(By.xpath("//*[@id='pagelet_welcome_box']/div/a/img")).click();
	
		  driver.get("https://www.facebook.com/mouni.alluri/friends?pnref=lhc");
	}		
	
}	
