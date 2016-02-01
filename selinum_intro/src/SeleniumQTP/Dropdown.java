package SeleniumQTP;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dropdown {

	public static void main(String[] args) {
		//Select, Count, Print , find the selected

		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.dominos.com/en/pages/order/?locations=1#/locations/");
		
		WebElement dropdown= driver.findElement(By.id("Address_Type_Select"));
		dropdown.sendKeys("Hotel");
	List<WebElement> options = dropdown.findElements(By.tagName("option"));
	System.out.println("Total options-->"+ options.size());
	
	for(int i=0;i<options.size();i++){
		System.out.println(options.get(i).getText()+"---"+options.get(i).getAttribute("Selected"));
	}
		driver.close();
		driver.quit();
	}

}
