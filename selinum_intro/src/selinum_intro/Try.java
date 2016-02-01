package selinum_intro;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Try {

	public static void main(String[] args)  {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		
		
		  driver.findElement(By.id("email")).sendKeys("alluri.amounika@gmail.com");
		  driver.findElement(By.id("pass")).sendKeys("mouni1203");
		  driver.findElement(By.id("loginbutton")).sendKeys(Keys.ENTER);
		 
		
		
		
		 
	driver.findElement(By.id("profile_pic_header_100002588777396")).click();
		 //((WebElement) driver.findElements(By.className("_3d0"))).click();
		 driver.findElement(By.className("_gs6")).click();
		// driver.findElement(By.id("_6-7"));
		
		 driver.findElement(By.xpath(".//*[@id='pagelet_timeline_app_collection_100002588777396:2356318349:2']/ul/li[1]/div/a")).click();

	}



}
