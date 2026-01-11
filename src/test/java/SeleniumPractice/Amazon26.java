package SeleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Amazon26 {

	public static void main(String[] args) {

//		Step 01

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//		Step 02

		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("iphone");

		WebElement searchBtnClick = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchBtnClick.click();

//		Step 03

		String ValidateNavigateExp = "Results";
		WebElement getResul = driver
				.findElement(By.xpath("//h2[@class='a-size-medium-plus a-spacing-none a-color-base a-text-bold']"));
		String actaulVlue = getResul.getText().trim();
		Assert.assertEquals(ValidateNavigateExp, actaulVlue);
		System.out.println("Expected Result : " + ValidateNavigateExp);
		System.out.println("Actual Result : " + actaulVlue);

//		Step 04

		String expectedProductName = "iPhone 15 (128 GB) - Blue";
		List<WebElement> list = driver.findElements(By.xpath("//div[@data-cy='title-recipe']//a//h2"));
		for (WebElement product : list) {

			String actualProduct = product.getText().trim();
			if (actualProduct.equals(expectedProductName)) {

				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true)", product);
				js.executeScript("arguments[0].click()", product);
				break;

			}
		}
	}

}
