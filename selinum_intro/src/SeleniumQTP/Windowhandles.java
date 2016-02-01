package SeleniumQTP;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowhandles {

	public static void main(String[] args) {

		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

//1 window
Set<String> windowIds = driver.getWindowHandles();
System.out.println("Total windows opened " + windowIds.size());
Iterator<String> it = windowIds.iterator();
System.out.println(it.next());

 System.out.println("-------------");
driver.get("http://www.amazon.com");
	
//popups
	windowIds = driver.getWindowHandles();
	System.out.println("Total windows opened ->" + windowIds.size());
	it= windowIds.iterator();
	System.out.println(it.next());
	System.out.println(it.next());
	
}
}