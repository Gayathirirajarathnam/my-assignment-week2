package week2.day4;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.*;
public class DeleteLead {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
				
				// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps");
		driver.get("http://leaftaps.com/opentaps/control/main");

		//maximize the window
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//enter the password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		//click on login
		driver.findElement(By.className("decorativeSubmit")).click();
		//click crmsfa
		driver.findElement(By.partialLinkText("SFA")).click();
		//leads
		driver.findElement(By.linkText("Leads")).click();
		//createlead
				//*[@id="ext-gen858"]
				
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("5556164826");
		WebElement findleads=driver.findElement(By.xpath("//button[text()='Find Leads']"));
		findleads.click();
		driver.findElement(By.linkText("John_1753398592308")).click();

		driver.findElement(By.partialLinkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.partialLinkText("Name and ID")).click();
		driver.findElement(By.name("id")).sendKeys("John_1753398592308");
		WebElement findleads1=driver.findElement(By.xpath("//button[text()='Find Leads']"));
		findleads1.click();
		
	}

}
