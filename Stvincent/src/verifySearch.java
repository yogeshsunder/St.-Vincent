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
public class verifySearch {
	
	WebDriver driver;
	
	@Test
	
	public void serachVerification()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
		driver=new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.stvincent.org");
		
		driver.findElement(By.id("multi-search")).sendKeys("test");
		driver.findElement(By.id("searchButton")).click();
		
		String driver1 = driver.findElement(By.id("searchTerm")).getText();
		
		if(driver1.equals("test"))
		{
			System.out.println("User is Able to Search");
		}
			else
			{			
			
			System.out.println("User is Not Able to Search");
			}
		}
	}


