package SeleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Amazon30 {

	public static void main(String[] args) {

//		Step 01

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//		Step 02

		WebElement searcItem = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searcItem.sendKeys("iphone", Keys.ENTER);

//		Step 03

		String expectedNavigate = "Results";
		WebElement res = driver
				.findElement(By.xpath("//h2[@class='a-size-medium-plus a-spacing-none a-color-base a-text-bold']"));
		String actualRes = res.getText().trim();
		Assert.assertEquals(expectedNavigate, actualRes);

//		Step 04

		String expectedProduct = "iPhone 16 Pro Max 256 GB: 5G Mobile Phone with Camera Control, 4K 120 fps Dolby Vision and a Huge Leap in Battery Life. Works with AirPods; Black Titanium";
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
