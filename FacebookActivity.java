package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testleaf.util.SeleniumUtils;

public class FacebookActivity {

	public static void main(String[] args) {
		try {

			ChromeDriver driver = SeleniumUtils.initializeChromeDriver("https://en-gb.facebook.com/");

			WebElement createAccountElement = SeleniumUtils.getWebElementByLinkText(driver, "Create New Account");
			createAccountElement.click();

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			SeleniumUtils.getWebElementByXPath(driver, "//input[@name='firstname']").sendKeys("Hema");
			SeleniumUtils.getWebElementByXPath(driver, "//input[@name='lastname']").sendKeys("G");
			SeleniumUtils.getWebElementByXPath(driver, "//input[@name='reg_email__']").sendKeys("hemaec29@gmail.com");
			SeleniumUtils.getWebElementByXPath(driver, "//input[@name='reg_email_confirmation__']").sendKeys("hemaec29@gmail.com");

			SeleniumUtils.getWebElementById(driver, "password_step_input").sendKeys("hema1234");

			WebElement dateDropdown = SeleniumUtils.getWebElementById(driver, "day");
			WebElement monthDropdown = SeleniumUtils.getWebElementById(driver, "month");
			WebElement yearDropdown = SeleniumUtils.getWebElementById(driver, "year");

			Select dateSelect = new Select(dateDropdown);
			dateSelect.selectByIndex(3);

			Select monthSelect = new Select(monthDropdown);
			monthSelect.selectByIndex(4);

			Select yearSelect = new Select(yearDropdown);
			yearSelect.selectByVisibleText("1990");

			SeleniumUtils.getWebElementByXPath(driver, "//label[contains(text(),'Female')]").click();
			SeleniumUtils.getWebElementByXPath(driver, "//button[@name='websubmit']").click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}