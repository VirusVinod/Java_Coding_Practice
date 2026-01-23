package SeleniumPractice;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Amazon37 {
	public static void main(String[] args) {

//		Step 01

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//		Step 02
		WebElement searchItem = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchItem.sendKeys("iphone");
		WebElement clickBtnSearch = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		clickBtnSearch.click();

//		Step 03

		String expectedpage = "Results";
		WebElement restget = driver
				.findElement(By.xpath("//h2[@class='a-size-medium-plus a-spacing-none a-color-base a-text-bold']"));
		String actualPage = restget.getText().trim();
		Assert.assertEquals(expectedpage, actualPage);

//		Step 04

		String expectedProduct = "iPhone 16 Pro Max 1 TB: 5G Mobile Phone with Camera Control, 4K 120 fps Dolby Vision and a Huge Leap in Battery Life. Works with AirPods; Black Titanium";
		List<WebElement> list = driver.findElements(By.xpath("//div[@data-cy='title-recipe']//a//h2"));
		for (WebElement product : list) {
			String actualProduct = product.getText();
			if (actualProduct.equals(expectedProduct)) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true)", product);
				js.executeScript("arguments[0].click()", product);
				break;
			}
		}

//		Step 05

		String parentId = driver.getWindowHandle();
		Set<String> allWin = driver.getWindowHandles();

		for (String s : allWin) {
			if (!parentId.equals(s)) {
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
