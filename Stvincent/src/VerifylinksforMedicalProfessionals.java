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
public class VerifylinksforMedicalProfessionals {
	
		WebDriver driver;
			
			@Test
			
			public void checkPhysicianPortalPage()
			{
				System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
				driver=new FirefoxDriver();
				//driver.manage().window().maximize();
				driver.get("https://www.stvincent.org");	
				
				driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[3]/a/i")).click();
				
				driver.findElement(By.linkText("Physician Portal")).click();
				
				String vincentfisher = driver.getTitle();
				
				if(vincentfisher.equals("Physician Portal"))
				{
					System.out.println("User is Able to access Physician Portal Page");
				}
				else
				{
					System.out.println("User is Not Able to access Physician Portal Page");
				}
		
		}
			
			@Test
			
			public void checkStatflightStatgroundONECallPage()
			{
				System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
				driver=new FirefoxDriver();
				//driver.manage().window().maximize();
				driver.get("https://www.stvincent.org");	
				
				driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[2]/a")).click();
				
				driver.findElement(By.linkText("Statflight, Statground & ONE Call")).click();
				
				String vincentfisher = driver.getTitle();
				
				if(vincentfisher.equals("ONE Call Transfer"))
				{
					System.out.println("User is Able to access Statflight, Statground & ONE Call Page");
				}
				else
				{
					System.out.println("User is Not Able to access Statflight, Statground & ONE Call Page");
				}
		
			}
			
			@Test
			
			public void checkPhysicianNewsEventsPage()
			{
				System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
				driver=new FirefoxDriver();
				//driver.manage().window().maximize();
				driver.get("https://www.stvincent.org");	
				
				driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[2]/a")).click();
				
				driver.findElement(By.linkText("Physician News & Events")).click();
				
				String vincentfisher = driver.getTitle();
				
				if(vincentfisher.equals("News"))
				{
					System.out.println("User is Able to access Physician News & Events Page");
				}
				else
				{
					System.out.println("User is Not Able to access Physician News & Events Page");
				}
		
			}
			
			@Test
			
			public void checkCardiovascularResearchInstitutePage()
			{
				System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
				driver=new FirefoxDriver();
				//driver.manage().window().maximize();
				driver.get("https://www.stvincent.org");	
				
				driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[2]/a")).click();
				
				driver.findElement(By.linkText("Cardiovascular Research Institute")).click();
				
				String vincentfisher = driver.getTitle();
				
				if(vincentfisher.equals("CVRI"))
				{
					System.out.println("User is Able to access Cardiovascular Research Institute Page");
				}
				else
				{
					System.out.println("User is Not Able to access Cardiovascular Research Institute Page");
				}
		
			}
			
			@Test
			
			public void checkClinicalPastoralEducationPage()
			{
				System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
				driver=new FirefoxDriver();
				//driver.manage().window().maximize();
				driver.get("https://www.stvincent.org");	
				
				driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[2]/a")).click();
				
				driver.findElement(By.linkText("Clinical Pastoral Education")).click();
				
				String vincentfisher = driver.getTitle();
				
				if(vincentfisher.equals("Clinical Pastoral Education"))
				{
					System.out.println("User is Able to access Clinical Pastoral Education Page");
				}
				else
				{
					System.out.println("User is Not Able to access Clinical Pastoral Education Page");
				}
		
			}
			
			@Test
			
			public void checkContinuingMedicalEducationPage()
			{
				System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
				driver=new FirefoxDriver();
				//driver.manage().window().maximize();
				driver.get("https://www.stvincent.org");	
				
				driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[2]/a")).click();
				
				driver.findElement(By.linkText("Continuing Medical Education")).click();
				
				String vincentfisher = driver.getTitle();
				
				if(vincentfisher.equals("Continuing Medical Education"))
				{
					System.out.println("User is Able to access Continuing Medical Education Page");
				}
				else
				{
					System.out.println("User is Not Able to access Continuing Medical Education Page");
				}
		
			}
			
			@Test
			
			public void checkCPRBLSClassRegistrationPage()
			{
				System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
				driver=new FirefoxDriver();
				//driver.manage().window().maximize();
				driver.get("https://www.stvincent.org");	
				
				driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[2]/a")).click();
				
				driver.findElement(By.linkText("CPR / BLS Class Registration")).click();
				
				String vincentfisher = driver.getTitle();
				
				if(vincentfisher.equals("CPR / BLS Class Registration"))
				{
					System.out.println("User is Able to access CPR / BLS Class Registration Page");
				}
				else
				{
					System.out.println("User is Not Able to access CPR / BLS Class Registration Page");
				}
		
			}
			
			@Test
			
			public void checkParamedicEMSProgramsPage()
			{
				System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
				driver=new FirefoxDriver();
				//driver.manage().window().maximize();
				driver.get("https://www.stvincent.org");	
				
				driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[2]/a")).click();
				
				driver.findElement(By.linkText("Paramedic & EMS Programs")).click();
				
				String vincentfisher = driver.getTitle();
				
				if(vincentfisher.equals("St. Vincent Indianapolis Emergency Medicine Education Programs"))
				{
					System.out.println("User is Able to access Paramedic & EMS Programs Page");
				}
				else
				{
					System.out.println("User is Not Able to access Paramedic & EMS Programs Page");
				}
		
			}
			
			@Test
			
			public void checkPharmacyResidencyProgramsPage()
			{
				System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
				driver=new FirefoxDriver();
				//driver.manage().window().maximize();
				driver.get("https://www.stvincent.org");	
				
				driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[2]/a")).click();
				
				driver.findElement(By.linkText("Pharmacy Residency Programs")).click();
				
				String vincentfisher = driver.getTitle();
				
				if(vincentfisher.equals("Pharmacy Residency Programs"))
				{
					System.out.println("User is Able to access Pharmacy Residency Programs Page");
				}
				else
				{
					System.out.println("User is Not Able to access Pharmacy Residency Programs Page");
				}
		
			}
			
			@Test
			
			public void checkPhysicianResidenciesFellowshipsPage()
			{
				System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
				driver=new FirefoxDriver();
				//driver.manage().window().maximize();
				driver.get("https://www.stvincent.org");	
				
				driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[2]/a")).click();
				
				driver.findElement(By.linkText("Physician Residencies & Fellowships")).click();
				
				String vincentfisher = driver.getTitle();
				
				if(vincentfisher.equals("Physician Residencies & Fellowships"))
				{
					System.out.println("User is Able to access Physician Residencies & Fellowships Page");
				}
				else
				{
					System.out.println("User is Not Able to access Physician Residencies & Fellowships Page");
				}
		
			}
			
			@Test
			
			public void checkRadiographyProgramPage()
			{
				System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
				driver=new FirefoxDriver();
				//driver.manage().window().maximize();
				driver.get("https://www.stvincent.org");	
				
				driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[2]/a")).click();
				
				driver.findElement(By.linkText("Radiography Program")).click();
				
				String vincentfisher = driver.getTitle();
				
				if(vincentfisher.equals("Radiography Program"))
				{
					System.out.println("User is Able to access Radiography Program Page");
				}
				else
				{
					System.out.println("User is Not Able to access Radiography Program Page");
				}
		
			}
			
			@Test
			
			public void checkRehabClinicalEducationPage()
			{
				System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
				driver=new FirefoxDriver();
				//driver.manage().window().maximize();
				driver.get("https://www.stvincent.org");	
				
				driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[2]/a")).click();
				
				driver.findElement(By.linkText("Rehab Clinical Education")).click();
				
				String vincentfisher = driver.getTitle();
				
				if(vincentfisher.equals("Rehab Clinical Education"))
				{
					System.out.println("User is Able to access Rehab Clinical Education Page");
				}
				else
				{
					System.out.println("User is Not Able to access Rehab Clinical Education Page");
				}
		
			}
			
			@Test
			
			public void checkResearchPage()
			{
				System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
				driver=new FirefoxDriver();
				//driver.manage().window().maximize();
				driver.get("https://www.stvincent.org");	
				
				driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[2]/a")).click();
				
				driver.findElement(By.linkText("Research")).click();
				
				String vincentfisher = driver.getTitle();
				
				if(vincentfisher.equals("Research"))
				{
					System.out.println("User is Able to access Research Page");
				}
				else
				{
					System.out.println("User is Not Able to access Research Page");
				}
		
			}
			
			
			
			
}
