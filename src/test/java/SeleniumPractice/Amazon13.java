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

public class Amazon13 {

	public static void main(String[] args) {

//		Step 01

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//		Step 02

		WebElement secrchItem = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		secrchItem.sendKeys("iphone");

		WebElement clickItem = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		clickItem.click();

//		Step 03

		String expectedItem = "iPhone 17 Pro Max 512 GB: 17.42 cm (6.9″) Display with Promotion, A19 Pro Chip, Best Battery Life in Any iPhone Ever, Pro Fusion Camera System, Center Stage Front Camera; Deep Blue";

		List<WebElement> findlist = driver.findElements(By.xpath("//div[@data-cy='title-recipe']//a//h2"));

		for (WebElement product : findlist) {

			String getProduct = product.getText().trim();

			if (getProduct.equals(expectedItem)) {

				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true)", product);
				js.executeScript("arguments[0].click()", product);
				break;
			}

		}

//		Step 04

		String parentId = driver.getWindowHandle();
		Set<String> allwind = driver.getWindowHandles();

		for (String w : allwind) {
			if (!parentId.equals(w)) {
				driver.switchTo().window(w);

				WebElement addtocart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true)", addtocart);
				js.executeScript("arguments[0].click()", addtocart);
				break;
			}
		}

//		Step 05

		File screnshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("Imahe.jpg");
		try {
			FileUtils.copyFile(screnshot, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
