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

public class LoginPage1 {

	public static void main(String[] args) {
//		Step : 1
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
		
//		Step : 2

		String expectedRes = "Products";
		WebElement getPageName = driver.findElement(By.xpath("//div[@class='product_label']"));
		String actualRes = getPageName.getText();
		Assert.assertEquals(expectedRes, actualRes);

//		Step : 3

		File screnshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File des = new File("image.jpg");
		try {
			FileUtils.copyFile(screnshot, des);
		} catch (IOException e) {
			e.printStackTrace();
		}

//		Step : 4
		
		String expectedProduct = "Sauce Labs Onesie";
		List<WebElement> getProductName = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));

		for (WebElement ele : getProductName) {
			String getAllProductName = ele.getText();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true)", ele);
			if (getAllProductName.equalsIgnoreCase(expectedProduct)) {
				WebElement clickAddToCartBtn = driver
						.findElement(By.xpath("//button[@class='btn_primary btn_inventory']"));
				js.executeScript("arguments[0].click()", clickAddToCartBtn);
				break;
			}

		}

	}

}
