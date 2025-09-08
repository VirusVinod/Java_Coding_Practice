package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseoverAmazonOpenProfile {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement hellosign = driver.findElement(By.xpath("//div[@id='nav-link-accountList']"));
		Actions action = new Actions(driver);
		action.moveToElement(hellosign).build().perform();
		
		
		WebElement sign = driver.findElement(By.xpath("//span[@class='nav-action-inner']"));
		sign.click();

	}

}
