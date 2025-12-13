package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon5 {

	public static void main(String[] args) {

//		Step : 01
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//		Step : 02
		WebElement secarchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		secarchbox.sendKeys("Iphone");

		WebElement clcikbtn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		clcikbtn.click();

	}

}
