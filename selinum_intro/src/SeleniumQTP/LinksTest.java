package SeleniumQTP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksTest {

	public static void main(String[] args) {
		
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.bbc.com");
		//driver.findElement(By.xpath(".//*[@id='page']/section[2]/div/ul/li[1]/div/a")).click();
		//driver.findElement(By.linkText("News")).click();
		//driver.findElement(By.partialLinkText("Russia")).click();
		String url=driver.findElement(By.xpath(".//*[@id='orb-nav-links']/ul/li[1]/a")).getAttribute("href");
		System.out.println(url);
		driver.findElement(By.cssSelector(""));
	}

}
