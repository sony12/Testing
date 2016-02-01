package SeleniumQTP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Predicate;

public class ImplictANDExplict {

	

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://makemytrip.com");
	 driver.findElement(By.id("from_typeahead1")).sendKeys("New Delhi");
	 driver.findElement(By.id("to_city_head")).click();
	 
	 //(Explict Wait)--WebDriverwait, FluentWait
	 
	 WebDriverWait wait = new WebDriverWait(driver,40);
	 
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='flights_submit']")));
	 
	 driver.close();
	 driver.quit();
		

	}

	

}
