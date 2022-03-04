package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign2EditLead {

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

		WebElement elementcreatelead = driver.findElement(By.linkText("Create Lead"));
		elementcreatelead.click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Wipro");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hema");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("G");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Kutty");
		driver.findElement(By.name("departmentName")).sendKeys("ECE");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Hello");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("hemaec29@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9677016699");

		// State dropdown
		WebElement stateDropDownElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd1 = new Select(stateDropDownElement);
		dd1.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();

		// Edit lead
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("Hi Lead");
		driver.findElement(By.name("submitButton")).click();

	}

}
