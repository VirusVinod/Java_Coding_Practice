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

public class Amazon34 {

	public static void main(String[] args) {

//		Step 01

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//		Step 02

		WebElement searchAndclick = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchAndclick.sendKeys("iphone", Keys.ENTER);

//		Step 03

		String ExpValidated = "Results";
		WebElement Res = driver
				.findElement(By.xpath("//h2[@class='a-size-medium-plus a-spacing-none a-color-base a-text-bold']"));
		String actuRes = Res.getText().trim();
		Assert.assertEquals(ExpValidated, actuRes);

//		Step 04

		String expectedProduct = "iPhone 16 Pro Max 1 TB: 5G Mobile Phone with Camera Control, 4K 120 fps Dolby Vision and a Huge Leap in Battery Life. Works with AirPods; Desert Titanium";
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

		String praentId = driver.getWindowHandle();
		Set<String> allWin = driver.getWindowHandles();

		for (String s : allWin) {

			if (!praentId.equals(s)) {

				driver.switchTo().window(s);
				WebElement addToclick = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true)", addToclick);
				js.executeScript("arguments[0].click()", addToclick);
				break;

			}
		}

	}

}
