package SeleniumPractice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class LoginPage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement userName = driver.findElement(By.id("user-name"));
		userName.sendKeys("standard_user");

		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("secret_sauce");

		WebElement btnClick = driver.findElement(By.id("login-button"));
		btnClick.click();
		
//		JavascriptExecutor jss = (JavascriptExecutor) driver;
//        jss.executeScript("alert('Login Successful!');");
//        Alert alert = driver.switchTo().alert();
//        System.out.println("Alert message: " + alert.getText());
//        alert.accept(); 

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
		

		

		String targetProductName = "Sauce Labs Backpack";
		List<WebElement> allProductList = driver.findElements(By.xpath("//div[@class='inventory_item']"));
		for (WebElement product : allProductList) {
			String getProductName = driver.findElement(By.xpath("//div[@class='inventory_item_name']")).getText();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true)", product);

			if (getProductName.equals(targetProductName)) {
				WebElement clickAddToCartBtn = driver
						.findElement(By.xpath("//button[@class='btn_primary btn_inventory']"));
				wait.until(ExpectedConditions.visibilityOf(clickAddToCartBtn));
				js.executeScript("arguments[0].click()", clickAddToCartBtn);
				break;

			}

		}

//		driver.quit();

	}

}
