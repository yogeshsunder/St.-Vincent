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
public class VerifylinksforHowWeareDifferent {
	
WebDriver driver;
	
//1
		@Test
		
		public void checkAwardsRecognitionPage()
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
			driver=new FirefoxDriver();
			//driver.manage().window().maximize();
			driver.get("https://www.stvincent.org");	
			
			driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[5]/a")).click();
			
			//driver.manage().timeouts().ImplicitlyWait(TimeSpan.FromSeconds(50));
			
			driver.findElement(By.linkText("Awards & Recognition")).click();
			
			String vincentfisher = driver.getTitle();
			
			if(vincentfisher.equals("How We're Different"))
			{
				System.out.println("User is Able to access Awards & Recognition Page");
			}
			else
			{
				System.out.println("User is Not Able to access Awards & Recognition Page");
			}
		
		}
//2		
		@Test
		
		public void checkInYourCommunityPage()
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
			driver=new FirefoxDriver();
			//driver.manage().window().maximize();
			driver.get("https://www.stvincent.org");	
			
			driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[5]/a")).click();
			
			driver.findElement(By.linkText("In Your Community")).click();
			
			String vincentfisher = driver.getTitle();
			
			if(vincentfisher.equals("How We're Different"))
			{
				System.out.println("User is Able to access In Your Community Page");
			}
			else
			{
				System.out.println("User is Not Able to access In Your Community Page");
			}
		
		}
//3
		@Test
		
		public void checkOurQualityDoctorsPage()
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
			driver=new FirefoxDriver();
			//driver.manage().window().maximize();
			driver.get("https://www.stvincent.org");	
			
			driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[5]/a")).click();
			
			driver.findElement(By.linkText("Our Quality Doctors")).click();
			
			String vincentfisher = driver.getTitle();
			
			if(vincentfisher.equals("How We're Different"))
			{
				System.out.println("User is Able to access Our Quality Doctors Page");
			}
			else
			{
				System.out.println("User is Not Able to access Our Quality Doctors Page");
			}
		
		}
//4		
		@Test
		
		public void checkPastoralCarePage()
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
			driver=new FirefoxDriver();
			//driver.manage().window().maximize();
			driver.get("https://www.stvincent.org");	
			
			driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[5]/a")).click();
			
			driver.findElement(By.linkText("Pastoral Care")).click();
			
			String vincentfisher = driver.getTitle();
			
			if(vincentfisher.equals("How We're Different"))
			{
				System.out.println("User is Able to access Pastoral Care Page");
			}
			else
			{
				System.out.println("User is Not Able to access Pastoral Care Page");
			}
		
		}
		
//5
		@Test
		
		public void checkStVincentCentersofExcellencePage()
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
			driver=new FirefoxDriver();
			//driver.manage().window().maximize();
			driver.get("https://www.stvincent.org");	
			
			driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[5]/a")).click();
			
			driver.findElement(By.linkText("St. Vincent Centers of Excellence")).click();
			
			String vincentfisher = driver.getTitle();
			
			if(vincentfisher.equals("How We're Different"))
			{
				System.out.println("User is Able to access St. Vincent Centers of Excellence Page");
			}
			else
			{
				System.out.println("User is Not Able to access St. Vincent Centers of Excellence Page");
			}
		
		}
//6
		@Test
		
		public void checkStVincentMedicalGroupPage()
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
			driver=new FirefoxDriver();
			//driver.manage().window().maximize();
			driver.get("https://www.stvincent.org");	
			
			driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[5]/a")).click();
			
			driver.findElement(By.linkText("St. Vincent Medical Group")).click();
			
			String vincentfisher = driver.getTitle();
			
			if(vincentfisher.equals("How We're Different"))
			{
				System.out.println("User is Able to access St. Vincent Medical Group Page");
			}
			else
			{
				System.out.println("User is Not Able to access St. Vincent Medical Group Page");
			}
		
		}

}
