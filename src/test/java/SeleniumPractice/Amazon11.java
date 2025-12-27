package SeleniumPractice;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon11 {
	public static void main(String[] args) {

//		Step: 01

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//		Step: 02

		WebElement sec = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		sec.sendKeys("iphone");

		WebElement clic = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		clic.click();

//		Step: 03

		String expectedres = "iPhone 17 Pro 256 GB: 15.93 cm (6.3″) Display with Promotion up to 120Hz, A19 Pro Chip, Breakthrough Battery Life, Pro Fusion Camera System with Center Stage Front Camera; Deep Blue";
		List<WebElement> li = driver.findElements(By.xpath("//div[@data-cy='title-recipe']//a//h2"));

		for (WebElement product : li) {

			String ProductName = product.getText().trim();

			if (ProductName.equals(expectedres)) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true)", product);
				js.executeScript("arguments[0].click()", product);
				break;

			}
		}

//		Step: 04

		String parentId = driver.getWindowHandle();
		Set<String> window = driver.getWindowHandles();

		for (String s : window) {
			if (!parentId.equals(s)) {
				driver.switchTo().window(s);

				WebElement addbtn = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true)", addbtn);
				js.executeScript("arguments[0].click()", addbtn);
				break;
			}
		}

	}

}
