package org.Openmrs.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindPntRecord {
	WebDriver driver;
//	*******
//	Changes for verifying branch
//	*************

	public FindPntRecord(WebDriver driver) {
		this.driver = driver;
	}

	public void findPatientMethod() {
		driver.findElement(By.id("coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension"))
				.click();
		driver.findElement(By.id("patient-search")).sendKeys("Ryan");
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='patient-search-results-table']/tbody/tr/td[2]")));
		List<WebElement> names = driver
				.findElements(By.xpath(".//*[@id='patient-search-results-table']/tbody/tr/td[2]"));
		if (names.size() != 0) {
			names.get(0).click();

			
		}
		else {
			System.out.println("No maches found");
		}
	}
}
