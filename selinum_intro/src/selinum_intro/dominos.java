package selinum_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dominos {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://order.dominos.com");
		driver.findElement(By.xpath("html/body/header/nav/div[3]/ul/li[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='locationsSearchPage']/form/div/div[1]/div[2]/div[1]/div/label[1]/span[1]")).click();
		driver.findElement(By.xpath(".//*[@id='Address_Type_Select']")).sendKeys("hotel");	
		driver.findElement(By.xpath(".//*[@id='Location_Name']")).sendKeys("Holiday inn");		
		driver.findElement(By.xpath(".//*[@id='Street']")).sendKeys("unioncity");	
		driver.findElement(By.xpath(".//*[@id='Address_Line_2']")).sendKeys("33");	
		driver.findElement(By.xpath(".//*[@id='City']")).sendKeys("overlandpark");	
		driver.findElement(By.xpath(".//*[@id='Region']")).sendKeys("CA");	
		driver.findElement(By.xpath(".//*[@id='Postal_Code']")).sendKeys("94587");	
		driver.findElement(By.xpath(".//*[@id='locationsSearchPage']/form/div/div[2]/div[2]/button")).click();
	}

	
}
