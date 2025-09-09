package SeleniumPractice;

import java.io.File;
import java.io.IOException;
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

		// Step: 4

		String ExpectedProduct = "Sauce Labs Backpack";
		List<WebElement> getProdcatName = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));

		for (WebElement allProductget : getProdcatName) {
			String actualProduct = allProductget.getText();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true)", allProductget);
			if (actualProduct.equals(ExpectedProduct)) {
				WebElement clickAddToCartItem = driver
						.findElement(By.xpath("//button[@class='btn_primary btn_inventory']"));
				js.executeScript("arguments[0].click()", clickAddToCartItem);
			}

		}
		
		driver.quit();

	}

}
