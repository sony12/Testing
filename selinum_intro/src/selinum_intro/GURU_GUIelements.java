package selinum_intro;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GURU_GUIelements {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		//tagName=
				
		driver.findElement(By.id("email")).sendKeys("alluri.amounika@gmail.com");//getTagName();
		driver.findElement(By.id("Password")).sendKeys("m1ows");
		driver.findElement(By.id("login")).sendKeys("enter");
		System.out.println("printed");
		driver.close();
		System.exit(0);
		
		
		

	}

}
