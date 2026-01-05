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

public class Amazon20 {

	public static void main(String[] args) {

//		Step 01

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//		Step 02

		WebElement searchItem = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchItem.sendKeys("iphone");

		WebElement searchbtn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchbtn.click();

//		Step 03

		String expcatedValid = "Results";
		WebElement getexpactedText = driver
				.findElement(By.xpath("//h2[@class='a-size-medium-plus a-spacing-none a-color-base a-text-bold']"));
		String actualRes = getexpactedText.getText().trim();
		Assert.assertEquals(expcatedValid, actualRes);
		System.out.println("Expected Res = " + expcatedValid);
		System.out.println("Actual Res = " + actualRes);

//		Step 04

		String expectedProductName = "iPhone 15 (256 GB) - Blue";
		List<WebElement> list = driver.findElements(By.xpath("//div[@data-cy='title-recipe']//a//h2"));

		for (WebElement name : list) {
			String actualResName = name.getText().trim();

			if (actualResName.equals(expectedProductName)) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true)", name);
				js.executeScript("arguments[0].click()", name);
				break;
			}
		}

//		Step 05

		String parentId = driver.getWindowHandle();
		Set<String> allWin = driver.getWindowHandles();

		for (String w : allWin) {
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

		File screnshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("image.png");
		try {
			FileUtils.copyFile(screnshot, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
