package SeleniumPractice;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement searchProduct = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchProduct.sendKeys("Iphone");

		WebElement afterSearchClickBtn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		afterSearchClickBtn.click();

		String tragetProductName = "iPhone Air 256 GB: Thinnest iPhone Ever, 16.63 cm (6.5″) Display with Promotion up to 120Hz, Powerful A19 Pro Chip, Center Stage Front Camera, All-Day Battery Life; Space Black";
		List<WebElement> getAllProductList = driver.findElements(By.xpath("//div[@data-cy='title-recipe']//a//h2"));

		for (WebElement product : getAllProductList) {
			String getProductName = product.getText().trim();

			if (getProductName.equalsIgnoreCase(tragetProductName)) {

				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true)", product);
				js.executeScript("arguments[0].click()", product);

				System.out.println("Traget Product Name : " + tragetProductName);
				System.out.println("Click Product Name :  " + getProductName);
				break;

			}
		}

		String pranetId = driver.getWindowHandle();
		System.out.println(pranetId);

		Set<String> allWindows = driver.getWindowHandles();
		for (String s : allWindows) {
			if (!pranetId.equals(s)) {
				driver.switchTo().window(s);
				WebElement addToCart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true)", addToCart);
				js.executeScript("arguments[0].click()", addToCart);
				System.out.println("Clicked Add to Cart button successfully!");
				break;

			}
		}

//		driver.quit();

	}

}
