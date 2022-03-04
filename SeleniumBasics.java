package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testleaf.util.SeleniumUtils;

public class SeleniumBasics {

	public static void main(String[] args) {
		
		try {
		
			ChromeDriver driver = SeleniumUtils.initializeChromeDriver("http://leaftaps.com/opentaps/control/main");
			WebElement elementusername = SeleniumUtils.getWebElementByXPath(driver, "(//input[@class = 'inputLogin'])[1]");
			elementusername.sendKeys("Demosalesmanager");
			
			WebElement elementpassword = SeleniumUtils.getWebElementByXPath(driver, "(//input[@class = 'inputLogin'])[2]");
			elementpassword.sendKeys("crmsfa");
			
			WebElement elementlogin = SeleniumUtils.getWebElementByClassName(driver, "decorativeSubmit");
			elementlogin.click();
					
			WebElement elementcrmsfa = SeleniumUtils.getWebElementByLinkText(driver, "CRM/SFA");
			elementcrmsfa.click();
			
			WebElement elementleads = SeleniumUtils.getWebElementByLinkText(driver,"Leads");
			elementleads.click();
			
			WebElement elementcreatelead = SeleniumUtils.getWebElementByLinkText(driver,"Create Lead");
			elementcreatelead.click();
			
			SeleniumUtils.getWebElementById(driver, "createLeadForm_companyName").sendKeys("Wipro");
			SeleniumUtils.getWebElementById(driver,"createLeadForm_firstName").sendKeys("Hema");
			SeleniumUtils.getWebElementById(driver,"createLeadForm_lastName").sendKeys("G");
			SeleniumUtils.getWebElementByClassName(driver, "smallSubmit").click();
			SeleniumUtils.getWebElementByClassName(driver, "subMenuButton").click();
			SeleniumUtils.getWebElementById(driver, "createLeadForm_lastName").clear();
			SeleniumUtils.getWebElementById(driver, "createLeadForm_lastName").sendKeys("Govindaraju");
			SeleniumUtils.getWebElementByClassName(driver, "smallSubmit").click();

		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
