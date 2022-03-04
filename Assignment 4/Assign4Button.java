package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign4Button {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// find position
		System.out.println(driver.findElement(By.id("position")).getLocation());

		// find color
		System.out.println(driver.findElement(By.id("color")).getCssValue("background-color"));

		// find height and width
		System.out.println(driver.findElement(By.id("size")).getSize());

		// click home button
		driver.findElement(By.id("home")).click();
		
		driver.close();

	}

}
