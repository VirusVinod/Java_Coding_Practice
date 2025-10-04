package automationClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsConcept {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/guide/mouse-hover-in-selenium");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		WebElement productBtn = driver.findElement(By.xpath("//button[@id='products-dd-toggle']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(productBtn).perform();
		
		WebElement InnerApptesting = driver.findElement(By.xpath("//button[@id='products-dd-tab-3']"));
		Actions aa = new Actions(driver);
		aa.moveToElement(InnerApptesting).perform();
	}

}
