package SeleniumPractice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Amazon24 {

	public static void main(String[] args) throws IOException {

//		Step 01

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//		Step 02

		WebElement searchItem = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchItem.sendKeys("iphone");

		WebElement searchBrnClick = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchBrnClick.click();

//		Step 03

		String expectedvalidated = "Results";
		WebElement validexp = driver
				.findElement(By.xpath("//h2[@class='a-size-medium-plus a-spacing-none a-color-base a-text-bold']"));
		String actualValidated = validexp.getText().trim();
		Assert.assertEquals(expectedvalidated, actualValidated);
		System.out.println("Expected Value : " + expectedvalidated);
		System.out.println("Actual Value : " + actualValidated);

//		Step 04

		String expectedProduct = "iPhone 15 (128 GB) - Blue";
		List<WebElement> list = driver.findElements(By.xpath("//div[@data-cy='title-recipe']//a//h2"));
		for (WebElement productName : list) {

			String actualProduct = productName.getText().trim();

			if (actualProduct.equals(expectedProduct)) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true)", productName);
				js.executeScript("arguments[0].click()", productName);
				break;
			}
		}

//		Step 05

		String praentId = driver.getWindowHandle();
		Set<String> allWin = driver.getWindowHandles();

		for (String s : allWin) {
			if (!praentId.equals(s)) {
				driver.switchTo().window(s);

				WebElement addToCart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true)", addToCart);
				js.executeScript("arguments[0].click()", addToCart);
				break;
			}

		}
//		Step 06

		File screnshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destianation = new File("image.jpg");
		FileUtils.copyFile(screnshot, destianation);
	}

}
