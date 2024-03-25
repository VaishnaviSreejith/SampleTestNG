package org.maven.SampleTestNG;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdactinHotelBooking {

	WebDriver driver;

	@BeforeMethod
	public void startUp() {
		driver = new ChromeDriver();
	}

	@Test
	public void Booking() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys("vaishnavi321");
		driver.findElement(By.id("password")).sendKeys("vaishnavi");
		driver.findElement(By.id("login")).click();

		Thread.sleep(2000);

		Select selectLocation = new Select(driver.findElement(By.id("location")));
		selectLocation.selectByValue("Sydney");
		driver.findElement(By.id("Submit")).click();

		driver.findElement(By.id("radiobutton_2")).click();

		driver.findElement(By.id("continue")).click();

		driver.findElement(By.id("first_name")).sendKeys("Vaishnavi");
		driver.findElement(By.id("last_name")).sendKeys("Devi");
		driver.findElement(By.id("address")).sendKeys("xxxxxxxxxxxxxxxxxxxxxxxxxxx");

		driver.findElement(By.id("cc_num")).sendKeys("1234567890123456");
		Select selectCard = new Select(driver.findElement(By.id("cc_type")));
		selectCard.selectByValue("AMEX");
		Select selectMonth = new Select(driver.findElement(By.id("cc_exp_month")));
		selectMonth.selectByValue("3");
		Select selectYear = new Select(driver.findElement(By.id("cc_exp_year")));
		selectYear.selectByValue("2025");
		driver.findElement(By.id("cc_cvv")).sendKeys("123");

		driver.findElement(By.id("book_now")).click();
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("process_span"))));
		String OrderNo = driver.findElement(By.id("order_no")).getText();
		System.out.println(OrderNo);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
