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

public class Amazon14 {

	public static void main(String[] args) {

//		Step 01

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//		Step 02

		WebElement searchItem = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchItem.sendKeys("iphone");

		WebElement searchbtnClick = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchbtnClick.click();

//		Step 03

		String expectedRes = "iPhone Air 512 GB: Thinnest iPhone Ever, 16.63 cm (6.5″) Display with Promotion up to 120Hz, Powerful A19 Pro Chip, Center Stage Front Camera, All-Day Battery Life; Sky Blue";
		List<WebElement> list = driver.findElements(By.xpath("//div[@data-cy='title-recipe']//a//h2"));

		for (WebElement product : list) {
			String actualProd = product.getText().trim();

			if (actualProd.equals(expectedRes)) {

				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true)", product);
				js.executeScript("arguments[0].click()", product);
				break;

			}
		}
//		Step 04

		String parentId = driver.getWindowHandle();
		Set<String> allwin = driver.getWindowHandles();

		for (String s : allwin) {
			if (!parentId.equals(s)) {
				driver.switchTo().window(s);

				WebElement addtoCart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true)", addtoCart);
				js.executeScript("arguments[0].click()", addtoCart);
				break;
			}
		}

//		Step 05

		File screnshoot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destina = new File("image.png");
		try {
			FileUtils.copyFile(screnshoot, destina);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
