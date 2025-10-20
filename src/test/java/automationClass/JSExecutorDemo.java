package automationClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JSExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--guest");

//		Step : 01

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// 1. Get a page title using js

		String pageTitle = (String) js.executeScript("return document.title;");
		System.out.println("Page Title : " + pageTitle);

		WebElement userName = driver.findElement(By.id("user-name"));
		js.executeScript("arguments[0].setAttribute('value', 'standard_user');", userName);
		
		WebElement pass = driver.findElement(By.id("password"));
		js.executeScript("arguments[0].setAttribute('value', 'secret_sauce');", pass);

		WebElement btnClick = driver.findElement(By.id("login-button"));
		
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].scrollIntoView(true)", btnClick);
		js.executeScript("arguments[0].click()", btnClick);




	}

}
