package selinum_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class mail {

	public static void main(String[] args) {
		WebDriver driver =new FirefoxDriver();
		driver.get("http://www.gmail.com");
	
		driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("alluri.amounika@gmail.com");
		driver.findElement(By.xpath(".//*[@id='next']")).click();
		driver.findElement(By.id("Passwd")).sendKeys("mouni1203");
		
		driver.findElement(By.xpath(".//*[@id='signIn']")).sendKeys(Keys.ENTER);
		//river.findElement(By.id(":a7")).click();
		//driver.findElement(By.xpath(".//*[@id=':fg']/div[2]/table/tbody/tr/td/table[2]/tbody/tr[2]/td[2]/a[2]/span")).click();

			}
			}

	


