package SeleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class LoginPage4 {
	WebDriver driver;

	public static void main(String[] args) {
		LoginPage4 ll = new LoginPage4();
		ll.setup();
		ll.login();
		ll.validateNavigateUrl();
		ll.clickaItem();
	}

	// Setup: 1
	public void setup() {

		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	// Setup: 2

	public void login() {
		WebElement userName = driver.findElement(By.id("user-name"));
		userName.sendKeys("standard_user");

		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("secret_sauce");

		WebElement lgnBtn = driver.findElement(By.id("login-button"));
		lgnBtn.click();

	}
	// Setup: 2

	public void validateNavigateUrl() {
		String Expectedres = "Products";
		WebElement getvalue = driver.findElement(By.xpath("//div[@class='product_label']"));
		String actualResult = getvalue.getText();
		Assert.assertEquals(Expectedres, actualResult);
		System.out.println(Expectedres + " : " + actualResult);

	}
	// Setup: 3
	
	public void clickaItem() {

		String tragetProduct = "Sauce Labs Backpack";
		List<WebElement> getProductName = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
		for (WebElement ele : getProductName) {
			String allProductNameGet = ele.getText();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true)", getProductName);
			if (allProductNameGet.equals(tragetProduct)) {
				WebElement clickAddtoCart = driver
						.findElement(By.xpath("//button[@class='btn_primary btn_inventory']"));
				js.executeScript("arguments[0].click()", clickAddtoCart);
				break;
			}

			driver.quit();

		}

	}

}
