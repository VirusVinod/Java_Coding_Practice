package SeleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon2 {

	public static void main(String[] args) {

		// Step: 01
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement searchItem = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchItem.sendKeys("iphone");

		WebElement clicksearchbtn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		clicksearchbtn.click();

		// Step: 02

		String expectedItem = "iPhone 16 128 GB: 5G Mobile Phone with Camera Control, A18 Chip and a Big Boost in Battery Life. Works with AirPods; White";

		List<WebElement> allItems = driver
				.findElements(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));

		for (WebElement item : allItems) {
			try {
				WebElement titleElement = item.findElement(By.xpath(".//h2/span"));
				String actualItem = titleElement.getText().trim();

				if (actualItem.equals(expectedItem)) {
					WebElement addToCartBtn = item.findElement(By.xpath(".//h2/span"));
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("arguments[0].scrollIntoView(true)", addToCartBtn);
					js.executeScript("arguments[0].click()", addToCartBtn);

					System.out.println("Clicked Add to Cart for: " + expectedItem);
					break;
				}
			} catch (Exception e) {
				System.out.println("Exception while processing item: " + e.getMessage());
			}
		}

//		driver.quit();

	}

}
