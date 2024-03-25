package org.maven.SampleTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Fcebooklogintest extends BaseClasstest {

	@BeforeMethod
	public void startUp() {
		browserLaunch("chrome");
	}

	@Test
	public void Facebook() throws InterruptedException {

		maximizeWindow();
		loadUrl("https://www.facebook.com/login");
		WebElement cookies = driver.findElement(By.xpath("//button[@title='Allow all cookies']"));
		cookies.click();
		SendKeys("email", "xyz@gmail.com");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));

		SendKeysXpath("//input[@placeholder='Password']", "xyzser");
		String value = getAttribute("//input[@placeholder='Password']");
		System.out.println(value);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
