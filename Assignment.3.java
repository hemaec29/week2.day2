package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.testleaf.util.SeleniumUtils;

public class TestUipathAssign3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			ChromeDriver driver = SeleniumUtils.initializeChromeDriver("https://acme-test.uipath.com/login");

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			SeleniumUtils.getWebElementById(driver, "email").sendKeys("kumar.testleaf@gmail.com");
			SeleniumUtils.getWebElementById(driver, "password").sendKeys("leaf@12");
			SeleniumUtils.getWebElementByXPath(driver, "//button[contains(text(),'Login')]").click();
			WebElement pageTitle =SeleniumUtils.getWebElementByXPath(driver, "//a[contains(text(),'ACME System 1')]");
			System.out.println("Text:"+pageTitle.getText());
			SeleniumUtils.getWebElementByXPath(driver, "//a[contains(text(),'Log Out')]").click();
			driver.close();
			
	}catch(Exception e) {
		e.printStackTrace();
	}

}
}