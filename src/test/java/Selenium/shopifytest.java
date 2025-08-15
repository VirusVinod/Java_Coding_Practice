package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class shopifytest {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automation108.myshopify.com/");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));


		WebElement EnterStorePassword =driver.findElement(By.id("password"));
		EnterStorePassword.sendKeys("visitor");

		WebElement enter =driver.findElement(By.xpath("//button[@type='submit']"));
		enter.click();
	}
}
