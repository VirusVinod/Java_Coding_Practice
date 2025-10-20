package SeleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import junit.framework.Assert;

public class LoginPage5 {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--guest");

//		Step : 01

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//		Step : 02

		WebElement userName = driver.findElement(By.id("user-name"));
		userName.sendKeys("standard_user");

		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("secret_sauce");

		WebElement btnClick = driver.findElement(By.id("login-button"));
		btnClick.click();

//		Step : 03

		String expectedres = "Products";
		WebElement getPageName = driver.findElement(By.xpath("//div[@class='product_label']"));
		String actualRes = getPageName.getText();
		Assert.assertEquals(expectedres, actualRes);

//		Step : 03

		String expectedProduct = "Sauce Labs Fleece Jacket";
		List<WebElement> allProductGet = driver.findElements(By.xpath("//div[@class='inventory_item']"));

		for (WebElement getProd : allProductGet) {
			String productName = getProd.findElement(By.className("inventory_item_name")).getText();
			if (productName.equals(expectedProduct)) {

				WebElement clickAddToCartBtn = getProd.findElement(By.cssSelector(".btn_primary.btn_inventory"));

				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true)", clickAddToCartBtn);
				js.executeScript("arguments[0].click()", clickAddToCartBtn);

				System.out.println("Clicked Add to Cart for: " + expectedProduct);
				break;
				
			}
			
		}
		driver.quit();
	}

}
