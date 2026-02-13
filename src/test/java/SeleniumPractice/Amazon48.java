package SeleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Amazon48 {
	public static void main(String[] args) {

//		Step 01

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//		Step 02

		WebElement searchitem = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchitem.sendKeys("iphone");

		WebElement clickSearchBtn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		clickSearchBtn.click();

//		Step 03

		String expectedPage = "Results";
		WebElement pageRes = driver
				.findElement(By.xpath("//h2[@class='a-size-medium-plus a-spacing-none a-color-base a-text-bold']"));
		String actualPage = pageRes.getText().trim();
		Assert.assertEquals(expectedPage, actualPage);

//		Step 04

		String expectedProduct = "iPhone 16 Plus 256 GB: 5G Mobile Phone with Camera Control, A18 Chip and a Big Boost in Battery Life. Works with AirPods; Black";
		List<WebElement> list = driver.findElements(By.xpath("//div[@data-cy='title-recipe']//a//h2"));

		for (WebElement products : list) {

			String actualProduct = products.getText().trim();

			if (actualProduct.equals(expectedProduct)) {

				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true)", products);
				js.executeScript("arguments[0].click()", products);
				break;
			}
		}

	}

}
