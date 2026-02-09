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

public class Amazon45 {

	public static void main(String[] args) {

//		Step 01

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//		Step 02

		WebElement searchItemandEnter = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchItemandEnter.sendKeys("iphone", Keys.ENTER);

//		Step 03

		String expectedValidated = "Results";
		WebElement page = driver
				.findElement(By.xpath("//h2[@class='a-size-medium-plus a-spacing-none a-color-base a-text-bold']"));
		String actualValiudated = page.getText().trim();
		Assert.assertEquals(expectedValidated, actualValiudated);

//		Step 04

		String expectedProduct = "iPhone 17 Pro Max 2 TB: 17.42 cm (6.9″) Display with Promotion, A19 Pro Chip, Best Battery Life in Any iPhone Ever, Pro Fusion Camera System, Center Stage Front Camera; Silver";

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

		String parentId = driver.getWindowHandle();
		Set<String> allwin = driver.getWindowHandles();

		for (String w : allwin) {
			if (!parentId.equals(w)) {
				driver.switchTo().window(w);

				WebElement addtoCart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true)", addtoCart);
				js.executeScript("arguments[0].click()", addtoCart);
				break;
			}
		}

//		Step 06

		File screnShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("imageeeee.jpg");
		try {
			FileUtils.copyFile(screnShot, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
