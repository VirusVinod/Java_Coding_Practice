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
		String ExpectdatedFood = "restaurant curated for chinese";
		List<WebElement> elements = driver.findElements(By.xpath("//div//a[@class='sc-gtJxfw djvSuV']"));
		for (WebElement a : elements) {
			System.out.println(a.getText());
			String data = a.getText();
			if (data.equals(ExpectdatedFood)) {
				a.click();
			}
		}

//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		WebElement clickapizz = driver.findElement(By.xpath("(//div//a[@class='sc-gtJxfw djvSuV'])[3]"));
//		clickapizza.click();

	}
}
