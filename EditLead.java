package week2.day4;


	

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.support.ui.Select;

	public class EditLead {

		public static void main(String[] args) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("guest");
			ChromeDriver driver = new ChromeDriver(options);
			driver.get(("http://leaftaps.com/opentaps/"));
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.partialLinkText("SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
			driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("guji");
			driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("jad");
			driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("A");
			driver.findElement(By.name("departmentName")).sendKeys("ECE");
			driver.findElement(By.name("description")).sendKeys("Software Test Engineer");
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("gayathirirks@gmail.com");
			WebElement source = driver.findElement(By.name("generalStateProvinceGeoId"));
			Select sel = new Select(source);
			sel.selectByVisibleText("New York");

			driver.findElement(By.name("submitButton")).click();
			driver.findElement(By.linkText("Edit")).click();
			driver.findElement(By.name("description")).clear();
			driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("TestLeaf joined");
			driver.findElement(By.name("submitButton")).click();
			String title = driver.getTitle();
			System.out.println(title);
			driver.close();

		}

	}

