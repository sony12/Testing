package SeleniumQTP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class yahoo {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver= new FirefoxDriver();
driver.get("http://www.yahoo.com");
driver.findElement(By.xpath(".//*[@id='p_13838465-p']")).sendKeys("games");
Thread.sleep(3000);
driver.findElement(By.cssSelector("//*[starts-with(@id,'yui_3_8_1_1_']/li/")).getText();
	}

}
