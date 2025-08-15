package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggyHomePage {
	public static void main(String[] args) {
		SwiggyHomePage sw = new SwiggyHomePage();
		sw.home();
	}

	public void home() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");

		WebElement clickFoodDelivery = driver.findElement(By.xpath("(//div//a//img[@class='sc-bXCLTC gsiCGh'])[1]"));
		clickFoodDelivery.click();


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String expectedURL = "https://media-assets.swiggy.com/swiggy/image/upload/fl_lossy,f_auto,q_auto/PC_Mweb/Paratha.png";
		List<WebElement> items = driver.findElements(By.cssSelector(".sc-kMkxaj.bzknTh"));
		for (WebElement item : items) {
			WebElement img = item.findElement(By.tagName("img"));
			String imageUrl = img.getDomProperty("src");
			if (imageUrl.equals(expectedURL)) {
				item.click();			}
		}
	}
}
