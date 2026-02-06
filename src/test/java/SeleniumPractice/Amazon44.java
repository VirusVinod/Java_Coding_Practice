package SeleniumPractice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Amazon44 {

	public static void main(String[] args) {

//		Step 01

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//		Step 02

		WebElement SearchItem = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		SearchItem.sendKeys("iphone", Keys.ENTER);

//		Step 03

		String expactedPageNavigate = "Results";
		WebElement page = driver
				.findElement(By.xpath("//h2[@class='a-size-medium-plus a-spacing-none a-color-base a-text-bold']"));
		String actualPageNavigate = page.getText().trim();
		Assert.assertEquals(expactedPageNavigate, actualPageNavigate);

//		Step 04

		String expectedProduct = "iPhone 17 Pro Max 2 TB: 17.42 cm (6.9″) Display with Promotion, A19 Pro Chip, Best Battery Life in Any iPhone Ever, Pro Fusion Camera System, Center Stage Front Camera; Deep Blue";
		List<WebElement> list = driver.findElements(By.xpath("//div[@data-cy='title-recipe']//a//h2"));
		for (WebElement product : list) {

			String actalProduct = product.getText().trim();

			if (actalProduct.equals(expectedProduct)) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true)", product);
				js.executeScript("arguments[0].click()", product);
				break;

			}

		}
//		Step 05

		String parentId = driver.getWindowHandle();
		Set<String> allWin = driver.getWindowHandles();

		for (String w : allWin) {
			if (!parentId.equals(w)) {

				driver.switchTo().window(w);

				WebElement addToCart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true)", addToCart);
				js.executeScript("arguments[0].click()", addToCart);
				break;
			}
		}

//		Step 06

		File screnShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File desti = new File("imageeeee.jpg");
		try {
			FileUtils.copyFile(screnShot, desti);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
