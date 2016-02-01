package SeleniumQTP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Readpage {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver ();
		driver.get("http://www.gmail.com");


		driver.findElement(By.id("Email")).sendKeys("aaaaaa");
		String text=driver.findElement(By.id("Email")).getText();
		System.out.println("text-->" +text);
		text=driver.findElement(By.id("Email")).getAttribute("value");
		System.out.println("Text--> " + text);
	text=driver.findElement(By.id("Email")).getAttribute("placeholder");
	System.out.println("placeholder-->"+text);
        driver.close();
		driver.quit();

	}

}
