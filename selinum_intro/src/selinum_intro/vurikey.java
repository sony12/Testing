package selinum_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class vurikey {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.Amazon.com");
		String expectedTitle="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		String ActualTitle=driver.getTitle();
		System.out.println(ActualTitle);
		
		
		if(ActualTitle.contentEquals(expectedTitle)){
			System.out.println("Test Got Right");
		}else{
			System.out.println("Test Got wrong");
		}
		
		driver.close();
		System.exit(0);

	}
	
}
