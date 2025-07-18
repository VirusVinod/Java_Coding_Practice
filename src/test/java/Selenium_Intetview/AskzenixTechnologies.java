package Selenium_Intetview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class AskzenixTechnologies {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.askzenixtechnologies.com/contact-us");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		
		WebElement Sumb = driver.findElement(By.id("submit-btn"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", Sumb);
		wait.until(ExpectedConditions.visibilityOf(Sumb));
		js.executeScript("arguments[0].click();", Sumb);
		
		
		
		String expRes = "Enquiry type is required";
		WebElement selectenq = driver.findElement(By.id("enquiry_type_Error"));
		String acres = selectenq.getText();
	
		System.out.println("Expected Result: " + expRes);
		System.out.println("Actual Result: " + acres);

		Assert.assertEquals(expRes, acres);
		
		

		
		
		
		
		
	}

}
