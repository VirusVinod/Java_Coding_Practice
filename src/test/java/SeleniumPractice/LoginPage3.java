package SeleniumPractice;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class LoginPage3 {

	public static void main(String[] args) {
		LoginPage3 ll = new LoginPage3();
		ll.setup();
		ll.login();
		ll.validationCheck();
		ll.screnshot();
		ll.addToCart();

	}

// Step 0: Declare driver at class level
	WebDriver driver;

//	Step : 1

	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

//	Step : 2

	public void login() {
		WebElement userName = driver.findElement(By.id("user-name"));
		userName.sendKeys("standard_user");

		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("secret_sauce");

		WebElement loginBtn = driver.findElement(By.id("login-button"));
		loginBtn.click();

	}

//	Step : 3

	public void validationCheck() {

		String expectedResult = "Products";
		WebElement getActualRes = driver.findElement(By.xpath("//div[@class='product_label']"));
		String actualResult = getActualRes.getText();
		Assert.assertEquals(expectedResult, actualResult);

	}

//	Step : 4

	public void screnshot() {
		File screnshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File des = new File("imageeeeeee.jpg");
		try {
			FileUtils.copyFile(screnshot, des);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

//	Step : 5

	public void addToCart() {

		String ExpectedProduct = "Sauce Labs Backpack";
		List<WebElement> findAllProduct = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));

		for (WebElement getAllData : findAllProduct) {

			String actulaProductName = getAllData.getText();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true)", getAllData);

			if (actulaProductName.equals(ExpectedProduct)) {

				WebElement addToCartPro = driver.findElement(By.xpath("//button[@class='btn_primary btn_inventory']"));
				js.executeScript("arguments[0].click()", addToCartPro);
				break;

			}

		}
		driver.quit();

	}

}
