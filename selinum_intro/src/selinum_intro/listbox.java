package selinum_intro;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.SeleniumMutator;

public class listbox {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com");
		driver.findElement(By.xpath(".//*[@id='nav-xshop']/a[2]")).click();
		driver.findElement(By.xpath(".//*[@id='dealDealPrice']/b")).click();
		driver.findElement(By.id("dealTitleLink")).click();
	String variable=driver.findElement(By.className("productBuyPrice")).getText();
	System.out.println(variable);
	if (variable.equalsIgnoreCase("$11.9"))
	{
		System.out.println("test pass");
	}
	else{
		System.out.println("test fail");
	}
//driver.findElement(By.xpath("//div[@class='assign_grid assign_grid_selected']")).getAttribute("login");

	}

}
