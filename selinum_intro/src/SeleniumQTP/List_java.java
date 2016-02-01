package SeleniumQTP;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class List_java {

	public static void main(String[] args) {
	List Abc =new ArrayList();
	
	Abc.add("table");
	Abc.add("key");
	Abc.add("Name");
	Abc.add("chair");
	Abc.add("books");
	Abc.add("high");
	System.out.println("Total size is -->"+Abc.size());
	System.out.println(Abc.get(3));
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.bbc.com");
	
	List<WebElement> allLinks= driver.findElements(By.tagName("a"));
	System.out.println("Total Links-->" +allLinks.size());
	WebElement fifthLink = allLinks.get(4);
	System.out.println(fifthLink.getText());
	int x= fifthLink.getLocation().x;
	//fifthLink.click();
	for(int i=0;i<allLinks.size();i++){
		System.out.println(allLinks.get(i).getText()+"-----"+allLinks.get(i).isDisplayed());
	}
	
	
	
	
	
	}
	
	

}
