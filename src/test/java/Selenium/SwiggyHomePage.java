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
		String URL = "https://media-assets.swiggy.com/swiggy/image/upload/fl_lossy,f_auto,q_auto,w_288,h_360/MERCHANDISING_BANNERS/IMAGES/MERCH/2024/7/2/6ef07bda-b707-48ea-9b14-2594071593d1_Biryani.png";
		List<WebElement> items = driver.findElements(By.cssSelector(".sc-kMkxaj.bzknTh"));
		for (WebElement item : items) {
			System.out.print(item);
			WebElement img = item.findElement(By.tagName("img"));
			String imageUrl = img.getDomProperty("src");
			System.out.print("Image URL: " + imageUrl);
			if (imageUrl.equals(URL)) {
				item.click();			}
		}
	}
}
