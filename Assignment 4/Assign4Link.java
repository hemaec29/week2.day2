package week2.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign4Link {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Where I can link to without clicking on the link
		System.out.println(driver.findElement(By.linkText("Find where am supposed to go without clicking me?"))
				.getAttribute("href"));

		// Verify broken element
		WebElement brokenElement = driver.findElement(By.linkText("Verify am I broken?"));
		System.out.println(brokenElement.getAttribute("href"));
		if (brokenElement.getAttribute("href") != "error.html") {
			System.out.println("Link is Broken");
		} else {
			System.out.println("Link is not broken");
		}
		//count links
		List<WebElement> countLinks = driver.findElements(By.xpath("//a"));
		System.out.println(countLinks.size());
		
		driver.close();
}
}