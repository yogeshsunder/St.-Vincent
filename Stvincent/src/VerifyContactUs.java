import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


/**
 * 
 */

/**
 * @author Yogesh
 *
 */
public class VerifyContactUs {
	
	WebDriver driver;
	
	@Test
	
	public void contactusverification() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
		driver=new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.stvincent.org");
		
		driver.findElement(By.linkText("Contact")).click();
		
		driver.findElement(By.className("spacertop20")).click();
		
		Thread.sleep(5000);
		
		driver.get("https://stvincent.formstack.com/forms/contact_us");
		
		driver.findElement(By.id("field48728608")).click();
		
		Select drpQuestion = new Select(driver.findElement(By.id("field48728608")));
		
		drpQuestion.selectByVisibleText("Problem with Patient Portal (myhealth.stvincent.org)");
		
		driver.findElement(By.id("field48729051")).sendKeys("Test");
		
		driver.findElement(By.id("field48729113")).sendKeys("Test");
		
		Select drpLocation = new Select(driver.findElement(By.id("field48729407")));
		
		drpLocation.selectByVisibleText("St. Vincent Anderson Regional");
		
		driver.findElement(By.id("field48729923")).sendKeys("Test");
		
		driver.findElement(By.id("field48729926")).sendKeys("Test");
		
		driver.findElement(By.id("field48729957")).sendKeys("Test");
		
		driver.findElement(By.id("field48730012")).sendKeys("1234567891");
		
		driver.findElement(By.id("field48730456-address")).sendKeys("Test");
		
		driver.findElement(By.id("field48730456-city")).sendKeys("Test");
		
		driver.findElement(By.id("field48730456-state")).sendKeys("Test");
		
		driver.findElement(By.id("field48730456-zip")).sendKeys("Test");
		
		driver.findElement(By.id("field48730577_1")).click();
		
		driver.findElement(By.id("field48730639_1")).click();
		
		driver.findElement(By.id("fsSubmitButton2573211")).click();
		
		System.out.println("Your request for contacting stvincent has been sent.");
		
	}

}
