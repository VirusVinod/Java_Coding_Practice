package SeleniumPractice;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class popuphandle {
	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();

		// Disable password manager popup
		Map<String, Object> prefs = new HashMap<>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		options.setExperimentalOption("prefs", prefs);

		// Disable notifications
		options.addArguments("--disable-notifications");

		// Force a fresh Chrome profile (no sync, no saved passwords)
		options.addArguments("--guest");
		// or: options.addArguments("--incognito");

		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.saucedemo.com/v1/");

		WebElement userName = driver.findElement(By.id("user-name"));
		userName.sendKeys("standard_user");

		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("secret_sauce");

		WebElement btnClick = driver.findElement(By.id("login-button"));
		btnClick.click();
		
		
		

		String expectedProduct = "Sauce Labs Onesie";
		List<WebElement> productList = driver.findElements(By.xpath("//div[@class='inventory_item']"));

		for (WebElement product : productList) {
			String productName = product.findElement(By.className("inventory_item_name")).getText();

			if (productName.equals(expectedProduct)) {

				WebElement clickAddToCartBtn = product.findElement(By.cssSelector(".btn_primary.btn_inventory"));

				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true)", clickAddToCartBtn);
				js.executeScript("arguments[0].click()", clickAddToCartBtn);

				System.out.println("Clicked Add to Cart for: " + expectedProduct);
				break;
			}
		}
	}

}
