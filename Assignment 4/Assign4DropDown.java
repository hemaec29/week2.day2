package week2.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign4DropDown {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// First dropdown - select by index
		WebElement dropDownElement1 = driver.findElement(By.id("dropdown1"));
		Select dd1 = new Select(dropDownElement1);
		dd1.selectByIndex(1);
		System.out.println("The first tab selected option is " + dd1.getFirstSelectedOption().getText());

		// Second dropdown - select by visible text
		WebElement dropDownElement2 = driver.findElement(By.name("dropdown2"));
		Select dd2 = new Select(dropDownElement2);
		dd2.selectByVisibleText("Loadrunner");
		System.out.println("The Second tab selected option is " + dd2.getFirstSelectedOption().getText());

		// Third dropdown - select by value
		WebElement dropDownElement3 = driver.findElement(By.id("dropdown3"));
		Select dd3 = new Select(dropDownElement3);
		dd3.selectByValue("2");
		System.out.println("The Third tab selected option is " + dd3.getFirstSelectedOption().getText());
		
		// Fourth dropdown - get all options
				WebElement dropDownElement4 = driver.findElement(By.className("dropdown"));
				Select dd4 = new Select(dropDownElement4);
				List<WebElement> options = dd4.getOptions();
				for (int i = 0; i < options.size(); i++) {
					System.out.println(options.get(i).getText());				
				}
				
		//Fifth dropdown using sendkeys
				WebElement dropDownElement5 = driver.findElement(By.xpath("//div[@class ='example'][5]//following::select"));
				dropDownElement5.sendKeys("Selenium");
				Select dd5 = new Select(dropDownElement5);
				System.out.println("The Fifth tab selected option is " +dd5.getFirstSelectedOption().getText());
				
		//sixth dropdown
				WebElement dropDownElement6 = driver.findElement(By.xpath("//div[@class ='example'][6]//following::option[@value =\"1\"]"));
				System.out.println(dropDownElement6.getText());		
				driver.close();
	}
	}
