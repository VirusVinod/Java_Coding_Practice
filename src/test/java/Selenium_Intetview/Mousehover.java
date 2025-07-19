package Selenium_Intetview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.askzenixtechnologies.com/");
		
		
		WebElement menuele = driver.findElement(By.xpath("//div//ul//li//a[@title='Services']"));
		Actions action = new Actions(driver);
		action.moveToElement(menuele).build().perform();

	}

}
