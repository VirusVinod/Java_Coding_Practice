package SeleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Amazon19 {

	public static void main(String[] args) {

//		Step 01

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//		Step 02

		WebElement searchItem = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchItem.sendKeys("iphone");

		WebElement searchItemClick = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchItemClick.click();

//		Step 03

		String expectedvalidated = "Results";
		WebElement getactual = driver
				.findElement(By.xpath("//h2[@class ='a-size-medium-plus a-spacing-none a-color-base a-text-bold']"));
		String actualRes = getactual.getText().trim();
		Assert.assertEquals(expectedvalidated, actualRes);
		System.out.println("Expected Res : " + expectedvalidated);
		System.out.println("Actua Res : " + actualRes);

//		Step 04

		String expectedResult = "iPhone 15 (128 GB) - Blue";
		List<WebElement> list = driver.findElements(By.xpath("//div[@data-cy='title-recipe']//a//h2"));

		for (WebElement name : list) {
			String productName = name.getText().trim();

			if (productName.equals(expectedResult)) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true)", name);
				js.executeScript("arguments[0].click()", name);
				break;
			}
		}
	}

}
