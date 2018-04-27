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
public class VerifylinksforHowToGive {
	
	WebDriver driver;
	
	@Test
	
	public void checkStVincentAndersonPage()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
		driver=new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.stvincent.org");	
		
		driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[4]/a")).click();
		
		driver.findElement(By.linkText("St. Vincent Anderson")).click();
		
		String vincentfisher = driver.getTitle();
		
		if(vincentfisher.equals("How to Give"))
		{
			System.out.println("User is Able to access St. Vincent Anderson Page");
		}
		else
		{
			System.out.println("User is Not Able to access St. Vincent Anderson Page");
		}

	}
	
		@Test
			
			public void checkStVincentCardiovascularInstitutePage()
			{
				System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
				driver=new FirefoxDriver();
				//driver.manage().window().maximize();
				driver.get("https://www.stvincent.org");	
				
				driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[4]/a")).click();
				
				driver.findElement(By.linkText("St. Vincent Cardiovascular Institute")).click();
				
				String vincentfisher = driver.getTitle();
				
				if(vincentfisher.equals("How to Give"))
				{
					System.out.println("User is Able to access St. Vincent Cardiovascular Institute Page");
				}
				else
				{
					System.out.println("User is Not Able to access St. Vincent Cardiovascular Institute Page");
				}
		
			}
		
		@Test
		
		public void checkStVincentCarmelPage()
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
			driver=new FirefoxDriver();
			//driver.manage().window().maximize();
			driver.get("https://www.stvincent.org");	
			
			driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[4]/a")).click();
			
			driver.findElement(By.linkText("St. Vincent Carmel")).click();
			
			String vincentfisher = driver.getTitle();
			
			if(vincentfisher.equals("How to Give"))
			{
				System.out.println("User is Able to access St. Vincent Carmel Page");
			}
			else
			{
				System.out.println("User is Not Able to access St. Vincent Carmel Page");
			}
		
		}
		
		@Test
		
		public void checkStVincentClayPage()
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
			driver=new FirefoxDriver();
			//driver.manage().window().maximize();
			driver.get("https://www.stvincent.org");	
			
			driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[4]/a")).click();
			
			driver.findElement(By.linkText("St. Vincent Clay")).click();
			
			String vincentfisher = driver.getTitle();
			
			if(vincentfisher.equals("How to Give"))
			{
				System.out.println("User is Able to access St. Vincent Clay Page");
			}
			else
			{
				System.out.println("User is Not Able to access St. Vincent Clay Page");
			}
		
		}
		
		@Test
		
		public void checkStVincentDunnFoundationPage()
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
			driver=new FirefoxDriver();
			//driver.manage().window().maximize();
			driver.get("https://www.stvincent.org");	
			
			driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[4]/a")).click();
			
			driver.findElement(By.linkText("St. Vincent Dunn Foundation")).click();
			
			String vincentfisher = driver.getTitle();
			
			if(vincentfisher.equals("How to Give"))
			{
				System.out.println("User is Able to access St. Vincent Dunn Foundation Page");
			}
			else
			{
				System.out.println("User is Not Able to access St. Vincent Dunn Foundation Page");
			}
		
		}
	
	@Test
	
	public void checkStVincentEvansvillePage()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
		driver=new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.stvincent.org");	
		
		driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[4]/a")).click();
		
		driver.findElement(By.linkText("St. Vincent Evansville")).click();
		
		String vincentfisher = driver.getTitle();
		
		if(vincentfisher.equals("How to Give"))
		{
			System.out.println("User is Able to access St. Vincent Evansville Page");
		}
		else
		{
			System.out.println("User is Not Able to access St. Vincent Evansville Page");
		}

	}
	
		@Test
			
			public void checkStVincentFishersFoundationPage()
			{
				System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
				driver=new FirefoxDriver();
				//driver.manage().window().maximize();
				driver.get("https://www.stvincent.org");	
				
				driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[4]/a")).click();
				
				driver.findElement(By.linkText("St. Vincent Fishers Foundation")).click();
				
				String vincentfisher = driver.getTitle();
				
				if(vincentfisher.equals("How to Give"))
				{
					System.out.println("User is Able to access St. Vincent Fishers Foundation Page");
				}
				else
				{
					System.out.println("User is Not Able to access St. Vincent Fishers Foundation Page");
				}
		
			}
		
		@Test
		
		public void checkStVincentIndianapolisPage()
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
			driver=new FirefoxDriver();
			//driver.manage().window().maximize();
			driver.get("https://www.stvincent.org");	
			
			driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[4]/a")).click();
			
			driver.findElement(By.linkText("St. Vincent Indianapolis")).click();
			
			String vincentfisher = driver.getTitle();
			
			if(vincentfisher.equals("How to Give"))
			{
				System.out.println("User is Able to access St. Vincent Indianapolis Page");
			}
			else
			{
				System.out.println("User is Not Able to access St. Vincent Indianapolis Page");
			}
		
		}
		
		@Test
		
		public void checkStVincentJenningsFoundationPage()
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
			driver=new FirefoxDriver();
			//driver.manage().window().maximize();
			driver.get("https://www.stvincent.org");	
			
			driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[4]/a")).click();
			
			driver.findElement(By.linkText("St. Vincent Jennings Foundation")).click();
			
			String vincentfisher = driver.getTitle();
			
			if(vincentfisher.equals("How to Give"))
			{
				System.out.println("User is Able to access St. Vincent Jennings Foundation Page");
			}
			else
			{
				System.out.println("User is Not Able to access St. Vincent Jennings Foundation Page");
			}
		
		}
		
		@Test
		
		public void checkStVincentKokomoFoundationPage()
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
			driver=new FirefoxDriver();
			//driver.manage().window().maximize();
			driver.get("https://www.stvincent.org");	
			
			driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[4]/a")).click();
			
			driver.findElement(By.linkText("St. Vincent Kokomo Foundation")).click();
			
			String vincentfisher = driver.getTitle();
			
			if(vincentfisher.equals("How to Give"))
			{
				System.out.println("User is Able to access St. Vincent Kokomo Foundation Page");
			}
			else
			{
				System.out.println("User is Not Able to access St. Vincent Kokomo Foundation Page");
			}
		
		}
		
		@Test
		
		public void checkPeytonManningChildrensHospitalPage()
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
			driver=new FirefoxDriver();
			//driver.manage().window().maximize();
			driver.get("https://www.stvincent.org");	
			
			driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[4]/a")).click();
			
			driver.findElement(By.linkText("Peyton Manning Children's Hospital")).click();
			
			String vincentfisher = driver.getTitle();
			
			if(vincentfisher.equals("How to Give"))
			{
				System.out.println("User is Able to access Peyton Manning Children's Hospital Page");
			}
			else
			{
				System.out.println("User is Not Able to access Peyton Manning Children's Hospital Page");
			}
		
		}
		
		@Test
		
		public void checkStVincentMercyFoundationPage()
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
			driver=new FirefoxDriver();
			//driver.manage().window().maximize();
			driver.get("https://www.stvincent.org");	
			
			driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[4]/a")).click();
			
			driver.findElement(By.linkText("St. Vincent Mercy Foundation")).click();
			
			String vincentfisher = driver.getTitle();
			
			if(vincentfisher.equals("How to Give"))
			{
				System.out.println("User is Able to access St. Vincent Mercy Foundation Page");
			}
			else
			{
				System.out.println("User is Not Able to access St. Vincent Mercy Foundation Page");
			}
		
		}
		
		@Test
		
		public void checkStVincentRandolphFoundationPage()
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
			driver=new FirefoxDriver();
			//driver.manage().window().maximize();
			driver.get("https://www.stvincent.org");	
			
			driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[4]/a")).click();
			
			driver.findElement(By.linkText("St. Vincent Randolph Foundation")).click();
			
			String vincentfisher = driver.getTitle();
			
			if(vincentfisher.equals("How to Give"))
			{
				System.out.println("User is Able to access St. Vincent Randolph Foundation Page");
			}
			else
			{
				System.out.println("User is Not Able to access St. Vincent Randolph Foundation Page");
			}
		
		}
		
		@Test
		
		public void checkStVincentSetonSpecialtyHospitalPage()
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
			driver=new FirefoxDriver();
			//driver.manage().window().maximize();
			driver.get("https://www.stvincent.org");	
			
			driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[4]/a")).click();
			
			driver.findElement(By.linkText("St. Vincent Seton Specialty Hospital")).click();
			
			String vincentfisher = driver.getTitle();
			
			if(vincentfisher.equals("How to Give"))
			{
				System.out.println("User is Able to access St. Vincent Seton Specialty Hospital Page");
			}
			else
			{
				System.out.println("User is Not Able to access St. Vincent Seton Specialty Hospital Page");
			}
		
		}
		
		@Test
		
		public void checkStVincentWilliamsportPage()
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
			driver=new FirefoxDriver();
			//driver.manage().window().maximize();
			driver.get("https://www.stvincent.org");	
			
			driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[4]/a")).click();
			
			driver.findElement(By.linkText("St. Vincent Williamsport")).click();
			
			String vincentfisher = driver.getTitle();
			
			if(vincentfisher.equals("How to Give"))
			{
				System.out.println("User is Able to access St. Vincent Williamsport Page");
			}
			else
			{
				System.out.println("User is Not Able to access St. Vincent Williamsport Page");
			}
		
		}
		
		@Test
		
		public void checkStVincentWomensHospitalPage()
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
			driver=new FirefoxDriver();
			//driver.manage().window().maximize();
			driver.get("https://www.stvincent.org");	
			
			driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[4]/a")).click();
			
			driver.findElement(By.linkText("St. Vincent Women's Hospital")).click();
			
			String vincentfisher = driver.getTitle();
			
			if(vincentfisher.equals("How to Give"))
			{
				System.out.println("User is Able to access St. Vincent Women's Hospital Page");
			}
			else
			{
				System.out.println("User is Not Able to access St. Vincent Women's Hospital Page");
			}
		
		}
		
		@Test
		
		public void checkVolunteerPage()
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
			driver=new FirefoxDriver();
			//driver.manage().window().maximize();
			driver.get("https://www.stvincent.org");	
			
			driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[4]/a")).click();
			
			driver.findElement(By.linkText("Volunteer")).click();
			
			String vincentfisher = driver.getTitle();
			
			if(vincentfisher.equals("How to Give"))
			{
				System.out.println("User is Able to access Volunteer Page");
			}
			else
			{
				System.out.println("User is Not Able to access Volunteer Page");
			}
		
		}
	
		
}
