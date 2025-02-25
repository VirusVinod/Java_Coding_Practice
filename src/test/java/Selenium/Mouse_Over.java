package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Over {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
        WebElement elementToHover = driver.findElement(By.xpath("(//span[@class='_1XjE3T'])[3]")); 
        
        Actions actions = new Actions(driver);
        actions.moveToElement(elementToHover).perform(); 
//        driver.quit();
	}

}
