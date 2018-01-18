package org.Openmrs.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ActiveVisits {
	WebDriver driver;

	public ActiveVisits(WebDriver driver) {
		this.driver = driver;
	}

	public void activeVistitTest() throws InterruptedException {
		driver.findElement(By.id(
				"org-openmrs-module-coreapps-activeVisitsHomepageLink-org-openmrs-module-coreapps-activeVisitsHomepageLink-extension"))
				.click();
		List<WebElement> names= driver.findElements(By.xpath("//td[2]/a"));
		if(names.size()!=0) {
			names.get(0).click();
		
//		driver.findElement(By.xpath("//a[contains(text(),'pepe')]")).click();
		//Edit Name
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Name')]")).click();
		driver.findElement(By.name("givenName")).clear();
		driver.findElement(By.name("givenName")).sendKeys("Ryan");
		//Edit Gender
		driver.findElement(By.id("genderLabel")).click();
		new Select(driver.findElement(By.name("gender"))).selectByVisibleText("Male");
		
		//Birth date
		driver.findElement(By.id("birthdateLabel")).click();
		driver.findElement(By.name("birthdateDay")).clear();
		driver.findElement(By.name("birthdateDay")).sendKeys("3");
		new Select(driver.findElement(By.name("birthdateMonth"))).selectByVisibleText("March");
	
		driver.findElement(By.name("birthdateYear")).clear();
		driver.findElement(By.name("birthdateYear")).sendKeys("2013 ");
		
		
		driver.findElement(By.xpath("//span[contains(text(),'Confirm')]")).click();
		driver.findElement(By.id("registration-submit")).click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h3[contains(text(),'DIAGNOSES')]")));

	}
		else {
			System.out.println("No names present");
		}
	}
	
		
	}


