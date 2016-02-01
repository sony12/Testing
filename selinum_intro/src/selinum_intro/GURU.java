package selinum_intro;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GURU {

	public static void main(String[] args) {
		
				WebDriver driver=new FirefoxDriver();
				driver.get("http://newtours.demoaut.com");
				
				String expectedTitle="Welcome:Mercury Tours";
				String actualTitle="";
				
				//ActualTitle=driver.getTitle();
				
				if(actualTitle.contentEquals(expectedTitle)){
					System.out.println("Test Passed!");
				}else{
					System.out.println("Test failed!");
				}
				
				driver.close();
				System.exit(0);
				

	}

}
