package SeleniumPractice;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Amazon27 {

	public static void main(String[] args) {

//		Step 01

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//		Step 02

		WebElement serach = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		serach.sendKeys("iphone");

		WebElement btnSearchClick = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		btnSearchClick.click();

//		Step 03

		String ExpactedPageNavigated = "Results";
		WebElement validatdvalue = driver
				.findElement(By.xpath("//h2[@class='a-size-medium-plus a-spacing-none a-color-base a-text-bold']"));
		String actualValue = validatdvalue.getText().trim();
		Assert.assertEquals(ExpactedPageNavigated, actualValue);
		System.out.println("Expected Value : " + ExpactedPageNavigated);
		System.out.println("Actual Value : " + actualValue);

//		Step 04

		String expectedProduct = "iPhone 15 (128 GB) - Blue";
		List<WebElement> list = driver.findElements(By.xpath("//div[@data-cy='title-recipe']//a//h2"));

		for (WebElement productName : list) {
			String actualProductName = productName.getText().trim();

			if (actualProductName.equals(expectedProduct)) {

				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true)", productName);
				js.executeScript("arguments[0].click()", productName);
				break;

			}
		}

//		Step 05

		String praentId = driver.getWindowHandle();
		Set<String> allwin = driver.getWindowHandles();

		for (String w : allwin) {
			if (!praentId.equals(w)) {
				driver.switchTo().window(w);

				WebElement addTocart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true)", addTocart);
				js.executeScript("arguments[0].click()", addTocart);
				break;
			}
		}

	}

}
