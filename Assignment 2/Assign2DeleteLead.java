package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign2DeleteLead {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement elementusername = driver.findElement(By.id("username"));
		elementusername.sendKeys("Demosalesmanager");

		WebElement elementpassword = driver.findElement(By.id("password"));
		elementpassword.sendKeys("crmsfa");

		WebElement elementlogin = driver.findElement(By.className("decorativeSubmit"));
		elementlogin.click();

		WebElement elementcrmsfa = driver.findElement(By.linkText("CRM/SFA"));
		elementcrmsfa.click();

		WebElement elementleads = driver.findElement(By.linkText("Leads"));
		elementleads.click();

		WebElement elementfindleads = driver.findElement(By.linkText("Find Leads"));
		elementfindleads.click();
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("9677016699");
		driver.findElement(By.xpath("//td[@class ='x-btn-center']//button[text() ='Find Leads']")).click();
		driver.findElement(By.xpath("//div[@id='ext-gen921']/a")).click();
		driver.findElement(By.xpath("//a[text() ='Delete']")).click();
		//WebElement elementfindleads1 = driver.findElement(By.linkText("Find Leads")).click();
		
		//driver.findElement(null)
		
	}

}
