package selinum_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class petsmart {

	
		public static void main(String[] args) {
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.petsmart.com");
			driver.findElement(By.xpath(".//*[@id='ws-home']/div[2]/div[1]/div/div[4]/ul/li[3]/a/span")).click();
		    driver.findElement(By.xpath(".//*[@id='category']/div[3]/div[1]/div/div[4]/ul/li[3]/a/span")).click();
		    driver.findElement(By.xpath(".//*[@id='category']/div[3]/div[2]/div[2]/div/div[2]/div/ul/li[2]/ul/li[3]/a/span")).click();
		    String variable=driver.findElement(By.xpath(".//*[@id='ws-family']/div[3]/div[2]/div[3]/div/ul/li[1]/div/div[7]/span")).getText();
            driver.findElement(By.xpath(".//*[@id='ws-family']/div[3]/div[2]/div[3]/div/ul/li[1]/div/div[5]/a/h4")).click();
	       driver.findElement(By.xpath(".//*[@id='ws-product']/div[3]/div[2]/div[4]/form/div[2]/div[5]/div[4]/button")).click();
		;
		
		}

}
