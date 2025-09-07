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

public class LoginPage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement userName = driver.findElement(By.id("user-name"));
		userName.sendKeys("standard_user");

		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("secret_sauce");

		WebElement btnClick = driver.findElement(By.id("login-button"));
		btnClick.click();

		String expectedres = "Products";
		WebElement proexp = driver.findElement(By.xpath("//div[@class='product_label']"));
		String actualRes = proexp.getText();
		Assert.assertEquals(expectedres, actualRes);

		File screnshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File des = new File("sample.png");
		try {
			FileUtils.copyFile(screnshot, des);
		} catch (IOException e) {
			e.printStackTrace();
		}

		driver.quit();

	}

}
