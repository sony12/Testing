package selinum_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mirraw {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.mirraw.com");
		///driver.switchTo().window(newWindow);
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("html/body/div[2]/div/ul/li[3]/a")).click();
		driver.findElement(By.xpath("html/body/div[2]/div/ul/li[3]/div/span[2]/ul/li[4]/a")).click();
	    //driver.findElement(By.xpath(".//*[@id='catalog']/div[1]/ul/div[1]/li/a/img")).click();
        // driver.findElement(By.xpath(".//*[@id='437255']")).click();
		driver.findElement(By.xpath(".//*[@id='tfheader']/form/input[1]")).sendKeys("Hoops");
		driver.findElement(By.xpath(".//*[@id='tfheader']/form/input[2]")).sendKeys(Keys.ENTER);
		driver.manage().window().maximize() ;
		
		driver.findElement(By.xpath(".//*[@id='price_list']/ul/li[1]/label/input")).click();
		driver.findElement(By.xpath(".//*[@id='d_min']")).sendKeys("20");
		driver.findElement(By.xpath(".//*[@id='d_max']")).sendKeys("40");
		driver.findElement(By.xpath(".//*[@id='discount_list']/div[2]/div[5]/input")).click();

}
}
