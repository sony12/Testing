package selinum_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSselector {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.Amazon.com");
		driver.findElement(By.id("nav-subnav")).click();
		//driver.findElement(By.id("nav-xshop").click();//cssSelector("").className("")).click();
		//driver.findElement(By.cssSelector("#nav-your-amazon")).click();
		//driver.findElement(By.cssSelector(".a-row.layer.backGround")).click();
		//driver.findElement(By.cssSelector("#add-to-cart-button")).click();
		//driver.close();
		

	}

}
