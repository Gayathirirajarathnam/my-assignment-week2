package week2.day3;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.*;

public class CreateAccountG {


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
	driver.findElement(By.id("accountName")).sendKeys("gayathiri1");
	Thread.sleep(1000);
    driver.findElement(By.name("description")).sendKeys("Selenium auto Tester");
	Thread.sleep(1000);
	driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
	driver.findElement(By.className("smallSubmit")).click();
	driver.close();
	}
	}


