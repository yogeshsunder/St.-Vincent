import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * 
 */

/**
 * @author Yogesh
 *
 */
public class VerityLogin {
	
	WebDriver driver;
	
	@Test
	
	public void loginverificationforEnrollment() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
		driver=new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.get("http://uatwagonex.herokuapp.com/signin");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("login_button")).click();
		
		String emailerror = driver.findElement(By.id("login_email_err")).getText();
		
		System.out.println(emailerror);
	}

}
