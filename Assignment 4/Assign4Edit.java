package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign4Edit {

	public static void main(String[] args) {

		try {
			WebDriverManager.chromedriver().setup();

			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leafground.com/pages/Edit.html");
			driver.manage().window().maximize();

			// Enter the Email address
			System.out.println(driver.getTitle());
			driver.findElement(By.id("email")).sendKeys("hemaec29@gmail.com");

			// Append tab
			WebElement AppendElement = driver.findElement(By.xpath("//input[@value ='Append ']"));
			AppendElement.sendKeys("Hello");
			AppendElement.sendKeys(Keys.TAB);

			// Get the default text entered
			System.out.println(driver.findElement(By.xpath("(//input[@name ='username'])[1]")).getAttribute("value"));

			// clear the text
			driver.findElement(By.xpath("(//input[@name ='username'])[2]")).clear();

			// confirm disabled
			System.out.println(driver.findElement(By.xpath("//label[contains(text(),'disabled')]//following-sibling::input")).isEnabled());

			driver.close();

		} catch (Exception e) {
			e.printStackTrace();

		}

	}
}