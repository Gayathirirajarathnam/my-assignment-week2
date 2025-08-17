package week2.day4;

	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.*;

	public class CreateAccountIndex {


		public static void main(String[] args) throws InterruptedException { 
			// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.get("http://leaftaps.com/opentaps/control/main/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.className("crmsfa")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("gayathiri4");
		Thread.sleep(1000);
	    driver.findElement(By.name("description")).sendKeys("Selenium auto Tester");
		Thread.sleep(1000);
		//WebElement source4 = driver.findElement(By.partialLinkText("industryEnumId"));
		//Select sel4=new Select(source4);
		//sel4.selectByIndex(3);
		
		//WebElement source5 = driver.findElement(By.partialLinkText("ownershipEnumId"));
		//Select sel5=new Select(source5);
		//selectByVisibleText("S-Corporation");
		
		WebElement source6 = driver.findElement(By.id("dataSourceId"));
		Select sel6=new Select(source6);
		sel6.selectByValue("LEAD_EMPLOYEE");
		
		WebElement source7 = driver.findElement(By.id("marketingCampaignId"));
		Select sel7=new Select(source7);
		sel7.selectByIndex(6);
		
		WebElement source8 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select sel8=new Select(source8);
		sel8.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(1000);
		
		//driver.findElement(By.className("tabletext")) equals gayathiri3
		
		driver.close();
	}
		}