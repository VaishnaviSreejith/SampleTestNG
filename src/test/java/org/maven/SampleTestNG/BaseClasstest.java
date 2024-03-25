package org.maven.SampleTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClasstest {
	static WebDriver driver;

	public static void browserLaunch(String browser) {
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "Edge":
			driver = new EdgeDriver();
			break;

		}

	}

	public static void maximizeWindow() {
		driver.manage().window().maximize();

	}

	public static void loadUrl(String url) {
		driver.get(url);
	}

	public static WebElement findingElement(String value) {
		WebElement element = driver.findElement(By.id(value));
		return element;

	}

	public static void SendKeys(String locator, String value) {
		driver.findElement(By.id(locator)).sendKeys(value);

	}

	public static void SendKeysXpath(String locator, String value) {
		driver.findElement(By.xpath(locator)).sendKeys(value);

	}

	public static String getAttribute(String locator) {
		return driver.findElement(By.xpath(locator)).getAttribute("value");
	}

	public static WebElement findingElementUsingXpath(String value1) {
		WebElement element1 = driver.findElement(By.xpath(value1));
		return element1;

	}
}
