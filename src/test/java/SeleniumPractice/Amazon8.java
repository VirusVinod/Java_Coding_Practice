package SeleniumPractice;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon8 {

	public static void main(String[] args) {

//		Step 01
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//		Step 02

		WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbox.sendKeys("iphone");

		WebElement clicksearchbox = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		clicksearchbox.click();

//		Step 03

		String expectedItem = "iPhone 15 (128 GB) - Black";
		List<WebElement> allProductName = driver.findElements(By.xpath("//div[@data-cy='title-recipe']//a//h2"));

		for (WebElement getAllProduct : allProductName) {
			String actualProduct = getAllProduct.getText().trim();

			if (actualProduct.equals(expectedItem)) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true)", getAllProduct);
				js.executeScript("arguments[0].click()", getAllProduct);
				break;
			}
		}
//		Step 04

		String parentId = driver.getWindowHandle();
		Set<String> allW = driver.getWindowHandles();

		for (String s : allW) {
			if (!parentId.equals(s)) {
				driver.switchTo().window(s);

				WebElement ele = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true)", ele);
				js.executeScript("arguments[0].click()", ele);
				break;
			}

		}

	}

}
