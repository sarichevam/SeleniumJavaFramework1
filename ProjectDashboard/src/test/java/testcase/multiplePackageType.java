package testcase;




import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class multiplePackageType extends BaseClass {
	@Test(priority=1)
	public void LoginTest() throws InterruptedException {

		driver.findElement(By.name("user_id")).sendKeys("msaricheva@engsoftsolutions.com");// locators properties
		Thread.sleep(4000);
		driver.findElement(By.id("user_password")).sendKeys("pims2021");
		Thread.sleep(4000);
		driver.findElement(By.id("EnterButton")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[normalize-space()='ESS LLC - PIMS.NET QA']")).click();
		Thread.sleep(4000);
		String at = driver.getTitle();
		String no = "PIMS";
		// System.out.println(at);
		if (at.equalsIgnoreCase(no)) {
			System.out.println("Test Successful");
		} else {
			System.out.println("Test Failure");

		}
		// Assert.assertTrue(false);
	}
	@Test(priority=2)
	public void TopCategoryAdministration() throws InterruptedException {
	
		driver.get("https://pimsqa.engsoftsolutions.net/pages/administration/vdr/vdrcategorylist.aspx");
		Thread.sleep(4000);
		
		
		//select requirement type
		//Select dropdown = new Select(driver.findElement(By.id("ctl00_cphContent_vdrcategorylist_ddlRequirementType_Arrow")));
		
		//dropdown.selectByVisibleText("VDR");
		//Thread.sleep(4000);
		
		
		driver.findElement(By.xpath("//td[normalize-space()='001 General QA']")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("ctl00$cphContent$vdrcategoryadmin$rdgRequirements$ctl00$ctl04$btnGeneratedFormType")).click();
		Thread.sleep(4000);
		
		
	    driver.findElement(By.cssSelector("#ctl00_cphContent_vdrcategoryadmin_rdwGeneratedFormType_C_rlbGeneratedFormType_i0 > .rlbText")).click();
        driver.findElement(By.cssSelector(".rlbTransferFrom .rlbButtonText")).click();
        
        
        WebElement element = driver.findElement(By.xpath("//li[@id='ctl00_cphContent_vdrcategoryadmin_rdwGeneratedFormType_C_rlbSelectedFormTypes_i0']//span[@class='rlbText'][normalize-space()='418 Data Injection Singular']"));

		// Get the inner text of the element
		String innerText = element.getText();

		// Verify if the inner text matches "6 - Critical Exception"
		if (innerText.equals("418 Data Injection Singular")) {
		    System.out.println("The element has the value '418 Data Injection Singular'");
		} else {
		    System.out.println("The element does not have the value '418 Data Injection Singular'");
		}

		
        
        driver.findElement(By.xpath("//a[@class='rwCloseButton']")).click();
        
        
	}
	@Test(priority=3)
	public void EfeExecution() throws InterruptedException {
		
		
		driver.get("https://pimsqa.engsoftsolutions.net/pages/engineeringdata/systemdetail.aspx?ed=2388");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[normalize-space()='Electronic Forms']")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("ctl00_cphContent_systemMain_systemForm_rdgElectronicCCR_ctl00_ctl04_btnGeneratedForm")).click();
		Thread.sleep(4000);
		
	

		// Wait for the pop-up window to appear and switch to it
		
		
		driver.switchTo().frame("form1");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ctl00_ContentPlaceHolder1_rtbGFIED-93013dfa-93bc-4612-8359-b11766740110-2388-GFPT-81-GFC-109-0-FTQue-217--none--"))).sendKeys("testik");
		
		
		
		
		
		
		
		
		
		
		
	}}
		

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
