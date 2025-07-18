package Selenium_Intetview;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDownSelect {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.askzenixtechnologies.com/contact-us");
		
		WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(15));
		
		WebElement Drop = driver.findElement(By.id("enquiry_type"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", Drop);
		wait.until(ExpectedConditions.visibilityOf(Drop));
		js.executeScript("arguments[0].click();", Drop);
		Drop.click();
		
		
		List<WebElement> dropdownlist = driver.findElements(By.xpath("//Select[@class='form-select form-control']//option"));
		for(WebElement wl : dropdownlist ) {
			String value = wl.getText();
			System.out.println(value);
			
			if(value.equals("Ecommerce Development")) {
				wl.click();
				break;
			}
			
		}
		
 
	}

}
