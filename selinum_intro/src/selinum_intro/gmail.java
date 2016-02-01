package selinum_intro;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmail {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		userBean bean=null;
	xcel_Start start=new xcel_Start();
	
		try {
			
			bean=start.file_exel_values();
		} catch ( Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
driver.get("https://accounts.google.com/ServiceLogin?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&service=mail&sacu=1&scc=1&passive=1209600&acui=1#Email=sony.dimple1991%40gmail.com");
driver.get("https://accounts.google.com/ServiceLogin?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&service=mail&sacu=1&scc=1&passive=1209600&acui=1#password");	
driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys(bean.getPassWord());
System.out.println("*****"+bean.getPassWord());
driver.findElement(By.xpath(".//*[@id='signIn']")).sendKeys(Keys.ENTER);
driver.findElement(By.id(":a7")).click();
driver.findElement(By.xpath(".//*[@id=':fg']/div[2]/table/tbody/tr/td/table[2]/tbody/tr[2]/td[2]/a[2]/span")).click();

	}
	}
