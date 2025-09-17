package SeleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon1 {
	WebDriver driver;
	WebDriverWait wait;

	public static void main(String[] args) {
		Amazon1 AA = new Amazon1();
		AA.searchItem();
		

	}

	public void searchItem() {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("Iphone 17");

		WebElement searchClick = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchClick.click();
	}



}
