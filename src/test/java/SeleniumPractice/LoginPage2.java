package SeleniumPractice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class LoginPage2 {

	public static void main(String[] args) {

		// Step: 1
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement user = driver.findElement(By.id("user-name"));
		user.sendKeys("standard_user");

		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("secret_sauce");

		WebElement lognbtn = driver.findElement(By.id("login-button"));
		lognbtn.click();

		// Step: 2

		String validatedNavigateUrl = "Products";
		WebElement pageNameGet = driver.findElement(By.xpath("//div[@class='product_label']"));
		String acutualRes = pageNameGet.getText();
		Assert.assertEquals(validatedNavigateUrl, acutualRes);

		// Step: 3

		File screnshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("Login.png");
		try {
			FileUtils.copyFile(screnshot, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
