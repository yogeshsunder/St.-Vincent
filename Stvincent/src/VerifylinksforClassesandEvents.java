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
public class VerifylinksforClassesandEvents {
	
	WebDriver driver;
		
		@Test
		
		public void checkStVincentFishersPage()
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
			driver=new FirefoxDriver();
			//driver.manage().window().maximize();
			driver.get("https://www.stvincent.org");	
			
			driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[2]/a")).click();
			
			driver.findElement(By.linkText("St. Vincent Fishers")).click();
			
			String vincentfisher = driver.getTitle();
			
			if(vincentfisher.equals("Events & Programs"))
			{
				System.out.println("User is Able to access St. Vincent Fishers Page");
			}
			else
			{
				System.out.println("User is Not Able to access St. Vincent Fishers Page");
			}
				
		}
		
		@Test
			
			public void checkStVincentIndianapolisPage()
			{
				System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
				driver=new FirefoxDriver();
				//driver.manage().window().maximize();
				driver.get("https://www.stvincent.org");	
				
				driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[2]/a")).click();
				
				driver.findElement(By.linkText("St. Vincent Indianapolis")).click();
				
				String vincentfisher = driver.getTitle();
				
				if(vincentfisher.equals("Events & Programs"))
				{
					System.out.println("User is Able to access St. Vincent Indianapolis Page");
				}
				else
				{
					System.out.println("User is Not Able to access St. Vincent Indianapolis Page");
				}
					
			}
		
		@Test
		
		public void checkStVincentJenningsPage()
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
			driver=new FirefoxDriver();
			//driver.manage().window().maximize();
			driver.get("https://www.stvincent.org");	
			
			driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[2]/a")).click();
			
			driver.findElement(By.linkText("St Vincent Jennings")).click();
			
			String vincentfisher = driver.getTitle();
			
			if(vincentfisher.equals("Events & Programs"))
			{
				System.out.println("User is Able to access St Vincent Jennings Page");
			}
			else
			{
				System.out.println("User is Not Able to access St Vincent Jennings Page");
			}
				
		}
		
		@Test
			
			public void checkStVincentKokomoPage()
			{
				System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
				driver=new FirefoxDriver();
				//driver.manage().window().maximize();
				driver.get("https://www.stvincent.org");	
				
				driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[2]/a")).click();
				
				driver.findElement(By.linkText("St Vincent Kokomo")).click();
				
				String vincentfisher = driver.getTitle();
				
				if(vincentfisher.equals("Events & Programs"))
				{
					System.out.println("User is Able to access St Vincent Kokomo Page");
				}
				else
				{
					System.out.println("User is Not Able to access St Vincent Kokomo Page");
				}
					
			}
	
			@Test
			
			public void checkStVincentMercyPage()
			{
				System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
				driver=new FirefoxDriver();
				//driver.manage().window().maximize();
				driver.get("https://www.stvincent.org");	
				
				driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[2]/a")).click();
				
				driver.findElement(By.linkText("St. Vincent Mercy")).click();
				
				String vincentfisher = driver.getTitle();
				
				if(vincentfisher.equals("St. Vincent Mercy"))
				{
					System.out.println("User is Able to access St. Vincent Mercy Page");
				}
				else
				{
					System.out.println("User is Not Able to access St. Vincent Mercy Page");
				}
			
			}
			
		@Test
				
				public void checkStVincentRandolphPage()
				{
					System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
					driver=new FirefoxDriver();
					//driver.manage().window().maximize();
					driver.get("https://www.stvincent.org");	
					
					driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[2]/a")).click();
					
					driver.findElement(By.linkText("St. Vincent Randolph")).click();
					
					String vincentfisher = driver.getTitle();
					
					if(vincentfisher.equals("St. Vincent Randolph"))
					{
						System.out.println("User is Able to access St. Vincent Randolph Page");
					}
					else
					{
						System.out.println("User is Not Able to access St. Vincent Randolph Page");
					}
				
				}
		
			@Test
			
			public void checkStVincentSalemPage()
			{
				System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
				driver=new FirefoxDriver();
				//driver.manage().window().maximize();
				driver.get("https://www.stvincent.org");	
				
				driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[2]/a")).click();
				
				driver.findElement(By.linkText("St. Vincent Salem")).click();
				
				String vincentfisher = driver.getTitle();
				
				if(vincentfisher.equals("Events & Programs"))
				{
					System.out.println("User is Able to access St. Vincent Salem Page");
				}
				else
				{
					System.out.println("User is Not Able to access St. Vincent Salem Page");
				}
		
		}
	
			@Test
			
			public void checkStVincentWarrickPage()
			{
				System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
				driver=new FirefoxDriver();
				//driver.manage().window().maximize();
				driver.get("https://www.stvincent.org");	
				
				driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[2]/a")).click();
				
				driver.findElement(By.linkText("St Vincent Warrick")).click();
				
				String vincentfisher = driver.getTitle();
				
				if(vincentfisher.equals("Classes & Events - St. Vincent"))
				{
					System.out.println("User is Able to access St Vincent Warrick Page");
				}
				else
				{
					System.out.println("User is Not Able to access St Vincent Warrick Page");
				}
		
		}
			
			@Test
			
			public void checkStVincentWilliamsportPage()
			{
				System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
				driver=new FirefoxDriver();
				//driver.manage().window().maximize();
				driver.get("https://www.stvincent.org");	
				
				driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[2]/a")).click();
				
				driver.findElement(By.linkText("St. Vincent Williamsport")).click();
				
				String vincentfisher = driver.getTitle();
				
				if(vincentfisher.equals("Events and Programs"))
				{
					System.out.println("User is Able to access St. Vincent Williamsport Page");
				}
				else
				{
					System.out.println("User is Not Able to access St. Vincent Williamsport Page");
				}
		
		}
			
		@Test
				
				public void checkStVincentWomenHospitalPage()
				{
					System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
					driver=new FirefoxDriver();
					//driver.manage().window().maximize();
					driver.get("https://www.stvincent.org");	
					
					driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[2]/a")).click();
					
					driver.findElement(By.linkText("St. Vincent Women's Hospital")).click();
					
					String vincentfisher = driver.getTitle();
					
					if(vincentfisher.equals("Maternity Services"))
					{
						System.out.println("User is Able to access St. Vincent Women's Hospital Page");
					}
					else
					{
						System.out.println("User is Not Able to access St. Vincent Women's Hospital Page");
					}
			
			}
		
			@Test
			
			public void checkPeytonManningChildrensHospitalPage()
			{
				System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
				driver=new FirefoxDriver();
				//driver.manage().window().maximize();
				driver.get("https://www.stvincent.org");	
				
				driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[2]/a")).click();
				
				driver.findElement(By.linkText("Peyton Manning Childrens Hospital")).click();
				
				String vincentfisher = driver.getTitle();
				
				if(vincentfisher.equals("Events | Peyton Manning Children's Hospital"))
				{
					System.out.println("User is Able to access Peyton Manning Childrens Hospital Page");
				}
				else
				{
					System.out.println("User is Not Able to access Peyton Manning Childrens Hospital Page");
				}
	
			}
		
			@Test
			
			public void checkStVincentAndersonPage()
			{
				System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
				driver=new FirefoxDriver();
				//driver.manage().window().maximize();
				driver.get("https://www.stvincent.org");	
				
				driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[2]/a")).click();
				
				driver.findElement(By.linkText("St. Vincent Anderson")).click();
				
				String vincentfisher = driver.getTitle();
				
				if(vincentfisher.equals("Events & Programs"))
				{
					System.out.println("User is Able to access St. Vincent Anderson Page");
				}
				else
				{
					System.out.println("User is Not Able to access St. Vincent Anderson Page");
				}
	
			}
			
			@Test
			
			public void checkStVincentCarmelPage()
			{
				System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
				driver=new FirefoxDriver();
				//driver.manage().window().maximize();
				driver.get("https://www.stvincent.org");	
				
				driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[2]/a")).click();
				
				driver.findElement(By.linkText("St. Vincent Carmel")).click();
				
				String vincentfisher = driver.getTitle();
				
				if(vincentfisher.equals("Events & Programs"))
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
				
				driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[2]/a")).click();
				
				driver.findElement(By.linkText("St. Vincent Clay")).click();
				
				String vincentfisher = driver.getTitle();
				
				if(vincentfisher.equals("Events & Programs"))
				{
					System.out.println("User is Able to access St. Vincent Clay Page");
				}
				else
				{
					System.out.println("User is Not Able to access St. Vincent Clay Page");
				}
	
			}
			
			@Test
			
			public void checkStVincentDunnPage()
			{
				System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
				driver=new FirefoxDriver();
				//driver.manage().window().maximize();
				driver.get("https://www.stvincent.org");	
				
				driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[2]/a")).click();
				
				driver.findElement(By.linkText("St. Vincent Dunn")).click();
				
				String vincentfisher = driver.getTitle();
				
				if(vincentfisher.equals("Events & Programs"))
				{
					System.out.println("User is Able to access St. Vincent Dunn Page");
				}
				else
				{
					System.out.println("User is Not Able to access St. Vincent Dunn Page");
				}
	
			}
			
			@Test
				
				public void checkStVincentEvansvillePage()
				{
					System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
					driver=new FirefoxDriver();
					//driver.manage().window().maximize();
					driver.get("https://www.stvincent.org");	
					
					driver.findElement(By.xpath("html/body/nav[1]/div[1]/ul[1]/li[2]/a")).click();
					
					driver.findElement(By.linkText("St. Vincent Evansville")).click();
					
					String vincentfisher = driver.getTitle();
					
					if(vincentfisher.equals("Classes & Events - St. Vincent"))
					{
						System.out.println("User is Able to access St. Vincent Evansville Page");
					}
					else
					{
						System.out.println("User is Not Able to access St. Vincent Evansville Page");
					}
		
				}
	

}
