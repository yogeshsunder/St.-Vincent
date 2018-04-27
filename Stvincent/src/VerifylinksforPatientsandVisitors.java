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
public class VerifylinksforPatientsandVisitors {
	
	WebDriver driver;
	
//1
	
	@Test
	
	public void checkBillingServicesPage()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
		driver=new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.stvincent.org");	
		
		driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[1]/a/i")).click();
		
		driver.findElement(By.linkText("Billing Services")).click();
		
		String billingtitle = driver.getTitle();
		
		if(billingtitle.equals("Billing Services / Assistance"))
		{
			System.out.println("User is Able to access billing-services page");
		}
			else
			{			
			
			System.out.println("User is Not Able to access billing-services page");
			}
		
		
	}
	
//2	
	
	@Test
	
	public void checkLocationspage()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
		driver=new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.stvincent.org");	
		
		driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[1]/a/i")).click();
		
		
		driver.findElement(By.linkText("Find a Location")).click();
		
		String findlocation = driver.getTitle();
		
		if(findlocation.equals("Locations"))
		{
			System.out.println("User is Able to access Locations page");
		}
			else
			{			
			
			System.out.println("User is Not Able to access Locations page");
			}
		
	}
	
//3
	
	@Test

	public void checkGeneralPatientInformationPage()
		{
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
		driver=new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.stvincent.org");	
	
		driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[1]/a/i")).click();
		
		driver.findElement(By.linkText("General Patient Information")).click();
		
		String patientinformation = driver.getTitle();
		
		if(patientinformation.equals("General Patient Information"))
		{
			System.out.println("User is Able to access General Patient Information page");
		}
			else
			{			
			
			System.out.println("User is Not Able to access General Patient Information page");
			}
		
		}
	
//4	
	
	@Test
	
		public void MedicalRecordsPage()
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
			driver=new FirefoxDriver();
			//driver.manage().window().maximize();
			driver.get("https://www.stvincent.org");	
		
			driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[1]/a/i")).click();
			
			driver.findElement(By.linkText("Medical Records")).click();
			
			String medicalrecords = driver.getTitle();
			
			if(medicalrecords.equals("Medical Records"))
			{
				System.out.println("User is Able to access Medical Records page");
			}
				else
				{			
				
				System.out.println("User is Not Able to access Medical Records page");
				}
			
			}
		
//5
	@Test
	
	public void pastoralsocialservicesPage()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
		driver=new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.stvincent.org");	
	
		driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[1]/a/i")).click();
				
		driver.findElement(By.linkText("Pastoral & Social Services")).click();
		
		String pastoralsocialservices = driver.getTitle();
		
		if(pastoralsocialservices.equals("Pastoral &amp; Social Services"))
		{
			System.out.println("User is Able to access Pastoral &amp; Social Services page");
		}
			else
			{			
			
			System.out.println("User is Not Able to access Pastoral &amp; Social Services page");
			}
		
		}
	
	@Test
	
	public void patientPortalPage()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
		driver=new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.stvincent.org");	
	
		driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[1]/a/i")).click();
			
		driver.findElement(By.linkText("Patient Portal")).click();
		
		String patientportal = driver.getTitle();
		
		if(patientportal.equals("Patient Portal"))
		{
			System.out.println("User is Able to access Patient Portal page");
		}
			else
			{			
			
			System.out.println("User is Not Able to access Patient Portal page");
			}
		
	}

	@Test

		public void PatientsRightsResponsibilitiesPage()
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
				driver=new FirefoxDriver();
				//driver.manage().window().maximize();
				driver.get("https://www.stvincent.org");	

				driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[1]/a/i")).click();
	
		
				driver.findElement(By.linkText("Patients Rights & Responsibilities")).click();
		
				String rightresponsibilites = driver.getTitle();
		
				if(rightresponsibilites.equals("About Us"))
				{
					System.out.println("User is Able to access Patients Rights & Responsibilities page");
				}
					else
					{			
			
					System.out.println("User is Not Able to access Patients Rights & Responsibilities page");
					}
		
		}
	
	@Test

	public void searchProvidersPage()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
			driver=new FirefoxDriver();
			//driver.manage().window().maximize();
			driver.get("https://www.stvincent.org");	

			driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[1]/a/i")).click();

		
		driver.findElement(By.linkText("Search Providers")).click();
		
		String searchprovider = driver.getTitle();
		
		if(searchprovider.equals("Search Results - St. Vincent"))
		{
			System.out.println("User is Able to access Search Providers page");
		}
			else
			{			
	
			System.out.println("User is Not Able to access Search Providers page");
			}
	}
		
	@Test
		
		public void vincentCARELinePage()
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
				driver=new FirefoxDriver();
				//driver.manage().window().maximize();
				driver.get("https://www.stvincent.org");	

				driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[1]/a/i")).click();

			
		driver.findElement(By.linkText("St. Vincent CARELine")).click();
		
		String stvincentcareline = driver.getTitle();
		
		if(stvincentcareline.equals("Contact Us"))
		{
			System.out.println("User is Able to access Vincent CARELine page");
		}
			else
			{			
	
			System.out.println("User is Not Able to access Vincent CARELine page");
			}
		
		}
	
	@Test
		
		public void vincentHousePage()
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
				driver=new FirefoxDriver();
				//driver.manage().window().maximize();
				driver.get("https://www.stvincent.org");	

				driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[1]/a/i")).click();

			
		driver.findElement(By.linkText("St. Vincent House")).click();
		
		String vincenthouse = driver.getTitle();
				
				if(vincenthouse.equals("St. Vincent Indianapolis"))
				{
					System.out.println("User is Able to access St. Vincent House page");
				}
					else
					{			
			
					System.out.println("User is Not Able to access St. Vincent House page");
					}
				
				}	
	
	@Test
	
		public void vincentOnDemandPage()
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
				driver=new FirefoxDriver();
				//driver.manage().window().maximize();
				driver.get("https://www.stvincent.org");	

				driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[1]/a/i")).click();

		driver.findElement(By.linkText("St Vincent On Demand")).click();
		
		String vincentondemand = driver.getTitle();
		
		if(vincentondemand.equals("St. Vincent - Online Clinic | St. Vincent OnDemand"))
		{
			System.out.println("User is Able to access St Vincent On Demand page");
		}
			else
			{			
	
			System.out.println("User is Not Able to access St Vincent On Demand page");
			}
		
		}
		
	@Test
		public void vieServicesPage()
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
				driver=new FirefoxDriver();
				//driver.manage().window().maximize();
				driver.get("https://www.stvincent.org");	

				driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[1]/a/i")).click();

		driver.findElement(By.linkText("View Services")).click();
		
		String viewservices = driver.getTitle();
		
		if(viewservices.equals("Services"))
		{
			System.out.println("User is Able to access Services page");
		}
			else
			{			
	
			System.out.println("User is Not Able to access Services page");
			}
		
		}
		
	@Test
		
		public void generalVisitorInformationPage()
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
				driver=new FirefoxDriver();
				//driver.manage().window().maximize();
				driver.get("https://www.stvincent.org");	

				driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[1]/a/i")).click();

		driver.findElement(By.linkText("General Visitor Information")).click();
		
		String generalvisitorinformation = driver.getTitle();
		
		if(generalvisitorinformation.equals("General Visitor Information"))
		{
			System.out.println("User is Able to access General Visitor Information page");
		}
			else
			{			
	
			System.out.println("User is Not Able to access General Visitor Information page");
			}
		
		}
		
	@Test
	
		public void giftShopsPage()
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
				driver=new FirefoxDriver();
				//driver.manage().window().maximize();
				driver.get("https://www.stvincent.org");	

				driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[1]/a/i")).click();

		driver.findElement(By.linkText("Gift Shops")).click();
		
		String giftshops = driver.getTitle();
		
		if(giftshops.equals("General Visitor Information"))
		{
			System.out.println("User is Able to access Gift Shops page");
		}
			else
			{			
	
			System.out.println("User is Not Able to access Gift Shops page");
			}
		
		}
	
	@Test
		
		public void internetAccessPage()
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
				driver=new FirefoxDriver();
				//driver.manage().window().maximize();
				driver.get("https://www.stvincent.org");	

				driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[1]/a/i")).click();

		
		driver.findElement(By.linkText("Internet Access")).click();
		
		String internetaccess = driver.getTitle();
		
		if(internetaccess.equals("General Visitor Information"))
		{
			System.out.println("User is Able to access Internet Access page");
		}
			else
			{			
	
			System.out.println("User is Not Able to access Internet Access page");
			}
		
		}
		
		
	}





