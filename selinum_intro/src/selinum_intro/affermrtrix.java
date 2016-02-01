package selinum_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class affermrtrix {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://affymetrix.com");
		driver.findElement(By.xpath(".//*[@id='productsNav']")).click();
		driver.findElement(By.xpath(".//*[@id='menu']/li[1]/h2/a")).click();

	}

}
