package SeleniumPractice;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Amazon33 {
	public static void main(String[] args) {

//		Step 01

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//		Step 02

		WebElement serchItem = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		serchItem.sendKeys("iphone", Keys.ENTER);

//		Step 03

		String expectedValidated = "Results";
		WebElement Res = driver
				.findElement(By.xpath("//h2[@class='a-size-medium-plus a-spacing-none a-color-base a-text-bold']"));

		String actuaValidated = Res.getText().trim();
		Assert.assertEquals(expectedValidated, actuaValidated);

//		Step 04

		String expectedProduct = "iPhone 15 (256 GB) - Blue";
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

//		Step 05

		String praentid = driver.getWindowHandle();
		Set<String> allWin = driver.getWindowHandles();

		for (String s : allWin) {
			if (!praentid.equals(s)) {
				driver.switchTo().window(s);

				WebElement addToCart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true)", addToCart);
				js.executeScript("arguments[0].click()", addToCart);
				break;

			}
		}

	}

}
