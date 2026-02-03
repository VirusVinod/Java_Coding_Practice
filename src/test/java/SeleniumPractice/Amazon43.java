package SeleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Amazon43 {

	public static void main(String[] args) {

//		Step 01

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//		Step 02

		WebElement searcItem = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searcItem.sendKeys("iphone");

		WebElement searchbtnclick = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchbtnclick.click();

//		Step 03

		String expectedPage = "Results";
		WebElement page = driver
				.findElement(By.xpath("//h2[@class='a-size-medium-plus a-spacing-none a-color-base a-text-bold']"));
		String actualPage = page.getText().trim();
		Assert.assertEquals(expectedPage, actualPage);

//		Step 04

		String expectedProduct = "iPhone 14 Plus (256 GB) - Midnight";
		List<WebElement> list = driver.findElements(By.xpath("//div[@data-cy='title-recipe']//a//h2"));
		for (WebElement product : list) {

			String actualProduct = product.getText().trim();

			if (actualProduct.equals(expectedProduct)) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true)", product);
				js.executeScript("arguments[0].click()", product);
				break;
			}
		}

	}

}
