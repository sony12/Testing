package selinum_intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testApp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d1=new FirefoxDriver();
		d1.get("http://yahoo.com");

		WebDriver d2 =new FirefoxDriver();
		d2.get("http://gmail.com");
		
		System.out.println(d1.getTitle());
		System.out.println(d2.getTitle());
		
		Thread.sleep(6000);//should not use all the time
		d1.quit();
		d2.quit();
	}
	

}
