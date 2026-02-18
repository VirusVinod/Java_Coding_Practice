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

public class Amazon50 {

	public static void main(String[] args) {
//		Step 01

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//		Step 02

		WebElement searchItem = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchItem.sendKeys("iphone", Keys.ENTER);

//		Step 03

		String expectedPage = "Results";
		WebElement page = driver
				.findElement(By.xpath("//h2[@class='a-size-medium-plus a-spacing-none a-color-base a-text-bold']"));
		String atualPAge = page.getText().trim();
		Assert.assertEquals(expectedPage, atualPAge);
		
		
//		Step 04

		String expectedProduct = "iPhone 17 Pro Max 2 TB: 17.42 cm (6.9″) Display with Promotion, A19 Pro Chip, Best Battery Life in Any iPhone Ever, Pro Fusion Camera System, Center Stage Front Camera; Silver";
		List<WebElement> list = driver.findElements(By.xpath("//div[@data-cy='title-recipe']//a//h2"));
		for (WebElement product : list) {

			String actaulProduct = product.getText().trim();

			if (actaulProduct.equals(expectedProduct)) {

				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true)", product);
				js.executeScript("arguments[0].click()", product);
				break;
			}

		}
	}

}
