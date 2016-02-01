package SeleniumQTP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazon {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.amazon.com");
		driver.manage().window().maximize();
		WebElement box=driver.findElement(By.xpath(".//*[@id='nav-main']/div[3]"));
		List<WebElement> links=box.findElements(By.tagName("a"));
		System.out.println("All links-->"+links.size());
		
		for(int i=0;i<links.size();i++){
			System.out.println("-----------");
			System.out.println(links.get(i).getText());
			links.get(i).click();
			System.out.println(driver.getTitle());
			driver.get("http://www.amazon.com");
			 box=driver.findElement(By.xpath(".//*[@id='nav-main']/div[3]"));
			 links=box.findElements(By.tagName("a"));
			
		}

	}

}
