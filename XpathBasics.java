package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathBasics {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//WebElement elementusername = driver.findElement(By.xpath("(//input[@class = 'inputLogin'])[1]"));
		WebElement elementusername = driver.findElement(By.xpath("(//input[@id = 'username'])"));
		elementusername.sendKeys("Demosalesmanager");
		
		WebElement elementpassword = driver.findElement(By.xpath("(//input[@id = 'password'])"));
		//WebElement elementpassword = driver.findElement(By.xpath("(//input[@class = 'inputLogin'])[2]"));
		elementpassword.sendKeys("crmsfa");
		
		WebElement elementlogin = driver.findElement(By.xpath("//input[@class ='decorativeSubmit']"));
		elementlogin.click();
				
		WebElement elementcrmsfa = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA))]"));
		elementcrmsfa.click();
		
		WebElement elementleads = driver.findElement(By.xpath("(//a[contains(text() ,'Leads')])[1]"));
		elementleads.click();
		
		WebElement elementcreatelead = driver.findElement(By.xpath("//a[contains(text() ,'Create Lead')]"));
		elementcreatelead.click();
			
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Wipro");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hema");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("G");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Govindaraju");
	}

}
