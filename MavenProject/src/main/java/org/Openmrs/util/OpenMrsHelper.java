package org.Openmrs.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Parameters;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenMrsHelper {
	WebDriver driver;

	public OpenMrsHelper(WebDriver driver) {
		this.driver = driver;
	}

	

	public void login(String username, String password) {
		driver.findElement(By.id("username")).sendKeys("Admin");
		driver.findElement(By.id("password")).sendKeys("Admin123");
		driver.findElement(By.id("Inpatient Ward")).click();
		driver.findElement(By.id("loginButton")).click();
	}

	
	public void logout() {

		driver.findElement(By.xpath("//a[contains(text(),' Logout')]")).click();
//		WebDriverWait wait = new WebDriverWait(driver, 50);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
	}

}
