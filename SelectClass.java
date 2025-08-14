package week2.day4;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.*;
public class SelectClass {

	public static void main(String[] args) {
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
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleafcompany");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("gayathiri");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");

WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
Select sel=new Select(source);
sel.selectByValue("LEAD_EMPLOYEE");

WebElement source1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
Select sel1=new Select(source1);
sel1.selectByVisibleText("Automobile");

WebElement source2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
Select sel2=new Select(source2);
sel2.selectByIndex(5);
String Title=driver.getTitle();
System.out.println(Title);
	}

}
