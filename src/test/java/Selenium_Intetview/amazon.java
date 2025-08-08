package Selenium_Intetview;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class amazon {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));


		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Iphone");
		
		WebElement clickbtn = driver.findElement(By.id("nav-search-submit-button"));
		clickbtn.click();
		
		String expectedaddCart = "iPhone 16 256 GB: 5G Mobile Phone with Camera Control, A18 Chip and a Big Boost in Battery Life. Works with AirPods; Black";
		List<WebElement> listdata = driver.findElements(By.xpath("//div//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal']"));
		
		for(WebElement alldata:listdata) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", alldata);

			String Expdata = alldata.getText();
			if (Expdata.equals(expectedaddCart)) {
				try {
					wait.until(ExpectedConditions.elementToBeClickable(alldata));
					alldata.click();
				} catch (ElementClickInterceptedException e) {
					js.executeScript("arguments[0].click();", alldata);
				}
				break;
			}
		}
		

	}

}
