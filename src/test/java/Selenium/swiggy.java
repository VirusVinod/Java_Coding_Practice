package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class swiggy {

	public static void main(String[] args) {
		swiggy sw = new swiggy();
		sw.home();

	}

	public void home() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement signinClick = driver.findElement(By.xpath("//div[@class='_3chg9']"));
		signinClick.click();

		WebElement mobileNo = driver.findElement(By.id("mobile"));
		mobileNo.sendKeys("8802867320");

		WebElement loginButtonclick = driver.findElement(By.xpath("//div[@class='_1cmcE _3R9Dd']"));
		loginButtonclick.click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement otp = driver.findElement(By.id("otp"));
//		wait.until(ExpectedConditions.elementToBeClickable(otp));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView(true);", otp);
//		js.executeScript("arguments[0].click();", otp);
		otp.sendKeys("000000");

		WebElement veryfyOtp = driver.findElement(By.xpath("//div[@class='_1cmcE _3R9Dd']"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		veryfyOtp.click();

	}

}
