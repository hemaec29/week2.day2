package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign4CheckBox {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(
				By.xpath("//label[text() ='Select the languages that you know?']//following-sibling::div/input"))
				.click();

		// confirm Sel is checked
		WebElement confirmSelect = driver
				.findElement(By.xpath("//label[text() ='Confirm Selenium is checked']//following-sibling::div/input"));
		System.out.println("Selenium is selected? " + confirmSelect.isSelected());

		// deselect the selected option
		WebElement deSelect1 = driver
				.findElement(By.xpath("//label[text() ='DeSelect only checked']//following-sibling::div[2]/input"));
		deSelect1.click();

		driver.findElement(By.xpath("//label[text() ='Select all below checkboxes ']//following-sibling::div[1]/input"))
				.click();
		driver.findElement(By.xpath("//label[text() ='Select all below checkboxes ']//following-sibling::div[2]/input"))
				.click();
		driver.findElement(By.xpath("//label[text() ='Select all below checkboxes ']//following-sibling::div[3]/input"))
				.click();
		driver.findElement(By.xpath("//label[text() ='Select all below checkboxes ']//following-sibling::div[4]/input"))
				.click();
		driver.findElement(By.xpath("//label[text() ='Select all below checkboxes ']//following-sibling::div[5]/input"))
				.click();

		

	}

}
