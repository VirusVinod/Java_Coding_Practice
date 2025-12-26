package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon10 {
	
	public static void main(String[] args) {
		
//		Step 01
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
//		Step 02
		
		WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbox.sendKeys("iphone");
		
		WebElement clicksearchboxbtn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		clicksearchboxbtn.click();
		
		
	}

}
