package SeleniumQTP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class walmart {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.walmart.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("search")).sendKeys("shoes");
		driver.findElement(By.xpath(".//*[@id='top']/div[3]/div/div/div/div/div[3]/form/div/div[3]/button")).click();
driver.close();
driver.quit();
	}

}
